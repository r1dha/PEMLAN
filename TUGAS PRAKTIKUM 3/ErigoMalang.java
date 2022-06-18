package erigomalang;
import java.util.*;

public class ErigoMalang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("  _____   ____    ___    ____    ___  ");
        System.out.println(" | ____| |  _ \\  |_ _|  / ___|  / _ \\ ");
        System.out.println(" |  _|   | |_) |  | |  | |  _  | | | |");
        System.out.println(" | |___  |  _ <   | |  | |_| | | |_| |");
        System.out.println(" |_____|_|_|_\\_\\ |___|  \\____|  \\___/ ");
        System.out.println("       |  \\/  | | |      / ___|       ");
        System.out.println("       | |\\/| | | |     | |  _        ");
        System.out.println("       | |  | | | |___  | |_| |       ");
        System.out.println("       |_|  |_| |_____|  \\____|       ");
        System.out.println();
        System.out.println("ERIGO'S AVAILABLE ITEMS: ");
        System.out.println();
        System.out.println("XX.\tITEM\t  PRICE");
        System.out.println("a.\tBAJU A\t100.000 IDR");
        System.out.println("b.\tBAJU B\t125.000 IDR");
        System.out.println("c.\tBAJU C\t175.000 IDR");
        
        System.out.print("ITEM YANG AKAN ANDA PESAN: ");
        String pilihan = in.nextLine();
        System.out.print("BANYAK ITEM YANG AKAN ANDA PESAN: ");
        int jumlah = in.nextInt();
        
        System.out.println();
        Baju item1 = new Baju(pilihan, jumlah);
        
        System.out.print("DETAIL PESANAN ANDA: ");
        item1.getFinal();
        System.out.println("===============THANSKS===============");
        System.out.println();
    }
}
