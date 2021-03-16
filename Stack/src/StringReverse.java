/*
    Simple implementation of data structure type stack
    =========== String reverse ======================
*/
package Stack.Stack.src;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your word");
        
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch[]=A.toCharArray();
        
        String reverse = "";
        for(int i = ch.length - 1;i >= 0; i--){
            reverse += ch[i];
        }
        
        if(reverse.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}



