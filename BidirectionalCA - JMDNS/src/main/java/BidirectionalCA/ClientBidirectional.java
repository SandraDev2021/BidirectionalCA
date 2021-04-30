package BidirectionalCA;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import jmDNSBiDi.SimpleServiceDiscovery;


public class ClientBidirectional  {
	
	public static void main(String[] args) {
		System.out.println("Hello, I'm a gRPC client");
		
		// creating an object / instance of the ClientBiDi
		ClientBidirectional clientBiDi = new ClientBidirectional();
		clientBiDi.run();

	}// end of main method
	
	// method run creation
	private void run() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		// inside the method run, we can call another functions
		// if we don't want to call these methods, we comment them
		//doClientUnaryCall(channel);
		//doClientForServerStreamingCall(channel);
		//doClientForClientStreamingCall(channel);// creating the method ClientForClientStreaming
		doClientBidirectionalCall(channel); // Creating the method ClientBiDi (Bidirectional)
		//Discovery service
		ServiceInfo serviceInfo;
		String service_type = "_ReferenceLetter_.tcp.local.";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		int port =50051; //serviceInfo.getPort();
		String host = "localhost";
		
	}// end of run method

	// creating the method doClientBiDi - Bidirectional
	private void doClientBidirectionalCall(ManagedChannel channel) {
		//create an asynchronous client
		ReferenceLetterGrpc.ReferenceLetterStub asyncBiDi = ReferenceLetterGrpc.newStub(channel);
		
		// create the latch - instantiate it
		CountDownLatch latch = new CountDownLatch(1);
	
		// creating the requestObserver using the asynchronous client object
		StreamObserver<ReferenceLetterRequest> requestObserver = asyncBiDi.getReferenceLetter(new StreamObserver<ReferenceLetterResponse>() {
				
			
			@Override
			public void onNext(ReferenceLetterResponse value) {
				// Every time the client get a response from the server
				//System.out.println("Response from the server:" + value.getConfirmation());
				
			}

			@Override
			public void onError(Throwable t) {
				latch.countDown();
				
			}

			@Override
			public void onCompleted() {
				System.out.println("Server is done sending data");
				latch.countDown();
				
			}
			
		});
		try {	
			
			requestObserver.onNext(ReferenceLetterRequest.newBuilder().setCourse("I would like to get a reference letter regarding the Door Security course").build());
			requestObserver.onNext(ReferenceLetterRequest.newBuilder().setLanguage("in English").build());// this construction is not giving me an output
				
			
			requestObserver.onCompleted();// when the client is done with the requests
			
		Thread.sleep(1000);//wait 0,1 seconds for the next
			
			latch.await(3L,TimeUnit.SECONDS);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

}

}// end of class ClientBidirectional
