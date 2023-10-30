import java.io.File;
public class FileDeleteJava{
    public static void main(String[] args){
        try {
            File fd = new File("hello.txt");
          if (fd.delete()){
              System.out.println("File has been deleted");
          }
        }catch (Exception ex){
            System.out.println("File is not found");
        }
    }
}
