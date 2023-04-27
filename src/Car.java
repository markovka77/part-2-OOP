public class Car extends Transport  implements Service{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }


    public void service(){
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
    }


}
