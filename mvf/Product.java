
/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
{
    private String productId;
    private String productName;
    private String saleMethod;
    private int shelfLife;
    private double productPrice;
    private int productInventory;
    
    public void setProductId(String productId)
    {
        this.productId = productId;
    }
    
     public void setProductName(String productName)
    {
        this.productName = productName;
    }
    
     public void setSaleMethod(String saleMethod)
    {
        this.saleMethod = saleMethod;
    }
    
    public void setShelfLife(int shelfLife)
    {
        this.shelfLife = shelfLife;
    }
    
    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }
    
      public void setProductInventory(int productInventory)
    {
        this.productInventory = productInventory;
    }
    
    public String getProductId()
    {
        return productId;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public String getSaleMethod()
    {
        return saleMethod;
    }
    
    public int getShelfLife()
    {
        return shelfLife;
    }
    
    public double getProductPrice()
    {
        return productPrice;
    }
    
    public int getProductInventory()
    {
        return productInventory;
    }
}
