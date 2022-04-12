package demo4;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("张三",14);
        Student two = new Student("李四",16);
        Student three = new Student("王五",18);
        Student four = new Student("赵六",21);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }
    }

}
