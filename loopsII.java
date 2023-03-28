import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             double x=a;
            for(int j=0;j<n;j++){
               
                x+=(int)(((int)Math.pow(2,j))*b);
                System.out.print((int)x+" ");
            }
            
            System.out.println();
        }
        
        in.close();
    }
}
