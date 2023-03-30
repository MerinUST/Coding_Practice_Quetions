import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.length()==0){
            System.out.println(0);
        }
        else{
        s=s.replaceAll(" ", "=");
        String[] arr=s.split("[!,?._'=@]+");
        
        
        System.out.println(arr.length);
        for(String a:arr){
            System.out.println(a);
        }
        }
        scan.close();
    }
}

