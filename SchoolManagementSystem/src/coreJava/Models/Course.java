
package coreJava.Models;

/**
 * carry data related to one course
 * @author tara8
 *
 */
public class Course {
	private int courseID = 0;
	private String name = null;
	private String instructor = null;
	//public String List = null;

    /**
     * used to update student course information:  courseID, name, and instructor
     * @param line
     * @param name
     * @param instructor
     */
	
	
	public Course(int courseID, String name, String instructor) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.instructor = instructor;
	}


	


	public int getcourseID() {
		return courseID;
	}


	public void setcourseID(int iD) {
		courseID = courseID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInstructor() {
		return instructor;
	}


	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	

	

	

}
