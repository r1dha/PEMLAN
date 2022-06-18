package tugas6;
import java.util.*;

public class Tugas6 {
    static Manusia manusia[];
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manajer manager[];
    
    public static void main(String[] args) {
        
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("Muhammad Ridha", "215150707111043", true, false);
        manusia[1] = new Manusia("Lyra Hertin", "2056126207844383", false, true);
        manusia[2] = new Manusia("I Putu Yoga", "2051240729948738", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFilkom[3];
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFilkom("123456789101112", 3.9, "Nuhfil hanani", "123456789101112", false, true);
        mahasiswa[1] = new MahasiswaFilkom("121110987654321", 3.8, "Wayan Mahmudi", "121110987654321", false, false);
        mahasiswa[2] = new MahasiswaFilkom("215150707111039", 4.0, "Bayu rahayudi", "215150707111039", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(7, 22, "195102439283", "Indra kenz", "2933242352524", true, true);
        pekerja[1] = new Pekerja(9, 28, "200325829957", "doni salmanan", "243245245224", false, true);
        pekerja[2] = new Pekerja(7, 30, "2002257291648", "windah Basudara", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manajer[3];
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manager[0] = new Manajer(1000, 6, 30, "122333444455555", "uzumaki naruto", "122333444455555", false, true);
        manager[1] = new Manajer(1500, 7, 24, "787425825238458", "Uciha Sasuke", "787425825238458", true, true);
        manager[2] = new Manajer(1450, 8, 20, "871871973284123", "Haruno sakura", "871871973284123", true, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        // Jumlah
        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia   : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja   : " + pekerja.length);
        System.out.println("Jumlah Manager   : " + manager.length);   
    }
    
}
