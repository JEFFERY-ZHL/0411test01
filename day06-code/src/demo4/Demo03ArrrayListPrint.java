package demo4;

import java.util.ArrayList;

public class Demo03ArrrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        printArrayList(list);
    }

    // 定义一个方法
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() -1 ){
                System.out.println(name + "}");
            }
            else{
                System.out.print(name + "@");
            }
        }


    }
}
