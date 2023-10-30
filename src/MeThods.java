public class MeThods{
    public static void main(String[] args){
        add(556,6);
        printAddress();
        printComputerInfo();
        int summ = addnum(5, 5);
        System.out.println("the addnum is " +summ);

           //example of inheritance
        JsDhami inhr = new JsDhami();
        inhr.pupAge();
        inhr.helllllo();







    }
    //no parameter no retuern type methos
    public static void printAddress(){
        System.out.println("My address is kathmandu");
        //function two call
        printComputerInfo();
    }

    public static void printComputerInfo(){

        System.out.println("our computer is DEll");
    }

    // parameters but no return type
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " +sum);
    }


    // parameters and have return type
    public static int addnum(int j, int k){
        return j+k;




    }

}

//inheriting class with Main class
class JsDhami extends Main{

    void helllllo(){
        System.out.println("inheritance test");
    }
}
