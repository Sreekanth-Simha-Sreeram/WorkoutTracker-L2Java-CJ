package com.workout.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class LoginServiceDaoImpl implements LoginServiceDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void signUp(String userName, String userPassword, String userEmail) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		//		Write your code here	
		return false;
	}

	public void forgotPassword(String userEmail) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

	public void resetPassword(String newPassword, String username) {
		// TODO Auto-generated method stub
		//		Write your code here	
	}

	public void logOut(int userId) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

}
