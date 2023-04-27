public class Truck extends Transport{
    private final int trailer;


    public Truck(String modelName, int wheelsCount, int trailer) {
        super(modelName, wheelsCount);
        this.trailer = trailer;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}