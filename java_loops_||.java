import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        double k=0;
        double s=0;
        int q =0;
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();  
            for(int j=0;j<n;j++)
            {
             double m = 2; 
             double c = j;
             int p=0;
             k=Math.pow(m,c); 
             if(j==0)
             {
               s=a+k*b;
               q =(int)s;
               System.out.print(q);
             }
             else
               {
                 s+=k*b;
                 q = (int)s;
                 System.out.print(" "+q);
               }
            }
            System.out.print("\n");
        }
        in.close();
    }
}

