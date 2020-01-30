package coreJava.Models;

/**
 * carry data related to which students are attending which courses
 * @author tara8
 *
 */
public class Attending {
	int CourseID = 0;
	String StudentEmail = null;
	
	
	/**
	 * updates student course information:  ID, email
	 * @param courseID
	 * @param studentEmail
	 */
	

    public Attending(int courseID, String studentEmail) {
		super();
		this.CourseID = courseID;
		this.StudentEmail = studentEmail;
	}


	public int getCourseID() {
		return CourseID;
	}


	public void setCourseID(int courseID) {
		CourseID = courseID;
	}


	public String getStudentEmail() {
		return StudentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}

	

    
}
