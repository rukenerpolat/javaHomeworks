package oopHomeworkWeek3.dataAccess.JdbcDao;

import oopHomeworkWeek3.dataAccess.Interface.ICategoryDao;
import oopHomeworkWeek3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi!");
		
	}
}
