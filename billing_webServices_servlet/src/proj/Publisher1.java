package proj;

import javax.xml.ws.Endpoint;

public class Publisher1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://192.168.0.96:1008/VIEWBILL_SERVICES",new ServerSend1());
		System.out.println("server connected");
	}

}
