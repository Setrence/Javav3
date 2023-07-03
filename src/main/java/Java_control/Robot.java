package Java_control;

public class Robot extends Toy_standart {
    public Robot(String name, int quantity) {
        super(name, quantity, 60);
    }

    @Override
    public String toString() {
        return "Robot: " + name + "; количество: 1шт; выпал с вероятностью: " + weight + "\n";
    }


}
