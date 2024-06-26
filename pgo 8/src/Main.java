public class Main {
    public static void main(String[] args) {
        Car car =new Car("kia", "xxx1", 2000, 2000, 200);
        Truck truck = new Truck("mercedes" , "yyyy7", 2001, 12000, 500,10000);

        car.calculateFuelEffiency();
        System.out.println( car.calculateFuelEffiency());
        truck.calculateFuelEffiency();
        System.out.println(truck.calculateFuelEffiency());


    }
}