public class parkingTester {
    public static void main(String[] args){
        parkingLot parking = new parkingLot();
        System.out.println(parking);

        car car1 = new car("blue", "nissan", true);
        parking.parkcar(car1);
        System.out.println(parking);

        car car2 = new car("Red", "Ford", false);
        parking.parkcar(car2);
        System.out.println(parking);

        parking.removecar(0);
        System.out.println(parking);



    }
}
