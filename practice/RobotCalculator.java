import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotCalculator {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            // Step 1: Open Start Menu (Windows Key)
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            delay(1000); // Wait for Start Menu to open

            // Step 2: Type "Calculator" (case insensitive)
            typeString(robot, "calculator");
            delay(1000);

            // Step 3: Press Enter to open Calculator
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            delay(2000); // Wait for Calculator to open

            // Step 4: Perform "2 + 2 ="

            robot.keyPress(KeyEvent.VK_2);
            clickAt(robot, 700, 600); // Click on '='
            // clickAt(robot, 500, 600); // Click on '2' again
            delay(2000);
            robot.keyPress(KeyEvent.VK_2);
            // robot.keyPress(KeyEvent.VK_);
            
            // clickAt(robot, 500, 600); // Click on '2'
            // clickAt(robot, 600, 600); // Click on '+'

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // Helper method to type a string using Robot class
    private static void typeString(Robot robot, String text) {
        for (char ch : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                continue;
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            delay(100);
        }
    }

    // Helper method to move the mouse and perform a left-click
    private static void clickAt(Robot robot, int x, int y) {
        robot.mouseMove(x, y);
        delay(300); // Wait before clicking
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        delay(300); // Wait after clicking
    }

    // Helper method for delay
    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
