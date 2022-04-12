package cn.itcast.day08.demo06;
/*
this关键字的使用
 */
public class Zi extends Fu{
    int num = 20;

    public Zi() {
        this(123);  //本类的无参构造，调用本类的有参构造
    }

    public Zi(int n) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num);  // 局部变量
        System.out.println(this.num);  //本类中的成员变量
        System.out.println(super.num);  //父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();  // 访问本类另一个成员方法
        System.out.println("BBB");
    }


}
