import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String low = A.toLowerCase();
    StringBuilder str = new StringBuilder(low);
    String invert = str.reverse().toString();
    if (low.equals(invert)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}


