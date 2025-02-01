import java.util.Scanner;

class circle{
    double radius=0;
    circle(double radius){
        this.radius=radius;
    }
    public double ans() {
        return 3.14 * radius * radius;
    }
}

public class lab6a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle :");
        double r=sc.nextDouble();

        circle c1= new circle(3.0);
        c1.radius=r;
        System.out.println(c1.ans());
        sc.close();
    }
}
