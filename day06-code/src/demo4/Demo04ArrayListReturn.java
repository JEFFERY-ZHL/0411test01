package demo4;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listsmall = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(101));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                listsmall.add(list.get(i));
            }
        }
        System.out.println(listsmall);

    }
}
