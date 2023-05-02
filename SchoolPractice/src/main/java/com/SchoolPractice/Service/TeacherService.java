package com.SchoolPractice.Service;

import com.SchoolPractice.Repository.TeacherRepository;
import com.SchoolPractice.TO.ResultTO;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;


import java.util.List;



public class TeacherService {
	TeacherRepository repository= new TeacherRepository();

	
	public List<TeacherTO> findTeacher(String username)
	{
		return repository.findStudent(username);
	}
	public void updateTeacher(String oldname, String username, int id)
	{
		repository.updateTeacher(oldname, username, id);
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
