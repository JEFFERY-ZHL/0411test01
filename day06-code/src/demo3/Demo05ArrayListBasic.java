package demo3;

import java.util.ArrayList;

public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
