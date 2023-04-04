package Oop1;

public class Mercedes extends Car {
    String mPackage;

    @Override
    void start() {
        System.out.println("Mercedes Starting");
    }

    @Override
    void stop() {
        System.out.println("Mersedec Stoping");
    }
}
