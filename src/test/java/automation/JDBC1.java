package automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC1 {
	
	@Test

	public void test()throws Exception {
		
		Connection connection = DriverManager.getConnection("https://javarevisited.blogspot.com/2016/09/javasqlsqlexception-no-suitable-driver-mysql-jdbc-localhost.html#axzz7ofNN5LoL","root","root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("delete from plugins where plugin_name='binlog'");
		
		connection.close();
		
	}
		
	}

