package oopHomeworkWeek3.dataAccess.HibernateDao;

import oopHomeworkWeek3.dataAccess.Interface.IInstructorDao;
import oopHomeworkWeek3.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi!");
		
	}

}
