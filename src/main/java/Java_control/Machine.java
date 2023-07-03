package Java_control;

import java.util.ArrayList;
import java.util.Random;

public class Machine implements Toy_machine {

    ArrayList <Toy_standart> list = new ArrayList<>();
    ArrayList <Toy_standart> list2 = new ArrayList<>();


    @Override
    public void input_toy(Toy_standart toy) {
        this.list.add(toy);
    }

    @Override
    public void raffle(ArrayList <Toy_standart> list, ArrayList <Toy_standart> list2) {
        Random r = new Random();
        int random = r.nextInt(1, 100);
        for (Toy_standart toy : list){
            if (toy.getWeight() >= random){
                this.list2.add(toy);
                int q = toy.getQuantity() - 1;
                toy.setQuantity(q);
                break;
            }
        }
    }
}
