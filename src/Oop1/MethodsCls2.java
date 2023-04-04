package Oop1;

import java.util.Scanner;

public class MethodsCls2 {

    static int vurma (int a, int b){
        int netice = a*b;
        return netice;
    }
    static int vurma (int a, int b, int c){
        int netice = a*b*c;
        return netice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = sc.nextInt();
        System.out.println("ucuncu ededi daxil edin");
        int c = sc.nextInt();

        int result = vurma(a,b);
        System.out.println(result);

        int result1 = vurma(a,b,c);
        System.out.println(result1);
    }
}
