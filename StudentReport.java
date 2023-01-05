package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
	public String findGrades(Student studentObject) {
		int sum=0;
		for(int i:studentObject.getMarks()) {
			sum=sum+i;
			if(i<35)
				return "F";
		}
		if(sum<150)
			return "C";
		else if(sum<200)
			return "B";
		else if(sum<250)
			return "A";
		else
			return "A+";
	}
	public String Validate(Student s) throws NullNameException,
											NullMarksArrayException,
											NullStudentObjectException 
	{
		if(s==null)
			throw new NullStudentObjectException("Student Object is null");
		else if(s.getName()==null)
			throw new NullNameException("Student name is null");
		else if(s.getMarks()==null)
			throw new NullMarksArrayException("Marks Array is null");
	return "";
	}
}
