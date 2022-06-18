package tugas4;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];
    

    public static Merchant[] tambahMerchant (Merchant m){
        int a=DataMerchant.merc.length; 
        Merchant[] merch = new Merchant[a+1];

        for (int i = 0; i < a; i++){//DataMerchant.merc.length
            merch[i] = merc[i];
        }

        merch[a] = m;
        return merch;
    }
    
    public static void tampilData()
    {
        for(Merchant mch1 : merc)
        {
            System.out.println("====TAMPIL DATA MERCHANT UBFOOD====");
            System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant(String nama)
    {
        int index = 0;
        int b= DataMerchant.merc.length; 
        for (int i = 0; i < b; i++){
            if (DataMerchant.merc[i].getNamaMerchant() == nama){
                index = i;
                break;
            }
        }
        return merc[index];
    }
    public static void tampilMerchant(Merchant m)
    {
        System.out.println("====TAMPIL DATA MERCHANT UBFOOD====");
        System.out.println("Nama Merchant   : " + m.getNamaMerchant());
        System.out.println("Nama Produk     : " + m.getNamaProduk());
        System.out.println("Harga           : " + (int) m.getHargaMakanan());
    }
    public static void updateMerchant(Merchant m, String nama, String produk, double harga)
    {
        m.setNamaMerchant(nama); 
        m.setNamaProduk(produk);
        m.setHargaMakanan(harga); 
    }
}
