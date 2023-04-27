
public class Bycicle extends Transport implements Service{

    public Bycicle(String modelName, int wheelsCount) {
       super(modelName,wheelsCount);
    }

    public void service() {
        System.out.println("Меняем покрышку");
    }
}
