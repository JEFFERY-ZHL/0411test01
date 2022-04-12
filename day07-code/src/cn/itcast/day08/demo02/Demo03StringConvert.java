package cn.itcast.day08.demo02;

import java.nio.charset.StandardCharsets;

public class Demo03StringConvert {
    public static void main(String[] args) {
        // 转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);

        //转化为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }  //显示ASCLL码 97，98，99

        // 替换
        String str1 = "How do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str2);    // H*w d* y*u d*
    }
}
