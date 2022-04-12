package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[] 数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);  //[10, 20, 30]

        //排序
        int[] array1 = {2,3,8,5,10,1};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));  //[1, 2, 3, 5, 8, 10]

        String[] array2 ={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));  //[aaa, bbb, ccc]
    }
}
