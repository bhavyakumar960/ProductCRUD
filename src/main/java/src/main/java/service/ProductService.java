package src.main.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.dao.ProductDao;
import src.main.java.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	//sending req of add product to ProductDao class
	public void createProduct(Product product) {
		productDao.addProduct(product);
	}
	
	//getters and setters
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	
}
