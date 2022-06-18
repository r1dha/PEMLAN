package tugas7;

public class Tugas7 {
    
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t##Pegawai Tetap##");
        System.out.println("---------------------------------------------------");
        
        pegawai = new PegawaiTetap("Captain Carter", "215150707111043", 9000000);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new PegawaiTetap("Dr. Strange", "215150707111044", 27000000);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new PegawaiTetap("Moon Knight", "215150707111045", 16000000);
        System.out.println(pegawai.toString() + "\n");
        
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t##Pegawai Harian##");
        System.out.println("---------------------------------------------------");
        
        pegawai = new PegawaiHarian("Captain Marvel", "215150707111046", 5000, 40);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new PegawaiHarian("Nick Furry", "215150707111047", 5000, 50);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new PegawaiHarian("Captain America", "215150707111043", 5000, 30);
        System.out.println(pegawai.toString() + "\n");
        
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t##Sales##");
        System.out.println("---------------------------------------------------");
        
        pegawai = new Sales("Loki", "215150707111048", 40, 15000);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new Sales("Red Skull", "215150707111049", 65, 15000);
        System.out.println(pegawai.toString() + "\n");
        
        pegawai = new Sales("Thanos", "215150707111040", 64, 15000);
        System.out.println(pegawai.toString() + "\n");    
    }
    
}
