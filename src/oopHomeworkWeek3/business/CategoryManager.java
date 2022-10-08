package oopHomeworkWeek3.business;

import java.util.List;

import oopHomeworkWeek3.core.logging.Logger;
import oopHomeworkWeek3.dataAccess.Interface.ICategoryDao;
import oopHomeworkWeek3.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}


	public void add(Category category) throws Exception {
		
		
		for(Category ctgry : categories)  {
			if(ctgry.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category's name could not be same as others'");
			}
		}		
		
		categoryDao.add(category);
		categories.add(category);
	
    for (Logger logger : loggers) {
    	logger.log(category.getCategoryName());
    }  
        
  }	
}