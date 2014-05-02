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
        
        //Vendor1
        final Vendor vend1 = new Vendor();
        vend1.setId(Integer.valueOf(1));
        vend1.setName("Safeway");
        
        final Product prod11 = new Product();
        prod11.setId(Integer.valueOf(11));
        prod11.setName("basil");
        prod11.setPrice(new BigDecimal("1.25"));
        prod11.setInStock(true);
        vend1.getProducts().add(prod11);
        
        final Product prod12 = new Product();
        prod12.setId(Integer.valueOf(12));
        prod12.setName("tomato");
        prod12.setPrice(new BigDecimal("2.25"));
        prod12.setInStock(true);
        vend1.getProducts().add(prod12);
        
        this.vendorsById.put(vend1.getId(), vend1); 
        
        //Vendor2
        final Vendor vend2 = new Vendor();
        vend2.setId(Integer.valueOf(2));
        vend2.setName("Trader Joe");
        
        final Product prod21 = new Product();
        prod21.setId(Integer.valueOf(21));
        prod21.setName("thyme");
        prod21.setPrice(new BigDecimal("3.25"));
        prod21.setInStock(true);
        vend2.getProducts().add(prod21);
        
        final Product prod22 = new Product();
        prod22.setId(Integer.valueOf(21));
        prod22.setName("potato");
        prod22.setPrice(new BigDecimal("4.25"));
        prod22.setInStock(true);
        vend2.getProducts().add(prod22);
        
        this.vendorsById.put(vend2.getId(), vend2);    
        
        //Vendor3
        final Vendor vend3 = new Vendor();
        vend3.setId(Integer.valueOf(3));
        vend3.setName("Whole Foods");
        
        final Product prod31 = new Product();
        prod31.setId(Integer.valueOf(31));
        prod31.setName("carrot");
        prod31.setPrice(new BigDecimal("5.25"));
        prod31.setInStock(true);
        vend3.getProducts().add(prod31);
        
        final Product prod32 = new Product();
        prod32.setId(Integer.valueOf(32));
        prod32.setName("basil");
        prod32.setPrice(new BigDecimal("6.25"));
        prod32.setInStock(true);
        vend3.getProducts().add(prod32);
        
        this.vendorsById.put(vend3.getId(), vend3);    
        
        //Vendor4
        final Vendor vend4 = new Vendor();
        vend4.setId(Integer.valueOf(4));
        vend4.setName("Sprouts");
        
        final Product prod41 = new Product();
        prod41.setId(Integer.valueOf(21));
        prod41.setName("potato");
        prod41.setPrice(new BigDecimal("7.25"));
        prod41.setInStock(true);
        vend4.getProducts().add(prod41);
        
        final Product prod42 = new Product();
        prod42.setId(Integer.valueOf(42));
        prod42.setName("basil");
        prod42.setPrice(new BigDecimal("8.25"));
        prod42.setInStock(true);
        vend4.getProducts().add(prod42);
        
        this.vendorsById.put(vend4.getId(), vend4);
        
        //Vendor5
        final Vendor vend5 = new Vendor();
        vend5.setId(Integer.valueOf(2));
        vend5.setName("Target");
        
        final Product prod51 = new Product();
        prod51.setId(Integer.valueOf(21));
        prod51.setName("celery");
        prod51.setPrice(new BigDecimal("13.25"));
        prod51.setInStock(true);
        vend5.getProducts().add(prod51);
        
        final Product prod52 = new Product();
        prod52.setId(Integer.valueOf(21));
        prod52.setName("potato");
        prod52.setPrice(new BigDecimal("14.25"));
        prod52.setInStock(true);
        vend5.getProducts().add(prod52);
        
        this.vendorsById.put(vend5.getId(), vend5);    
        
    }
    
    public List<Vendor> findAll() {
        return new ArrayList<Vendor>(this.vendorsById.values());
    }
    
    public Vendor findById(final Integer id) {
        return this.vendorsById.get(id);
    }
    
    public void addVendor(int idVal, String nameVal, Product productVal)
    {
    	final Vendor vendNew = new Vendor();
    	vendNew.setId(Integer.valueOf(idVal));
        vendNew.setName(nameVal);
        vendNew.getProducts().add(productVal);
        this.vendorsById.put(vendNew.getId(), vendNew);  
    }
    
}
