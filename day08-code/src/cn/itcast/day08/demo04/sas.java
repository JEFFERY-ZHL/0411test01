package cn.itcast.day08.demo04;

public class sas {
    public static void main(String[] args) {
        demo01();
    }
    private static void demo01(){
        //程序执行前，获取一次毫秒值
        long s = System.currentTimeMillis();
        //执行for循环
        for (int i = 0; i <= 9999 ; i++) {
            System.out.println(i);
        }
        //程序执行后，再获取一次毫秒值
        long e =System.currentTimeMillis();
        System.out.println("程序共耗时"+(e-s)+"毫秒");
    }
}
