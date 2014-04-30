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
        Product prod1 = new Product();
        
        vend1.setId(Integer.valueOf(1));
        vend1.setName("Safeway");
        vend1.setProducts();
        
        this.vendorsById.put(vend1.getId(), vend1);    
        
    }
    
    public List<Vendor> findAll() {
        return new ArrayList<Vendor>(this.vendorsById.values());
    }
    
    public Vendor findById(final Integer id) {
        return this.vendorsById.get(id);
    }
    
}
