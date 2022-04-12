package cn.itcast.day08.demo03;
/*
静态代码块格式：
public class 类名称 {
    static {
        // 静态代码块内容
    }
}
 */
public class person {
    static {
        System.out.println("静态代码块执行！");
    }

    public person() {
        System.out.println("构造方法执行！");
    }
}
