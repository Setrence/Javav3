package Java_control;

public class Main {
    public static void main(String[] args) {
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


    }
}