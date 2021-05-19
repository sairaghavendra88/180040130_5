package encapsulationn;
import java.util.*;
import java.io.*;

class Author{
    private String email;
   private char gender;
    private String name;
    Author(String n,String e,char g)
    {
        name=n;
        email=e;
        gender=g;
    }
    public String getname()
    {
    	return name;
    }
    public String getemail()
    {
    	return email;
    }
    public char getgender()
    {
    	return gender;
    }
    
}
class Book{
    String name1;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=100;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=10;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
    Author e;
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+e.getname());
       System.out.println("The email id is :"+e.getemail());
       System.out.println("The gender is :"+e.getgender());
    }
    
}
class Question1encaps{
    public static void main(String args[])
    {
        Book b=new Book("Computer Networks");
        Author a=new Author("amy","xxx.cse@rmd.ac.in",'f');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQtyInStock());
        b.getAuthor();
        
    }
}