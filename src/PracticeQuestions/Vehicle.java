package PracticeQuestions;
//main class
public class Vehicle{
    public static void main(String[] args){

        Car vc = new Car();
        vc.make = "Janak";
        vc.model = "Byanshi";
        vc.infoCar();
        int result = add(6, 6);
        System.out.println(result);

    }
//methods in main class
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }


}
//this is subclass
class Car {
    String make;
    String model;
    //methods in subclass
    void infoCar(){
        System.out.println(make +model);
    }
}

