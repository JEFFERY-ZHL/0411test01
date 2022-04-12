package cn.itcast.day08.demo02;

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu); //10

        Zi zi = new Zi();

        System.out.println(zi.numFu); //10
        System.out.println(zi.numZi); //20
    }
}
