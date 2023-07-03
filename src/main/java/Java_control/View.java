package Java_control;

import java.util.Scanner;

public class View {
    public static void Start(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Выберите пункт меню:\n 1) Розыграть игрушку\n" +
                    " 2) Забрать игрушку\n 3) Просмотреть сколько игрушек осталось в машине\n " +
                    "4) Просмотреть сколько игрушек еще не забрали\n");
            int nomber = sc.nextInt();
            switch (nomber){
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    break;
            }
        }
    }
}
