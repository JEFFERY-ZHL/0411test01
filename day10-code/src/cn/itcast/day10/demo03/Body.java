package cn.itcast.day10.demo03;

public class Body { //外部类

    public class Heart {  //成员内部类（直接在class里，就是成员，因此成为成员内部类）

        public void beat() {
            System.out.println("心脏跳动"); //内部类方法
            System.out.println("我叫"+ name );
        }
    }

    // 外部类成员变量
    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
