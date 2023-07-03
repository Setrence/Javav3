package Java_control;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void Start() throws IOException {
        Toy_standart ari = new Dol("ari", 5);
        Toy_standart ari1 = new Robot("ar2d2", 5);
        Toy_standart ari2 = new Construktor("lego", 5);
        Toy_standart ari3 = new Dol("ari", 1);
        Toy_standart ari4 = new Robot("ar2d2", 1);
        Toy_standart ari5= new Construktor("lego", 1);
        Machine machine = new Machine();
        machine.input_toy(ari);
        machine.input_toy(ari1);
        machine.input_toy(ari2);
        boolean flag = true;
        while (flag == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите пункт меню:\n 1) Добавить игрушку\n 2) Розыграть игрушку\n" +
                    " 3) Забрать игрушку\n 4) Просмотреть сколько игрушек осталось в машине\n " +
                    "5) Просмотреть сколько игрушек еще не забрали\n 6) Выход\n");
            int nomber = sc.nextInt();
            switch (nomber){
                case 1:
                    System.out.println("Выберите какую игрушку хотите добавить:\n 1) Куклу\n 2) Робота\n 3) Конструктор\n");
                    int nomber2 = sc.nextInt();
                    if (nomber2 == 1){
                        machine.input_toy(ari3);
                    }if (nomber2 == 2){
                        machine.input_toy(ari4);
                    }if (nomber2 == 3){
                        machine.input_toy(ari5);
                    }
                    break;
                case 2:
                    machine.raffle(machine.list, machine.list2);
                    break;
                case 3:
                    machine.extradition(machine.list2);
                    break;
                case 4:
                    machine.toys_in_machite(machine.list);
                    break;
                case 5:
                    machine.toys_not_extradition(machine.list2);
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
