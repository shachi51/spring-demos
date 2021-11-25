package com.acc.beanLife.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;
	Connection con;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		System.out.println("setting driver");
		this.driver = driver;
	}
	public String getUrl() {
		
		return url;
	}
	public void setUrl(String url) {
		System.out.println("setting url");
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("setting username");
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside custom init ");
		createConnection();
	}
	public void createConnection() throws ClassNotFoundException, SQLException {
		//load driver
		System.out.println("creating connection");
		Class.forName(driver);
				
		//get a connection
		con = DriverManager.getConnection(url, userName, password);
	}
	
	public void selectAllRows() throws ClassNotFoundException, SQLException{
		
		//createConnection();
		//execute code
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM abc.hostel");
		
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelfees = rs.getDouble(3);
			String foodtype = rs.getString(4);
			
			System.out.println(studentId+" "+studentName+" "+hostelfees+" "+foodtype);
			
		}
		
	}
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
		
		//createConnection();
				//execute code
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("delete from abc.hostel where serial ="+studentId);
				System.out.println("record deleted with serial number"+studentId);		
				
	}
	
	//@PreDestroy
	public void closeConnection() throws SQLException{
		System.out.println("calling close method");
		con.close();
	}
}
