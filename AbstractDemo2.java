package AbstractDemo;

class A{
    public void fun1(){
        System.out.println("A的方法1");
    }
    public void fun2(){
        this.fun1();
    }
}

class B extends A{
    //覆写A中的方法
    public void fun1(){
        System.out.println("B的方法1");
    }
    //子类中自己定义的方法
    public void fun3(){
        System.out.println("B的方法3");
    }
}

class C extends A{
    public void fun1(){
        System.out.println("C的方法1");
    }
    public void fun5(){
        System.out.println("C的方法3");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        fun(new B()); //传递B类实例
        fun(new C()); //传递C类实例
    }
    //使用对象的多态性，可以直接接受任何子类对象。
    //无论子类如何增加，fun()方法都不用做任何改变
    //一旦发生对象的向上转型关系之后，调用的方法一定是被子类覆写过的方法
    public static void fun(A a){ //接受父类对象
        a.fun1();
    }
}
