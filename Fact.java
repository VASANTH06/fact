import java.io.*;
import java.util.*;
class Fact
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       int i,s=1;
          int b[]=new int[a];
        for( i=1;i<=a;i++)
        {
            s=s*i;
        }
        System.out.println(s);
    }
    
}
