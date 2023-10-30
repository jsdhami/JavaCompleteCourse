import java.util.Arrays;
import java.io.*;
public class ConstructorsWorks{
    public static void main(String[] args){
        Book bb = new Book(6, 566, "janak", 5666.6);
        bb.price = 56;
    }
}
 class Book{
    //properties
     int id;
     int noofpage;
     String name;
     double price;



     //Constructor
     //constructor like as a class but it has no return value bu it may be public or private or defult
     Book(int id, int noofpage, String name, double price){
         this.id = id;
         this.noofpage =noofpage;
         this.name = name;
         this.price = price;
         System.out.println(id +"\n" +noofpage +"\n" +name +"\n" +price);
     }
 }
