package day2;

public class assignment2 {

    public static  void main(String[]args)
    {
        assignment2 ass=new assignment2();
        ass.add(20,30);
        ass.sub(40,30);
        ass.div(6,2);
        ass.mul(8,9);
        ass.mod(9,3);
    }
    public  void add(int a, int b)
    {
       int sum=a+b;
        System.out.println("Sum"+" "+sum);
    }
    public  void sub(int c ,int d)
    {
        int sub=c-d;
        System.out.println("Sub"+" "+sub);
    }
    public  void div(int x,int y)
    {
        int div=x/y;
        System.out.println("Div"+" "+div);

    }
    public  void mul(int p,int q)
    {
        int mul=p*q;
        System.out.println("Mul"+" "+mul);

    }
    public void  mod(int r, int s)
    {
        int mod=r%s;
        System.out.println("Mod"+" "+mod);
    }
}
