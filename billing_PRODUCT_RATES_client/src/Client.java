import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.tempuri.ArrayOfProductRate;
import org.tempuri.GetAllProducts;
import org.tempuri.GetAllProductsSoap;
import org.tempuri.ProductRate;



//import org.tempuri.Service1Soap;

public class Client {
	public static void main(String[] args) {
		GetAllProducts ss = new GetAllProducts();
		GetAllProductsSoap ss1 = ss.getGetAllProductsSoap();
		List<ArrayOfProductRate> L = new ArrayList<ArrayOfProductRate>();
		ArrayOfProductRate apr = ss1.getProductRates();
		/*
		 * System.out.println(ss1.getProductRates());
		 */
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@192.168.0.146:1521:orcl";
				Connection conn=DriverManager.getConnection(url, "hr", "hr");
				Statement st=conn.createStatement();
			st.executeUpdate("delete from product_rates");
				
				
				PreparedStatement pst=conn.prepareStatement("insert into product_rates values(?,?,?,?,?)");
				List<ProductRate> l = apr.getProductRate();
				
				for (Iterator it = l.iterator(); it.hasNext();) {
					ProductRate p = (ProductRate) it.next();
					pst.setString(1, p.getProductID());
					pst.setBigDecimal(2, p.getRate());
					XMLGregorianCalendar gr= p.getRateEffDate();
					GregorianCalendar gc=gr.toGregorianCalendar();
					java.sql.Date date = new java.sql.Date(gc.getTimeInMillis());
					pst.setDate(3,date );
					XMLGregorianCalendar gr1= p.getRateEndDate();
					GregorianCalendar gc1=gr1.toGregorianCalendar();
					java.sql.Date date1 = new java.sql.Date(gc1.getTimeInMillis());
					pst.setDate(4,date1 );
					pst.setString(5, p.getStateCode());
					pst.execute();
					}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
}
