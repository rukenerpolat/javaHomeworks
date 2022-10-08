package oopHomeworkWeek3.business;

import java.util.List;

import oopHomeworkWeek3.core.logging.Logger;
import oopHomeworkWeek3.dataAccess.Interface.ICourseDao;

import oopHomeworkWeek3.entities.Course;

public class CourseManager {
	
	private List<Course> courses;
	private ICourseDao courseDao;
	private Logger[] loggers;
	

	public CourseManager(List<Course> courses, ICourseDao courseDao, Logger[] loggers) {
		
		this.courses = courses;
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice()<0) {
			throw new Exception ("Ürün fiyatı 0 dan küçük olamaz");
		}
		

		for(Course crs : courses) {
			if(crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course's name could not be same as others'");
			}
		}
		
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}		
	}
}
