package proj;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;
//server side
@WebService
public class ServerSend {
	
	@WebMethod
	public String updateTable(int custId,double amount) throws ClassNotFoundException,SQLException{
		
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@192.168.0.16:1521:orcl";
			Connection conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println(custId);
			if(amount>0){
				
				PreparedStatement pst=conn.prepareStatement("update payment set amount_paid=amount_paid+"+amount+",current_due=current_due-"+amount+" where cust_id="+custId+"and status='active'");
			int i=pst.executeUpdate();
				System.out.println("updated rows " +i);
				return "updated/paid Successfully";
			}
			
			else{
				return "invalid amount!!! CAN'T PROCESS";
			}			
	
	}

}

