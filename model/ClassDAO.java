package com.exeter.model;

import java.sql.ResultSet;

public interface ClassDAO {
	public void connectDB();

	public boolean verifyLogin(String email, String password);

	public void saveReg(String id, String name, String subject1, String subject2, String subject3, String subject4,
			String subject5);

	public ResultSet readAllReg();

	public void UpdateRegistration(String id, String subject1, String subject2, String subject3, String subject4,
			String subject5);

	public void deleteRegistration(String id);
}
