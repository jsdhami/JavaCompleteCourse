import java.io.File;
import java.util.Scanner;
public class FileReadData{
    public static void main(String[] args){
        try {

            File my = new File("hello.txt");
            Scanner jk = new Scanner(my);
            while (jk.hasNextLine()){
                String mydata = jk.nextLine();
                System.out.println(mydata);
            }
            jk.close();
        }catch (Exception ex){
            System.out.println("sorry");
        }
    }
}

