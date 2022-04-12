package demo3;

import java.util.ArrayList;

/*
arraylist 数组长度可以随意改变，随意添加，但类型不能改变
对于Arraylist来说，有一个<E>代表泛型，装在集合中的所有元素，全都是同一类型。泛型只能是引用类型 不能是基本类型
 */
public class Demo02Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  //[]

        //向集合中添加元素，需要用到add
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);  //[张三，李四，王五]
    }
}
