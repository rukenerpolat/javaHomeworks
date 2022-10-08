package oopHomeworkWeek3;

import java.util.ArrayList;
import java.util.List;

import oopHomeworkWeek3.business.CategoryManager;
import oopHomeworkWeek3.business.CourseManager;
import oopHomeworkWeek3.business.InstructorManager;
import oopHomeworkWeek3.core.logging.DatabaseLogger;
import oopHomeworkWeek3.core.logging.FileLogger;
import oopHomeworkWeek3.core.logging.Logger;
import oopHomeworkWeek3.core.logging.MailLogger;
import oopHomeworkWeek3.dataAccess.HibernateDao.HibernateCourseDao;
import oopHomeworkWeek3.dataAccess.HibernateDao.HibernateInstructorDao;
import oopHomeworkWeek3.dataAccess.JdbcDao.JdbcCategoryDao;
import oopHomeworkWeek3.entities.Category;
import oopHomeworkWeek3.entities.Course;
import oopHomeworkWeek3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		Course course1 = new Course(1, "Java2022", 0);
		//Course course2 = new Course(2, "Java2022", 0);
		
		List<Course> courseDb = new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(courseDb, new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		//courseManager.add(course2);

		
		System.out.println("----------------------------------------------------------");
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Programlama");
		
		List<Category> categoryDb = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryDb);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		System.out.println("----------------------------------------------------------");
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	
	}
}