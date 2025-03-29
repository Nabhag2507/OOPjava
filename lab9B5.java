// Write a Java program to create an interface Shape with the getArea() method. Create 
// three  classes  Rectangle,  Circle,  and  Triangle  that  implement  the  Shape  interface. 
// Implement the getArea() method for each of the three classes

interface Shape{
    public void getArea();
}
class Rectangle implements Shape{
    public void getArea(){
        System.out.println("Area of rectangle found :)");
    }
}
class Circle implements Shape{
    public void getArea(){
        System.out.println("Area of circle found :)");
    }
}
class Triangle implements Shape{
    public void getArea(){
        System.out.println("Area of triangle found :)");
    }
}

public class lab9B5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();

        r.getArea();
        c.getArea();
        t.getArea();
    }
}
