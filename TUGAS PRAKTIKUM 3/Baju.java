package erigomalang;

public class Baju {
    
    final int A = 100000; 
    final int B = 125000; 
    final int C = 175000; 
    
    String jenis; 
    int harga; 
    int jumlah; 
    
    Baju(String pilihan, int  banyak)
    {
        this.jumlah = banyak; 
        this.jenis = pilihan; 
    }
    
    void getHargaA()
    {
        if(jumlah>100)
        {
            this.harga = 95000; 
        }else
        {
            this.harga = 100000; 
        }
    }
    void getHargaB()
    {
        if(jumlah>100)
        {
            this.harga = 120000; 
        }else
        {
            this.harga = 125000; 
        }
    }
    void getHargaC()
    {
        if(jumlah>100)
        {
            this.harga = 160000; 
        }else
        {
            this.harga = 175000; 
        }
    }
    
    
    void getFinal()
    {
        if(jenis.equalsIgnoreCase("a"))
        {
            this.getHargaA();
        }else if(jenis.equalsIgnoreCase("b"))
        {
            this.getHargaB();
        }else if(jenis.equalsIgnoreCase("c"))
        {
            this.getHargaC();
        }
        
        System.out.println("JENIS ITEM YANG DIPILIH: "+jenis);
        System.out.println("HARGA ITEM YANG DIPILIH: "+harga);
        System.out.println("TOTAL HARGA YANG HARUS DIBARAY: "+(harga*jumlah));
    }
}
