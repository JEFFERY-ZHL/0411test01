package cn.itcast.day10.demo01;

public class Demo01Final {

    public static void main(String[] args) {
        //对于基本类型，不可变的是变量中的数据
        //对于引用类型，不可变的是变量中的地址值\
        Student stu1 = new Student("张三");
        System.out.println(stu1); //输出地址值（不变）
        System.out.println(stu1.getName()); //张三
        stu1 = new Student("李四");
        System.out.println(stu1);
        System.out.println(stu1.getName()); //李四

        final Student stu2 = new Student("小张");
        System.out.println(stu2.getName());
        stu2.setName("小李");
        System.out.println(stu2.getName());
        // stu2 = new Student("小王")  错误写法
    }


}
