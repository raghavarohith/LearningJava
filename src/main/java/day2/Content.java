package day2;

public class Content {
    public static void main(String[] args) {
        String s1="Python Exercises";
        String s2="Python Exercise";
        String end_str ="se";


        boolean str1=s1.endsWith(end_str);
        boolean str2=s2.endsWith(end_str);

        System.out.println("\"" + s1 + "\" ends with " +
                "\"" + end_str + "\"? " + str1);
        System.out.println("\"" + s2 + "\" ends with " +
                "\"" + end_str + "\"? " + str2);

    }
}
