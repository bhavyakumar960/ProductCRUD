package src.main.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import src.main.java.model.Product;
import src.main.java.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	//getters and setters
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	//---------------------------------------Handling requests------------------------------------------------------
	
	//show all product form
	@RequestMapping("/")
	public String display(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "index";
	}
	
	//show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	//adding product
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product) {
		RedirectView redirectView = new RedirectView();
		this.productService.createProduct(product);
		redirectView.setUrl("/");
		return redirectView;
	}
	
	//deleting a product
	@RequestMapping("/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id") int id) {
		this.productService.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/");
		return redirectView;
	}
	
	//show updating form
	@RequestMapping("/update/{id}")
	public String updateProduct(@PathVariable("id") int id,Model m) {
		Product product = this.productService.getProduct(id);
		m.addAttribute("title", "Update Product");
		m.addAttribute("product",product);
		return "update_product_form";
	}
		
	//updating product
	@RequestMapping(value="/update-product",method = RequestMethod.POST)
	public RedirectView updateProduct(@ModelAttribute Product product) {
		RedirectView redirectView = new RedirectView();
		System.out.println(product);
		this.productService.createProduct(product);
		redirectView.setUrl("/");
		return redirectView;
	}
}
