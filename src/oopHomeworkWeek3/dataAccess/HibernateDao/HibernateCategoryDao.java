package oopHomeworkWeek3.dataAccess.HibernateDao;

import oopHomeworkWeek3.dataAccess.Interface.ICategoryDao;
import oopHomeworkWeek3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi!");
		
	}

}
