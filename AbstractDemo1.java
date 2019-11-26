package AbstractDemo;
//定义抽象类
abstract class Person{
    private String name;  //属性
    public Person(){  //构造方法
        System.out.println("**********");
    }
    public String getName(){  //普通方法
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //{}为方法体，所有抽象方法不包含方法体
    public abstract void getPersonInfo();  //抽象方法
}

class Student extends Person{
    public Student(){
        System.out.println("#########");
    }
    @Override
    public void getPersonInfo() {
        //System.out.println("Student");
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        //抽象类的对象可以通过对象多态性利用子类为其实例化
        //  Person person = new Student();//实例化子类，向上转型
        //  person.getPersonInfo(); //被子类所覆写的方法
        new Student();  //实现子类化时一定先调用父类的构造方法
                        //即先输出*在输出#
    }
}