import java.io.*;
import java.util.*;

public class Solution {
    
    public static void geserChar(String kata, int geser){
        char huruf; 
        String keluaran="";
        
        for(int i=0; i<kata.length(); i++){
            huruf = kata.charAt(i); 
            
            if((huruf>='a')&&(huruf<='z'))
            {
                huruf = (char)(huruf+geser);
                if(huruf>'z'){
                    huruf = (char)(huruf+'a'-'z'-1); 
                }
                keluaran = keluaran + huruf;//untuk menambahkan keladam kalimat
            }
            else if((huruf>='A')&&(huruf<='Z'))
            {
                huruf = (char)(huruf+geser);
                if(huruf>'Z'){
                    huruf = (char)(huruf+'A'-'Z'-1); 
                }
                keluaran = keluaran + huruf;
            }else
            {
                keluaran = keluaran + huruf;
            }
            
        }
        //keluarkan huruf yang sudah digesert dalam bentuk kalimat(string)
        System.out.print(keluaran);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //deklarasi variabel
        String masukan;
        int n;
        
        
        //ambil imput
        masukan = in.nextLine();
        
        n = in.nextInt();
        
        //panggil method 
        geserChar(masukan, n);
        
    }
}