package oopHomeworkWeek3.dataAccess.JdbcDao;

import oopHomeworkWeek3.dataAccess.Interface.IInstructorDao;
import oopHomeworkWeek3.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile eklendi!");
		
	}

}
