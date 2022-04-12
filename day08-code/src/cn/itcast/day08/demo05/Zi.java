package cn.itcast.day08.demo05;
/*
super关键字使用
 */
public class Zi extends Fu{
    int num = 20;

    public Zi() {
        super();
    } // 访问父类的构造方法

    public void methodZi(){
        System.out.println(super.num);  //父类中的num
    }

    public void method() {
        super.method();  // 访问父类的方法
        System.out.println("子类方法");
    }
}
