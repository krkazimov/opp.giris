package Oop1;

import java.util.Scanner;

public class MethodsCls1 {
    //Geriye deyer qaytarandir yoxsa yox
    //Hansi tip qayidacaq
    //Parametirler ya Bosh
    // Nece dene hansi tip

    // qaytaran  string 1 int
    static String musmen (int eded){

        String netice = "";

        if (eded>0){
            netice = "musbet";
        } else if (eded<0) {
            netice = "menfi";
        }else {
            netice = "sifir";
        }
        return netice;
    }
    // qaytaran int 1 string
    static  int  lenghtname (String a){
        int uzunluq = a.length();
        return  uzunluq;
    }
    // qaytaran bool 1 int
    static boolean Cutdurmu (int a){
        boolean netice = false;
        if (a%2==0){
            netice = true;
        }
        return netice;
    }

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String b = sc.next();
        int uzunluq = lenghtname(b);
        System.out.println(uzunluq);*/
        //System.out.println("eded daxil edin");
        //int a = sc.nextInt();
        //String s = musmen(a);
        //System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int b = sc.nextInt();
        Boolean s = Cutdurmu(b);
        System.out.println(s);

    }
}
