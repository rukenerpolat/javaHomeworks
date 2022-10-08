package oopHomeworkWeek3.business;

import oopHomeworkWeek3.core.logging.Logger;
import oopHomeworkWeek3.dataAccess.Interface.IInstructorDao;
import oopHomeworkWeek3.entities.Instructor;

public class InstructorManager {
	
	private IInstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		
		for (Logger logger : loggers) {
	    	logger.log(instructor.getInstructorName() + " " + instructor.getInstructorSurname());
	    }
	}

}
