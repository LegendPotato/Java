package ac.meituan;

import java.util.ArrayList;
import java.util.List;

class Address implements Cloneable {
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public Object clone() {
        Address addr = null;
        try {
            addr = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return addr;
    }
}

class Student implements Cloneable {
    private int number;

    //Student类里面有一个成员也是类，类成员
    private Address addr;

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Object clone() {
        Student stu = null;

        try {
            //super.clone()即Object类里面的clone（）方法可是本地方法哦！！！！
            stu = (Student) super.clone();    //浅复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //要是深复制，一定别忘了给里面的自定义类，也clone一下，当然这也要求自定义类实现Cloneable接口
        stu.addr = (Address) addr.clone();    //深度复制
        return stu;
    }
}

public class Clone {

    public static void main(String args[]) {

        Address addr = new Address();
        addr.setAdd("杭州市");
        Student stu1 = new Student();
        stu1.setNumber(123);
        stu1.setAddr(addr);
        //到此stu1对象都附了值

        Student stu2 = (Student) stu1.clone();
        //到此stu2拥有了全部stu1的值

        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());

        //这一步改了stu1.addr的值，但没有改变stu2.addr的值啊！
        addr.setAdd("西湖区");


        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());

        String string = new String("ddd");
        Integer integer = null;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        Object object = ((ArrayList<Integer>) list).clone();
        System.out.println(list);
        System.out.println(object);
//        for(Integer integer:list){
//            System.out.println(integer);
//        }
//        object = null;
        System.out.println(list);
        System.out.println(object);
    }
}
