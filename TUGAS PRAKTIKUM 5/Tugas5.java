package tugas5;

public class Tugas5 {
    public static void main(String[] args) {

        CarRider ming = new CarRider("Lin Ming",19, "081361657304");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081361657300");
        CarRider ling = new CarRider("George Russell", 31, "081361657399");
        CarRider zefanya = new CarRider("Nicole Zefanya", 25, "081361657366");

        CarData data = new CarData();
        data.addCar("SUV", "BL 1111 N", "Ferrari");
        data.addCar("SUPRA", "BL 2222 NL", "Honda");
        data.addCar("TRUCK", "BL 3333 A", "Mercedes");
        data.addCar("MODELX", "BL 4444 N", "TESLA");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan,data.carList.get(0),3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(zefanya, data.carList.get(2), 4);

        System.out.println();
        arsip.info();
    }
}
    

