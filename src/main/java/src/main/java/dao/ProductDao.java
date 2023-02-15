package src.main.java.dao;

import java.util.List;

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
	
	//get all products
	public List<Product> getAllProducts(){
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//get a single product
	public Product getProduct(int id) {
		return hibernateTemplate.get(Product.class,id);
	}
	
	//delete a product
	@Transactional
	public void deleteProduct(int id) {
		Product product = getProduct(id);
		hibernateTemplate.delete(product);
	}
	
	//getters and setters
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
