import java.util.Scanner;

public class JavaClasses{
    public static void main(String[] args){
        //creating object for the subclass in main class
     Temp square = new Temp();
     //function calling from the main class
     square.square();
    }
}





//creating multiple class in the java file
class Temp{
    //Creating properties in the class
    Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();

   //function/methods declaration in class
   void square(){
      int sq;
      sq = a * a;
       System.out.println(sq);
   }
}