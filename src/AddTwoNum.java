import java.util.Scanner;

public class AddTwoNum{
    public static void main(String[] args){
        System.out.println("This Program Calculate The Sum Of Two User Given Numbers ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of given numbers is: " +sum);

        JanuD userdata = new JanuD();
                userdata.name = "Janak Singh Dhami";
                userdata.Addr = "Kathmandu";
        System.out.println("Thank You So Much " +userdata.name);

        DhamiBro scc = new DhamiBro();
        scc.x = 6;
        scc.number = "Six";
        System.out.println("The number is: "+scc.number);




    }


    static class JanuD {
        String name;
        String Addr;

    }

    static class DhamiBro{
        int x;
        String number;
    }


}
