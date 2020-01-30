package coreJava.DAO;

import coreJava.Models.Attending;
import coreJava.Models.Course;
import coreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * used to query the database for attending information
 * 
 * @author tara8
 *
 */
public class AttendingDAO {
	/**
	 * getAttending –
	 * This method reads the Attending.csv file and returns the data as a List
	 * @return
	 */
	public List<Attending> getAttending() {
		List<Attending> attendingList = null;
		String[] Line = null;
		try {
			String location= "C:\\Users\\tara8\\eclipse-workspace\\SchoolManagementSystem\\src\\attending.csv";
			File file=new File (location);
			Scanner input=new Scanner(file);
			attendingList =new ArrayList <Attending>();
			while(input.hasNext()) {
				 Line = input.nextLine().split(",");
					attendingList.add(new Attending(Integer.parseInt(Line[0]), Line [1]));
			}	
			//for (String []Line:attendingList) {
				//System.out.println(line[0]+ " | "+  line[1]+ " | "+line[2]+ " | ");
				
			
			
		
			
			} catch (FileNotFoundException e) {
				
				System.out.println("File not found!");
				e.printStackTrace();
			}
		return attendingList;

	}
	/**
	 * method takes student's email and course ID.  
	 * Checks if a student with that email is currently attending a course with that ID
	 * if attending that course add a new attending object with the studen'ts email and course id to the list
	 * 
	 * @param attending
	 * @param studentEmail
	 * @param courseID
	 */
	
	public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID) {
		//Attending a1  = new Attending()
		
		int found = 0;
				for(Attending a:attending) {
					if(a.getStudentEmail().equals (studentEmail)&& a.getCourseID()==courseID) {
						found++;
					}
	}
				if(found==0) { //then add
					attending.add(new Attending(courseID, studentEmail));
				}
				if(found ==1 ) {
					System.out.println("Already registered m");
				}
				
				
	}		
	
	/**
	 * method takes a student's email as a parameter and would search the 
	 * attending list for all the courses a student is register to based on ID
	 * each is added to a new list of courses.  This list of courses the student is attending is returned
	 * @param courseList
	 * @param attending
	 * @param studentEmail
	 * @return
	 */
	public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail) {
		
		List<Course> studentCourse = new ArrayList<Course>();
		for(Attending a:attending) {
			if(studentEmail.equals(a.getStudentEmail())) {
				for (Course C: courseList) {
					if(a.getCourseID() == (C.getcourseID())){
						studentCourse.add(new Course(C.getcourseID(), C.getName(), C.getInstructor()));
			}
				
			}	
			}
		}
		return studentCourse;
	}
	
	

	/**
	 * mgetAllCourses – This method takes no parameter and returns every Course in the table
	 * @param attending
	 */
	public void saveAttending(List<Attending> attending) {

		String location= "C:\\Users\\tara8\\eclipse-workspace\\SchoolManagementSystem\\src\\attending.csv";
		  File file = new File (location);
			try {	  
		  FileWriter writer = new FileWriter(file, false);
				  for(int i =0; i<attending.size(); i++) {
			  
		    writer.write(attending.get(i).getCourseID()+ "," + attending.get(i).getStudentEmail() + "\n");
				  }
		    System.out.println("Course added");
		    writer.close();
	}catch(Exception e) {
			System.out.println("You are already registered to this course");
	}
	}
	}
			
			

