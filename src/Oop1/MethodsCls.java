package Oop1;

import java.util.Scanner;

public class MethodsCls {

    // Geriye deyer qaytarmayan ve Bosh
    static  void yaz (){

        System.out.println("Farid Kazimov");
    }
    // Geriye deyer qaytarmayan parametirler
    static void yazdir(String  ad){
        System.out.println(ad);
    }
    // Geriye deye qaytaran ve Bosh
    static int topla (){
        int netice = 79 + 37;
        return netice;
    }
    // Geriye deyer qaytaran parametirler
    static int vurma (int a, int b){
        int netice = a*b;
        return netice;
    }



    public static void main(String[] args) {
        //yaz();

        Scanner sc = new Scanner(System.in);
        /* System.out.println("Adinizi daxil edin");
        String name = sc.next();
        yazdir(name);*/

        //int a = topla();
        //System.out.println(a);
        System.out.println(" birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = sc.nextInt();
        int result = vurma(a,b);
        System.out.println(result);
    }
}
