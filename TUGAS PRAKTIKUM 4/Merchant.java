package tugas4;

public class Merchant {
    private String namaMerchant; 
    private String namaProduk; 
    private double hargaMakanan; 
    
    Merchant(String namaMerchant, String namaProduk, double hargaMakanan)
    {
        this.namaMerchant = namaMerchant; 
        this.namaProduk = namaProduk; 
        this.hargaMakanan = hargaMakanan;
    }
    
    String getNamaMerchant()
    {
        return namaMerchant; 
    }
    void setNamaMerchant(String namaMerchant2)
    {
        this.namaMerchant = namaMerchant2; 
    }
    
    String getNamaProduk()
    {
        return this.namaProduk; 
    }
    void setNamaProduk(String namaProduk2)
    {
        this.namaProduk = namaProduk2; 
    }
    
    double getHargaMakanan()
    {
        return this.hargaMakanan; 
    }
    void setHargaMakanan(double hargaMakanan2)
    {
        this.hargaMakanan = hargaMakanan2; 
    }
}
