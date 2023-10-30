public class ForLoop{
    public static void main(String[] args){

        for (int a = 0; a < 6; a++) {

            if (a < 3) {
                System.out.println("Hemu");
                }
            else{
               break;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("I Love you");

            }
        }
//foreach loop

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
