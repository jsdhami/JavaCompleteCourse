public class Home{
    public static void main(String[] args){
   //     System.out.println("Hello I'm Learning Java Myself");
//        int a = 55;
//        int b = 66;
//        int sum = a + b;
//        int diff = a - b;
//        int mod = a % b;

//        System.out.println("The sum of these numbers is: "+sum);
//        System.out.println("The difference of these numbers is: "+diff);
//        System.out.println("The modulus of these numbers is: "+mod);

        Box mybox = new Box();
        mybox.depth = 55;
        mybox.height = 66;
        mybox.width = 566;
        double volume = mybox.depth * mybox.width * mybox.height;
        System.out.println("the volume of box: " +volume);
    }

    static class Box {
        double width;
        double height;
        double depth;
    }


}

