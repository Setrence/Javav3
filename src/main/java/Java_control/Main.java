package Java_control;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Toy_standart ari = new Dol("ari", 5);
        Toy_standart ari1 = new Robot("ar2d2", 6);
        Toy_standart ari2 = new Construktor("lego", 8);
        Machine machine = new Machine();
        machine.input_toy(ari);
        machine.input_toy(ari1);
        machine.input_toy(ari2);

        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);
        machine.raffle(machine.list, machine.list2);

        machine.extradition(machine.list2);


    }
}