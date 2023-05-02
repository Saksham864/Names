package com.SchoolPractice.Service;

import com.SchoolPractice.Repository.UserRepository;
import com.SchoolPractice.TO.ResultTO;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;

import java.util.List;



public class UserService {
	UserRepository repository= new UserRepository();

	public void registerStudent(StudentTO student, UserTO user) {

		repository.RegisterStudent(student, user);
	}

	public void registerTeacher(TeacherTO teacher, UserTO user) {

		repository.RegisterTeacher(teacher, user);
	}

	public UserTO login(String username, String password) {

		return repository.findUser(username, password);
	}
	
	public List<UserTO> findUser()
	{
	   return repository.findUser();
	}
	
	public void deleteUser(String username)
	{
		repository.deleteUser(username);
	}
	public void updateUser(String oldname, String username, int id)
	{
		repository.updateUser(oldname, username, id);
	}
	
}
