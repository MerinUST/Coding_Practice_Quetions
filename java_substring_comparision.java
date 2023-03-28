import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        largest = s.substring(0,k);
        smallest = s.substring(0,k);
        
        for(int i =0;i<=s.length()-k;i++)
        {
            if(largest.compareTo(s.substring(i,k+i))<0)
            largest=s.substring(i,k+i);
            
            if(smallest.compareTo(s.substring(i,k+i))>0)
            smallest=s.substring(i,k+i);
        }
        return smallest + "\n" + largest;
    }
