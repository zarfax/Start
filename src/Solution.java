import java.io.*;
import java.util.*;

class Solution
{
    public static void main(String [] args) throws Exception
    {
    	System.out.println("Write 2 numbers followed by an enter");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        		//sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            //int c = sc.nextInt();
            System.out.println("The sum is "+(a+b));
        }
    }
}