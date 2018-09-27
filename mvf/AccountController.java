
/**
 * Write a description of class AccountController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AccountController
{
  private List<Customer> customers;
  
  public void register()
  {
    
        {
          Customer customer = generateCustomer();  
          System.out.println("Please enter your password");
          Scanner console =  new Scanner(System.in);
          String password = console.nextLine();
          customer.setPassword(password);
          System.out.println("Please enter your address");
          String address = console.nextLine();
          customer.setAddress(address);
          System.out.println("Please enter your E-mail");
          String email = console.nextLine();
          customer.setEmail(email);
          System.out.println("Please enter your phone");
        
        }
  }
  
  public Customer generateCustomer()
  {
      System.out.println("Please enter your user id ");
      Scanner console =  new Scanner(System.in);
      String userId = console.nextLine();
       if (isValidId(userId)){
          Customer customer =  new Customer(userId);
          return customer;
      }else{
        generateCustomer();
      }
}
  
  public boolean isValidId(String userId)
  {
      for (Customer customer: customers)
      {
          String checkId = customer.getId();
          if (userId.equals(checkId)){
              return false;
          }
      }
      return true;
  }
  
  public boolean isValidPhone(String phone)
  {
      if (phone.length()!= 10){
          return false;
      }else{
          int number  = Integer.parseInt(phone);
          try{
              return true;
            }catch(Exception e){
                return false;
            }
        }
      
  }
}
