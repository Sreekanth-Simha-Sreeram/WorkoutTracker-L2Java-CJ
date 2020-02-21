package com.workout.hibernate.dao;


import java.sql.Time;

import java.util.Date;
import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;

public class UserServiceDaoImpl implements UserServiceDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addWorkout(WorkoutCollection workoutCollection) {
		// TODO Auto-generated method stub
		//		Write your code here

	}

	public void editWorkout(int workoutId) {
		// TODO Auto-generated method stub
		//		Write your code here	
	}

	public void deleteWorkout(int workoutId) {
		// TODO Auto-generated method stub
		//		Write your code here	
	}

	public List<WorkoutCollection> viewWorkout(int userId) {
		// TODO Auto-generated method stub
		//		Write your code here	
		return null;
	}

	public void addCategory(WorkoutCategory workoutCategory) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

	public void editCategory(int categoryId) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

	public List<WorkoutCategory> viewCategory(int userId) {
		// TODO Auto-generated method stub
		//		Write your code here	
		return null;
	}
	
	public void startWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		//		Write your code here	
		
	}

	public void endWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		//		Write your code here	
		
	}
	
	public void generateReport(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		//		Write your code here	

	}

}
