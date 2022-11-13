package day2;

public class Duplicate {
    public static void main(String[] args) {
        String str="w3resource";

       char []arr=str.toCharArray();
       StringBuilder S=new StringBuilder();

       for(int i=0;i<arr.length;i++)
       {
           boolean repeated=false;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                 repeated=true;
                 break;
               }
           }
           if(!repeated)
           {
               System.out.println(arr
                       [i]);
           }
       }

        // System.out.println("The new string is:"+





    }
}
