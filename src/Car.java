public class Car extends Transport  implements Service{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }


    public void serviceCar(int wheelsCount){
        System.out.println("Меняем покрышку");
    }
    public void serviceCar(String modelName){
        System.out.println("Проверяем двигатель");

    }

}
