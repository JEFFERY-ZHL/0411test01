package cn.itcast.day08.demo02;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();  //获取键盘输入的一个字符串
        
        int countUpper = 0; //大写字母
        int countLower = 0; //小写字母
        int countNumber = 0; //数字
        int countOther = 0; //其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z'){
                countUpper++;
            } else if ('a' <= ch && ch <= 'z'){
                countLower++;
            } else if ('0' <= ch && ch <='9'){
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母个数是：" + countUpper);
        System.out.println("小写字母个数是：" + countLower);
        System.out.println("数字字符个数是：" + countNumber);
        System.out.println("其他字符个数是：" + countOther);
    }

}
