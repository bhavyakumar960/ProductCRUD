package src.main.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("/")
	public String display() {
		return "index";
	}
	
	//show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product) {
		RedirectView redirectView = new RedirectView();
		this.productService.createProduct(product);
		redirectView.setUrl("/");
		return redirectView;
	}
}
