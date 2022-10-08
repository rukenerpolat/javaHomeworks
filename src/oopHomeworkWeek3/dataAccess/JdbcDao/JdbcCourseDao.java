package oopHomeworkWeek3.dataAccess.JdbcDao;

import oopHomeworkWeek3.dataAccess.Interface.ICourseDao;
import oopHomeworkWeek3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course courses) {
		System.out.println("JDBC ile veritabanına eklendi");		
	}

}
