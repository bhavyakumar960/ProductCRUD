package src.main.java.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import src.main.java.model.Product;

@Repository
public class ProductDao {
	
	private HibernateTemplate hibernateTemplate;

	//add new  or update existing product in database
	@Transactional
	public void addProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	
	//getters and setters
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
