package cn.itcast.day08.demo02;

public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        String result = fromArrayToString(array);
        System.out.println(result);

    }
/*
定义一个方法步骤 public static + 返回值类型 + 方法名称 + 参数列表
返回值类型 String
方法名称 fromArrayToString
参数列表 int
 */
    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length ; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else{
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
