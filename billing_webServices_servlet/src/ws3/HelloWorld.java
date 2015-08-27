package ws3;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//this is service end-point interface..SEI
//Step1
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld {
	@WebMethod
	public double discountCalc(double amt,double discount);
	
	
}
