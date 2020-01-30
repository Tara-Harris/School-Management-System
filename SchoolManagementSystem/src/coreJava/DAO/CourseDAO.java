package coreJava.DAO;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreJava.Models.Attending;
import coreJava.Models.Course;
import coreJava.Models.Student;

public class CourseDAO {
    public List<Course> getAllCourses(){
		/*
		 * getAllCourses – This method takes no parameter and returns every Course in
		 * the table
		 */
    	List<Course> courseList = null;
    	String[] Line = null;
    	try {
    	String location= "C:\\Users\\tara8\\eclipse-workspace\\SchoolManagementSystem\\src\\courses.csv";
    	File file=new File (location);
		Scanner input=new Scanner(file);
		courseList= new ArrayList <Course>();
		while(input.hasNext()) {
		 Line = input.nextLine().split(",");
		 courseList.add(new Course(Integer.parseInt(Line[0]), Line [1], Line [2]));
			
		}	
		input.close();
		//for (Course course :courseList) {
		//pSystem.out.format("%-15s| %-15s | %-15s\n", course.getcourseID(), course.getName(), course.getInstructor());
				
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found!");
			e.printStackTrace();
		}
	return courseList;
}
    
  
    
}




