import java.io.File;
public class FileHandlingJava{
    public static void main(String[] args){
     // for create the file in java
        try {
            File f = new File("hello.txt");
            if(f.createNewFile()){
                System.out.println("File is created.");

            }else {
                System.out.println("Sorry janak");
            }
        } catch (Exception ex){
            System.out.println("Somthing is going worng");
        }
    }
}
