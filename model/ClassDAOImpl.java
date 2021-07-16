package com.exeter.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassDAOImpl implements ClassDAO {
	private Connection con;
	private Statement stmnt;
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","Lisha","Lishapriya@07");
			stmnt=con.createStatement();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet resultSet = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return resultSet.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	@Override
	public void saveReg(String id, String name, String subject1, String subject2, String subject3, String subject4,
			String subject5) {
		try {
			stmnt.executeUpdate("insert into marksheet values('"+id+"','"+name+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet readAllReg() {
		try {
			ResultSet resultSet = stmnt.executeQuery("select * from marksheet ");
			return resultSet;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	@Override
	public void UpdateRegistration(String id, String subject1, String subject2, String subject3, String subject4,
			String subject5) {
		try {
			stmnt.executeUpdate("update marksheet set Subject_1='"+subject1+"',Subject_2='"+subject2+"',Subject_3='"+subject3+"',Subject_4='"+subject4+"',Subject_5='"+subject5+"', where StudentID='"+id+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void deleteRegistration(String id) {
		try {
			stmnt.executeUpdate("delete from marksheet where StudentID='"+id+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
