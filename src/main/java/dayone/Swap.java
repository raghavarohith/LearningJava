package dayone;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int a = 100, b = 200;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
        System.out.println("before swapping ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a = b;
        b = temp;
        System.out.println("after swapping ");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
