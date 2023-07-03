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
                    this.list.remove(toy);
                }else
                    this.list2.add(toy);
                    System.out.printf("Вы выиграли %s \n", toy.toString());
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

        pw.println (this.list2.get(0).toString());
        pw.close();

        System.out.printf("Вы забрали: %s\n", list2.get(0).toString());
        this.list2.remove(0);

    }

    @Override
    public void toys_in_machite(ArrayList<Toy_standart> list) {
        for (Toy_standart toys : list){
            System.out.printf("В машине: %s в количестве %d с вероятностью выпадения %d\n", toys.getName(), toys.getQuantity(), toys.getWeight());
        }
    }

    @Override
    public void toys_not_extradition(ArrayList<Toy_standart> list2) {
        for (Toy_standart toys : list2){
            System.out.println(toys.toString());
        }
    }


}
