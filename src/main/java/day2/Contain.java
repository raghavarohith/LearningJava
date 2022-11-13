package day2;

public class Contain {
    public static void main(String[] args) {
        String s1="Comparing example.com and example.com";
        String s2="Comparing Example.com and example.com";
        String s="example.com and";
        System.out.println(s1+""+s1.contains(s));

        System.out.println(s2+""+s2.contains(s));
    }
}
