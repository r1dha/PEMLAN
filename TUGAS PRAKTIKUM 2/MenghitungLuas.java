import java.util.*; 
import java.io.*;


class Persegi
{   
    void getLuas(int sisi)
    {
        int keluaran = sisi*sisi;
        
        System.out.print(keluaran);
    }
}

class Segitiga
{
    void getLuas(int alas, int tinggi)
    {
        int keluaran = (alas*tinggi)/2;
        
        System.out.print(keluaran);
    }
}

class Lingkaran
{
    void getLuas(int jari2)
    {
        if(jari2 == 7)
        {
            double hitungLuas = 22/7*jari2*jari2;
            int keluaran = (int)hitungLuas;
            System.out.print((double)keluaran);
        }else
        {
            double hitungLuas = 3.14*jari2*jari2;
            int keluaran = (int)hitungLuas;
            System.out.print((double)keluaran);
        }
        
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Persegi persegi1 = new Persegi();
        Segitiga segi3 = new Segitiga();
        Lingkaran lingkaran1 = new Lingkaran();
        
        int sisi, alas, tinggi, jariJari;
        int menu = in.nextInt();
        
        if(menu==1)
        {    
            sisi = in.nextInt();
            persegi1.getLuas(sisi);
            
        }else if(menu==2)
        {
            alas = in.nextInt();
            tinggi = in.nextInt();
            
            segi3.getLuas(alas, tinggi);
            
        }else if(menu==3)
        {
            jariJari = in.nextInt();
            lingkaran1.getLuas(jariJari);
        }else
        {
            System.out.print("Input yang anda masukan tidak sesuai");
        }
        
        
    }
}