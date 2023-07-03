package Java_control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public interface Toy_machine {

    void input_toy (Toy_standart toy);

    void raffle (ArrayList <Toy_standart> list, ArrayList <Toy_standart> list2);

    void extradition (ArrayList <Toy_standart> list) throws IOException;
}
