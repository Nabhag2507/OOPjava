import java.util.Scanner;

class time {
    int hour = 0;
    int minute = 0;
    int second = 0;

    time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void ans(int hour, int minute, int second) {
        int t3h = this.hour + hour;
        int t3m = this.minute + minute;
        int t3s = this.second + second;
        if(t3s>=60){
            t3m++;
            t3s-=60;
        }
        if(t3m>=60){
            t3h++;
            t3m-=60;
        }

        System.out.println("Your ans is " + t3h + " " + t3m + " " + t3s);
    }
}

public class lab6a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time 1 in hour : minute : second format: ");
        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int second1 = sc.nextInt();

        time t1 = new time(hour1,minute1,second1);

        System.out.print("Enter time 2 in hour : minute : second format: ");
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();
        int second2 = sc.nextInt();

        time t2 = new time(hour2,minute2,second2);

        t1.ans(t2.hour, t2.minute, t2.second);
        sc.close();
    }
}