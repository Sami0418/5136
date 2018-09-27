
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    private String id;
    private String name;
    private String password;
    private String address;
    private String email;
    private String phone;
    
    public Customer(String id)
    {
        this.id = id;
        name = "";
        password = "";
        address = "";
        email = "";
        phone = "";
    }
    
    public String getId()
    {
        return id;
    }
    
     public String getName()
    {
        return name;
    }
    
     public String getPassword()
    {
        return password;
    }
    
     public String getAddress()
    {
        return address;
    }
    
     public String getEmail()
    {
        return email;
    }
    
     public String getPhone()
    {
        return phone;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
