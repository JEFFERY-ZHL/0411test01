package demo1;
import java.util.Scanner;
//1.导包

//2.创建
//3.使用
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入放入int数字是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }

}
