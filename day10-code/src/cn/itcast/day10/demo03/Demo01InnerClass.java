package cn.itcast.day10.demo03;

/*
成员内部类定义格式：
修饰符 class 外部类名称 {
    修饰符 class 内部类名称{
            // ...
        }
        // ...
}
注：内用外，随意访问；外用内，需要内部类对象

========================================
使用内部类，两种方式
1.间接：在外部类方法中，使用内部类，然后main只是调用外部类的方法
2.直接：公式 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称()；
 */
public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();  //外部类对象
        body.methodBody();  //通过外部类队形，调用外部类的方法，里面间接再使用内部类Heart
        System.out.println("=============");

        //直接方法
        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
