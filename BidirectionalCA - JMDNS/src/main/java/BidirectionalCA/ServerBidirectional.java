package BidirectionalCA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import BidirectionalCA.ReferenceLetterGrpc.ReferenceLetterImplBase;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jmDNSBiDi.SimpleServiceRegistration;

public class ServerBidirectional extends ReferenceLetterImplBase{
	
	
	
public static void main(String[]args) throws IOException, InterruptedException {
	
	      //  ServerBidirectional serverBD = new ServerBidirectional();

	    	int port = 50051;
			String service_type = "_grpc._tcp.local.";
			String service_name = "GrpcServer";
			SimpleServiceRegistration ssr = new SimpleServiceRegistration();
			ssr.run(port, service_type, service_name);


			            try {

			 
			                  Server server = ServerBuilder.forPort(port)
			                            .addService((BindableService) new GetReferenceLetterImpl())
			                            .build();
			                    //server started
			                    server.start();
			                    System.out.println("Server started on Port number: " +port);

			 

			                    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			                        System.out.println("Received Shutdown Request");
			                        server.shutdown();
			                        System.out.println("Successfully stopped the server");
			                    }));

			                    server.awaitTermination();


			            } catch (IOException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            } catch (InterruptedException e) {
			                // TODO Auto-generated catch block
			                e.printStackTrace();
			            }

			        }// end of Main method
        
			        
			    
	/*		Server server;
		
	Runtime.getRuntime().addShutdownHook(new Thread(()->{// this is the code included to handle shutdown
			System.out.println("Received Shutdown request");
			server.shutdown();
			System.out.println("Successfully stopped  the server");
			
				try {
					server.awaitTermination();// to prevent the server to run endlessly
				} catch (InterruptedException e) {
					System.out.println("The server termination was interrupted");
					e.printStackTrace();
				}
			
		}));*/
	

	// SERVER IMPLEMENTATION (Abstract class with the methods)
	static class GetReferenceLetterImpl extends ReferenceLetterGrpc.ReferenceLetterImplBase{
		// creating requestObserver
	public StreamObserver<ReferenceLetterRequest> getReferenceLetter(StreamObserver<ReferenceLetterResponse> responseObserver){
		
		StreamObserver<ReferenceLetterRequest> requestObserver = new StreamObserver<ReferenceLetterRequest>() {
		 

			@Override
			public void onNext(ReferenceLetterRequest value) {
				// Every time the server receive a message,it will send a response
				System.out.println("message received:" + value.getCourse() + value.getLanguage());
				String confirmation = "Hello, the certification of the course is confirmed "+ value.getLanguage();
				// build the response
				//ReferenceLetterResponse response = ReferenceLetterResponse.newBuilder()
				//		.setConfirmation(confirmation).build();
				//responseObserver.onNext(response);
				System.out.println(confirmation);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				ReferenceLetterResponse.Builder response = ReferenceLetterResponse.newBuilder();
				response.setConfirmation("Streaming now completed");
				responseObserver.onNext(response.build());
				responseObserver.onCompleted();
				
			}
		};// end of requestObserver
			return requestObserver;
		}// end of public StreamObserver
	}// end of ReferenceLetterImpl 
}// end of Server class



