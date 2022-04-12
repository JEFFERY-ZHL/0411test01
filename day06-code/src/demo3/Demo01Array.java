package demo3;
/*
对象数组，存放对象的数组
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马儿扎哈",38);

        // 将 one中的地址值赋值到数组的0号元素位置
        array[0] = one;    //地址值
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);   //显示的是地址值
        System.out.println(array[1].getName()); //古力娜扎
        System.out.println(array[2].getAge()); //年龄
    }
}
