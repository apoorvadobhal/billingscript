package proj;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerSend1 {
	int custId;
	@WebMethod
	public String updateTable(int custId){
		custId=this.custId;
		return "Success";
	}
	
	public int viewBill(){
		return custId;
	}
}
