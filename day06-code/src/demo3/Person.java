package demo3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }  // 无参构造

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }  // 全参构造

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
