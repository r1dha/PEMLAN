package tugas5;
import java.util.ArrayList;

public class RentArchive {

    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        
        if(car.isStatus()){
            CarRent newCarRent = new CarRent(rider,car,rentDur);
            rentData.add(newCarRent);
            System.out.println("Mobil berhasil disewa");
            car.setStatus("false");
        }
        else {
            System.out.println("Maaf, mobil sudah disewa");
        }


    }

    public void info(){
        Car car = new Car();
        
        System.out.println("--------------------------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("--------------------------------------------------");
        
        
        for(CarRent rent : rentData){
                    System.out.println("NAMA PEMINJAM   : " + rent.getRider().getName());
                    System.out.println("UMUR            : " + rent.getRider().getAge());
                    System.out.println("NO HANDPHONE    : " + rent.getRider().getPhone());
                    System.out.println("TIPE MOBIL      : " + rent.getCar().getCarType());
                    System.out.println("NO POLISI       : " + rent.getCar().getPolNum());
                    System.out.println("LAMA RENTAL     : " + rent.getRentDur());
                    System.out.println("--------------------------------------------------");
        }
    }
}
