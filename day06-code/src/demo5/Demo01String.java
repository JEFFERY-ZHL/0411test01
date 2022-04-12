package demo5;

public class Demo01String {
    public static void main(String[] args) {
        //使用空构造，小括号留空，字符串中什么内容都没有
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = {'A','B','C','D'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //使用字节数组创建字符串
        byte[] byteArray = { 97,98,99 };
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串：" + str4);


    }

}
