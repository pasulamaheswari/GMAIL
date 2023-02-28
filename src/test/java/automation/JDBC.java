package automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class JDBC {
	
	@Test
	
	
	public void test()throws Exception {
		
		Connection connection = DriverManager.getConnection("https://javarevisited.blogspot.com/2016/09/javasqlsqlexception-no-suitable-driver-mysql-jdbc-localhost.html#axzz7ofNN5LoL","root","root");
		
		java.sql.Statement statement = connection.createStatement();
		
	ResultSet resultSet = statement.executeQuery("Select * from plugins");
	
	while(resultSet.next()) {
		
		System.out.print(resultSet.getString(1)+"\t");
		
		System.out.print(resultSet.getString(2)+"\t");
		
		System.out.print(resultSet.getString(3)+"\t");
		
		System.out.println(resultSet.getString(4));
		
		
	}
	
	connection.close();
		
	
	}

}
