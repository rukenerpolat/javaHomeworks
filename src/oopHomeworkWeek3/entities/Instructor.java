package oopHomeworkWeek3.entities;

public class Instructor {
	
	private int id;
	private String instructorName;
	private String instructorSurname;
	
	
	
	public Instructor() {
		
	}


	public Instructor(int id, String instructorName, String instructorSurname) {
		
		this.id = id;
		this.instructorName = instructorName;
		this.instructorSurname = instructorSurname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	public String getInstructorSurname() {
		return instructorSurname;
	}


	public void setInstructorSurname(String instructorSurname) {
		this.instructorSurname = instructorSurname;
	}
	
}
