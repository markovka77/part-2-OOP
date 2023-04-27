public class Main {
    public static void main(String[] args) {
        //Велосипед
        Bycicle bycicle = new Bycicle("Конёк-Горбунок",5);
        bycicle.service();
        System.out.println();

        //Машина
        Car car = new Car("Tesla",4);
        car.service();
        System.out.println();

        //
        Truck truck = new Truck("Scania",6,12);
        truck.service();



    }
}