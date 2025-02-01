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
        if(t3s>60){
            t3m++;
            t3s-=60;
        }
        if(t3m>60){
            t3h++;
            t3m-=60;
        }

        System.out.println("Your ans is " + t3h + " " + t3m + " " + t3s);
    }
}

public class lab6a2 {
    public static void main(String[] args) {
        time t1 = new time(2, 24, 55);
        time t2 = new time(2, 24, 55);

        t1.ans(t2.hour, t2.minute, t2.second);
    }
}