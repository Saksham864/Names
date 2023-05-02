package com.SchoolPractice.Service;

import com.SchoolPractice.Repository.AdminRepository;
import com.SchoolPractice.TO.ResultTO;
import com.SchoolPractice.TO.StudentTO;
import com.SchoolPractice.TO.TeacherTO;
import com.SchoolPractice.TO.UserTO;


import java.util.List;



public class 	AdminService {
	AdminRepository repository= new AdminRepository();

	
	public void blockUser(String name)
	{
		repository.blockUser(name);
	}
	public void unblockUser(String name)
	{
		repository.unblockUser(name);
	}


	

}
