package demo3;

import java.util.ArrayList;

/*
ArrayList 中常用的方法
public boolean add(E e):向集合中添加元素，参数的类型和泛型一样，返回值代表是否添加成功。
（对于ArrayList来说，add添加一定是成功的，所以返回值可用可不用）。
public E get(int index)： 从集合中获取元素，参数是索引编号，返回值就是对应的元素位置。
public E remove（int index）：删除元素
public int size() :获取集合的尺寸长度。

 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        boolean success = list.add("张三");
        System.out.println("添加的动作是否成功：" + success); //true

        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list); //显示全部

        // 获取元素
        System.out.println(list.get(2)); // 王五

        //删除
        String remove = list.remove(3);  //删除了赵六
        System.out.println(list);

        //遍历元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
