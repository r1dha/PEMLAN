import java.io.*;
import java.util.*;

public class Solution {
    
    public static int reverse(int a){
        int reverse = 0, temp = a;   
        while(temp!=0){
            reverse = reverse*10+(temp%10); 
            temp = temp/10; 
        }
        return reverse; 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int num, banding;  
        num = in.nextInt();
        banding = reverse(num); 
        
        if(num==banding){
            System.out.println(num+" adalah selde.");
        }else{
            System.out.println(num+" bukan selde.");
        }
        
    }
}