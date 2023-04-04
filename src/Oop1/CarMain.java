package Oop1;

public class CarMain {
    public static void main(String[] args) {
        Car mercedes = new Mercedes();
        mercedes.start();
        mercedes.stop();
        carTestin(mercedes);

        Car opel = new Opel();
        opel.start();
        opel.stop();
        carTestin(opel);
    }
    static void carTestin (Car data){
        System.out.println("Testing is OK");
    }


}
