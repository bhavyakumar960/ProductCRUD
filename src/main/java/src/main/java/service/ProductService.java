package src.main.java.service;

import java.util.List;

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
	
	//sending req of get a single product to ProductDao class
	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}
	
	//sending req of get all products to ProductDao class
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	
	//sending req of delete product to ProductDao class
		public void deleteProduct(int id) {
			productDao.deleteProduct(id);
		}
		
	//getters and setters
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	
}
