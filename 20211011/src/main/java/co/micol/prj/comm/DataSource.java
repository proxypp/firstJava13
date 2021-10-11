package co.micol.prj.comm;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource { //싱글턴 클래스의 가장 기본. // DAO data access object. //2번째
	private static DataSource dataSource = new DataSource();
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	private DataSource() { // singleton class로 외부에서 생성자를 만들지 못하게함. private 로 한다.
		config();
	}
	public static DataSource getInstace() {
		return dataSource;
	}
	
	private void config() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	public Connection getConnection() {
//		config();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
