package Java_control;

abstract class Toy_standart {
    protected String name;
    protected int quantity;
    protected int weight;

    public Toy_standart(String name, int quantity, int weight) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
