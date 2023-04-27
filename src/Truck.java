public class Truck extends Transport implements Service{
    private final int trailer;


    public Truck(String modelName, int wheelsCount, int trailer) {
        super(modelName, wheelsCount);
        this.trailer = trailer;
    }

    public void service() {
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

}