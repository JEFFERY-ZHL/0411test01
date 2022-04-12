package cn.itcast.day05.demo;
// 面向过程 每一个细节都要亲历亲为


import java.util.Arrays;

public class hellojava {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //打印格式为[10,20,30,40,50]
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
        {
            if (i == array.length -1) //此时为最后一个元素
            {
                System.out.println(array[i] + "]");
            }
            else
            {
                System.out.print(array[i] + ", ");
            }
        }
        //使用对象
        //找一个JDK给我们提供好的arrays类
        //其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println("=================");

        System.out.println(Arrays.toString(array));

    }





}
