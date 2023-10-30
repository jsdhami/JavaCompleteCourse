import java.util.Scanner;
public class DoWhileLoops{
    public static void main(String[] args){


        try {

            String name;
            do {
                System.out.println("What is your name ?");
                Scanner n = new Scanner(System.in);
                name = n.nextLine();

                if (name.equals("janak")) {

                    System.out.println("k xw " + name + " timro hlkbr");
                }
                else{
                    System.out.println("Sorry " +name +" You are not Janak" +" Actually i'm searching janak so..");
                }
            } while (name.equals("janak"));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

//        try {
//all codes
//        }catch (){
//            //error message
//        }


   }
}
