import java.io.FileWriter;
public class WriteDataJava{
    public static void main(String[] args){
     try {



        FileWriter writedata = new FileWriter("hello.txt", true);
        writedata.write("Janak singh dhami");
        writedata.close();
        System.out.println("Written");
     }catch (Exception ex){
         System.out.println("Sorry");
     }
    }
}
