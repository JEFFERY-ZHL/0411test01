package cn.itcast.day05.demo;

public class Student04 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("张三");
        stu.setAge(20);
        stu.setMale(true);


        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());

    }
}
