public class Main {
    public static void main(String[] args) {
        //Велосипед
        Bycicle bycicle = new Bycicle("Конёк-Горбунок",5);
        bycicle.service();
        System.out.println();

        //Машина
        Car car1 = new Car("Tesla",4);
        car1.serviceCar("Tesla");
        car1.serviceCar(4);



    }
}