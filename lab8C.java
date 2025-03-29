interface transport{
    public void deliver();
}
abstract class animal{
    abstract void sound();
}

class tiger extends animal{
    public void sound(){
        System.out.println("Tiger voice");
    }
}
class camel extends animal implements transport{
    public void sound(){
        System.out.println("camel voice");
    }
    public void deliver(){

    }
}
class deer extends animal{
    public void sound(){
        System.out.println("deer voice");
    }
}
class donkey extends animal implements transport{
    public void sound(){
        System.out.println("donkey voice");
    }
    public void deliver(){

    }
}

public class lab8C {
    public static void main(String[] args) {
        animal[] a = new animal[4];

        a[0] = new tiger();
        a[1] = new camel();
        a[2] = new deer();
        a[3] = new donkey();

        a[0].sound();
        a[1].sound();
        a[2].sound();
        a[3].sound();
    }
}
