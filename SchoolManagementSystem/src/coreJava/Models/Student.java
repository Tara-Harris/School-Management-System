package coreJava.Models;

/**
 * carry data related to one student
 * @author tara8
 *
 */

public class Student {
	private String email = null;
	private String name = null;
	private String pass = null;
	public Student () {
		this.email = null;
		this.name = null;
		this.pass = null;
	}
/**
 * used to update student email, name and password
 * @param email
 * @param name
 * @param pass
 */
	public Student(String email, String name, String pass) {
		super();
		this.email = email;
		this.name = name;
		this.pass = pass;
		
		
	}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
	
	

   
    }

