package Java_control;

import java.io.*;
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
        System.out.println(random);
        for (Toy_standart toy : list){
            if (toy.getWeight() >= random && random < 60){
                if (toy.getQuantity() == 0){
                    list.remove(toy);
                }else
                    this.list2.add(toy);
                    System.out.println(toy.getName());
                    int q = toy.getQuantity() - 1;
                    toy.setQuantity(q);
                    break;
            }
        }
    }

    @Override
    public void extradition(ArrayList<Toy_standart> list2) throws IOException {

        File file = new File("extradition.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));

        pw.println (list2.get(0).toString());
        pw.close();

    }
}
