package cn.itcast.day08.demo02;

public class Demo02SteingGet {
    public static void main(String[] args) {
        //获取长度
        int length = "asdasdasdasdasdsadasd".length();
        System.out.println("字符串长度是" + length);

        //拼接
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);   // Hello
        System.out.println(str2);   // World
        System.out.println(str3);   // HelloWorld

        // 查找索引
        char c = "hello".charAt(1);
        System.out.println("在1号索引位置的字符串是：" + c );

        //查找字符串中第一次出现的索引位置
        String str4 = "helloworldhelloworld";
        int llo = str4.indexOf("llo");
        System.out.println("字符串中“llo”第一次出现的位置是" + llo);   // 2
    }
}
