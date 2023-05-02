package com.SchoolPractice.Service;

import com.SchoolPractice.Repository.StudentRepository;
import com.SchoolPractice.TO.ResultTO;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;


import java.util.List;



public class StudentService {
	StudentRepository repository= new StudentRepository();

	

	public List<StudentTO> getAllStudents() {

		return repository.findAll();
	}
	
	public void deleteUser(String username)
	{
		repository.deleteStudent(username);
	}
	public void updateUser(String oldname, String username, int id)
	{
		repository.updateStudent(oldname, username, id);
	}
	public List<StudentTO> findStudent(String username)
	{
		return repository.findStudent(username);
	}
//	public List<ResultTO>listResult(String username)
//	{
//		List<ResultTO> results=repository.fetchResult(username);
//		
//		for(ResultTO result:results)
//		{
//			System.out.println(result.getUsername()+" "+ result.getPercentage()+" "+ result.getStatus());
//		}
//		
//		return results;
//	}
}
