package proj;

import static org.junit.Assert.*;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

ServerSend ss;

@Before
public void start(){
	ss=new ServerSend();	
}

@Test
public void testing_pst_execution() throws SQLException,ClassNotFoundException{
	String actual;	
	actual = ss.updateTable(102, 50);
	assertEquals("updated/paid Successfully", actual);
}

@After
public void endMethod(){
}

}
