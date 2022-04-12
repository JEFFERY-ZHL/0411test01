package cn.itcast.day09.demo03;

public class Demo01Main {
    public static void main(String[] args) {
        //
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat) animal;
    }
}
