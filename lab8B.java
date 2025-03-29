interface A {
    int a=0;
    public void myMethod();
}

interface A1 extends A{
    int b=0;
    public void myMethod1();
}
interface A2 extends A{
    int c=0;
    public void myMethod2();
}
interface A12 extends A1,A2{
    int d=0;
    public void myMethod12();
}

class B implements A12{
    public void myMethod(){
        System.out.println("interface A called");
    }
    public void myMethod1(){
        System.out.println("interface A1 called");
    }
    public void myMethod2(){
        System.out.println("interface A2 called");
    }
    public void myMethod12(){
        System.out.println("interface A12 called");
    }
}

public class lab8B {
    public static void main(String[] args) {
        B obj = new B();

        obj.myMethod();
        obj.myMethod1();
        obj.myMethod2();
        obj.myMethod12();
    }
}