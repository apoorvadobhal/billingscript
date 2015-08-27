package ws3;

import javax.jws.WebService;

@WebService(endpointInterface="ws3.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
//step2..
	
	@Override
	public double discountCalc(double amt,double disc) {
		
		return disc*amt/100;
	}

}
