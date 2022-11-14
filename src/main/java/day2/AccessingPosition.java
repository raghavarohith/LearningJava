package day2;
 
public class AccessingPosition {
    /*
   * @Author Raghavarohith.N
   * Date:- 13/11/2022
   */
     //Write a Java program to get the character at the given index within the String.
    //Original String = Java Exercises!
    //The character at position 0 is J
    //The character at position 10 is i
    public static void main(String[] args) {
        String S = "Java Exercises!";
        char  res=S.charAt(0);char res2=S.charAt(10);
        System.out.println("The character at position 0 is"+res);

        System.out.println("The character at position 10 is"+res2);
    }
}
