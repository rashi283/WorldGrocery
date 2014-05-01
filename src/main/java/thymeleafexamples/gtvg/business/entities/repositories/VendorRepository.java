package thymeleafexamples.gtvg.business.entities.repositories;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import thymeleafexamples.gtvg.business.entities.Comment;
import thymeleafexamples.gtvg.business.entities.Product;
import thymeleafexamples.gtvg.business.entities.Vendor;

public class VendorRepository 
{
    private static final VendorRepository INSTANCE = new VendorRepository();
    private final Map<Integer,Vendor> vendorsById;
    
    public static VendorRepository getInstance() 
    {
        return INSTANCE;
    }
     
    private VendorRepository() 
    {
        super();
        
        this.vendorsById = new LinkedHashMap<Integer, Vendor>();
        
        final Vendor vend1 = new Vendor();
        vend1.setId(Integer.valueOf(1));
        vend1.setName("Safeway");
        //vend1.setProducts();
        this.vendorsById.put(vend1.getId(), vend1); 
        
        //
        final Product prod1 = new Product();
        prod1.setId(Integer.valueOf(1));
        prod1.setName("basil");
        prod1.setPrice(new BigDecimal("1.25"));
        prod1.setInStock(true);
        
        vend1.getProducts().add(prod1);
        
        final Product prod2 = new Product();
        prod2.setId(Integer.valueOf(1));
        prod2.setName("tomato");
        prod2.setPrice(new BigDecimal("2.25"));
        prod2.setInStock(true);
        
        vend1.getProducts().add(prod2);
        //
        
//        final Vendor vend2 = new Vendor();
//        vend2.setId(Integer.valueOf(2));
//        vend2.setName("Trader Joe");
//        vend2.setProducts();
//        this.vendorsById.put(vend2.getId(), vend2);    
//        
//        final Vendor vend3 = new Vendor();
//        vend3.setId(Integer.valueOf(3));
//        vend3.setName("Whole Foods");
//        vend3.setProducts();
//        this.vendorsById.put(vend3.getId(), vend3);    
//        
//        final Vendor vend4 = new Vendor();
//        vend4.setId(Integer.valueOf(4));
//        vend4.setName("Sprouts");
//        vend4.setProducts();
//        this.vendorsById.put(vend4.getId(), vend4);  
//        
//        final Vendor vend5 = new Vendor();
//        vend5.setId(Integer.valueOf(5));
//        vend5.setName("Target");
//        vend5.setProducts();
//        this.vendorsById.put(vend5.getId(), vend5);  
        
    }
    
    public List<Vendor> findAll() {
        return new ArrayList<Vendor>(this.vendorsById.values());
    }
    
    public Vendor findById(final Integer id) {
        return this.vendorsById.get(id);
    }
    
}
