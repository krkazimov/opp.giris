package Oop1;

public class Operations implements Arifmetik,Mentiqi {

    @Override
    public int topla(int a, int b) {
        int netice = a+b;
        return netice;
    }

    @Override
    public boolean cutdurmu(int eded) {
        boolean netice = false;
        if (eded%2==0){
            netice = true;
        }
        return netice;
    }
}
