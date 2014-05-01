package thymeleafexamples.gtvg.business.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendor 
{
	private Integer id = null;
    private String name = null;
    private ArrayList<Product> products = new ArrayList<Product>();
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setProducts() 
	{
		Product prod1 = new Product();
		
		prod1.setId(Integer.valueOf(1));
		prod1.setName("basil");
		prod1.setPrice(new BigDecimal("1.25"));
		prod1.setInStock(true);
		
		Product prod2 = new Product();
		
		prod2.setId(Integer.valueOf(1));
		prod2.setName("tomato");
		prod2.setPrice(new BigDecimal("2.25"));
		prod2.setInStock(true);
		
		this.products.add(prod1);
		this.products.add(prod2);
		
	}

	
	
}
