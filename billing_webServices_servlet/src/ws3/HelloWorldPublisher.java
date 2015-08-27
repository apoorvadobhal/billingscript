package ws3;

import javax.xml.ws.Endpoint;



public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.0.96:1002/ws3/greet",new HelloWorldImpl());
	System.out.println("server connected");
	}

}
