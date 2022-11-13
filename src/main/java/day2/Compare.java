package day2;

public class Compare {
    public static void main(String[] args) {
        String s1="Comparing example.com and example.com";
        String s2="Comparing Example.com and example.com";

        System.out.println(s1+""+s1.equals(s2));

        System.out.println(s2+""+s2.equalsIgnoreCase(s1));
    }
}
