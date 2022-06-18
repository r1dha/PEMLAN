package tugas4;
import java.util.*;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000)); 
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        System.out.println();
        
        
        System.out.print("Nama Merchant       : ");
        String namaMerchant = in.nextLine();
        System.out.print("Input produk        : ");
        String namaProduk = in.nextLine();
        System.out.print("Input Harga Produk  : ");
        double harga = in.nextDouble();
        in.nextLine(); 

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, harga));
        System.out.println(); 
        
        //tampil data yang sudah di update
        DataMerchant.tampilData();
        System.out.println();   
        
        //ubah data merchant yang sudah di inputkan
        System.out.println("====UBAH DATA MERCHANT UBFOOD====");
        
        System.out.print("Nama baru untuk Merch     : ");
        String ubahMerc = in.nextLine();
        System.out.print("Menu baru                 : ");
        String ubahMenu = in.nextLine();
        System.out.print("Harga baru                : ");
        double ubahHarga = in.nextDouble(); 
        
        DataMerchant.updateMerchant(DataMerchant.cariMerchant(ubahMerc), ubahMerc, ubahMenu, ubahHarga);
        
        //menampilkan data merchant yang diupdate dengan metode pencarian
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));
        
    }    
}
