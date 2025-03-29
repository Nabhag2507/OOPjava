import java.awt.*;

public class cordinationFounder {
    public static void main(String[] args) {
       try {
            while (true) {
                Point p = MouseInfo.getPointerInfo().getLocation(); // Get mouse position
                System.out.println("Mouse Position: X=" + p.x + " Y=" + p.y);
                Thread.sleep(500); // Delay for half a second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}