package proj;

import javax.xml.ws.Endpoint;



public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.0.96:1007/proj/PAYMENT_SERVICES",new ServerSend());
	System.out.println("server connected");
	}
}


