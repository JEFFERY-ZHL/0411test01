package cn.itcast.day10.demo03;
//如果出现重名现象，格式 外部类名称.this.外部类成员变量名
public class Outer {
    int num = 10;  //外部类的成员变量

    public class Inner {

        int num = 20;  //内部类的成员变量

        public void methodInner() {
            int num = 30;  //内部类方法的成员变量
            System.out.println(num);  //30 局部变量 就近原则
            System.out.println(this.num);  // 20 内部类的成员变量
            System.out.println(Outer.this.num);  // 10 外部类的成员变量
        }
    }
}
