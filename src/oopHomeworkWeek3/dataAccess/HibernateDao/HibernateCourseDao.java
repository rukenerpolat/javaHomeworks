package oopHomeworkWeek3.dataAccess.HibernateDao;

import oopHomeworkWeek3.dataAccess.Interface.ICourseDao;
import oopHomeworkWeek3.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}
}
