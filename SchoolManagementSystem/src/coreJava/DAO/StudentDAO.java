package coreJava.DAO;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import coreJava.Models.Student;

public class StudentDAO {
   // private static final List<Student> Student;

	public List<Student>  getStudents(){
    	//method reads the Student's csv file and returns the data as a List
		List<Student> studentList = null;
    	try {
    		
    		String location= "C:\\Users\\tara8\\eclipse-workspace\\SchoolManagementSystem\\src\\students.csv";
    		File file=new File (location);
    		Scanner input=new Scanner(file);
    		studentList= new ArrayList <Student>();
    		while(input.hasNextLine()) {
    			String [] line = input.nextLine().split(",");
    			studentList.add(new Student (line [0], line [1], line [2]));
    			
			}	
    		
		input.close();
    				
			} catch (FileNotFoundException e) {
				
				System.out.println("File not found!");
				e.printStackTrace();
			}
		return studentList;
	}
		
    
    

/*This method takes a Student’s email as a String and the List of Students as an ArrayList 
 * and parses the List for a Student with that email and returns a Student Object. */
	public Student getStudentByEmail(List<Student> studentList, String studentEmail){
		Student s1 = new Student ();
             for (Student s : studentList) {
              if(s.getEmail().equals(studentEmail)){
            	  s1.setEmail(studentEmail); 
            	  s1.setName(s.getName());
            	  s1.setPass(s.getPass());
            	  break;
              }
             }
             return s1;
              }
       
             
/* 	
validateUser – This method takes the List of Students and two other parameters: 
the first one is the user email and the second one is the password from the user input. 
Return whether or not a student was found */
	
    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
		
		 for (Student s : studentList) {
             if(s.getEmail().equals(studentEmail) && (s.getPass().equals(studentPass))){
         return true;
            }
             
		 }
		 return false;
    }
}



	


