// Create  interface  EventListener  with  performEvent()  method.  Create  MouseListener 
// interface  which  inherits  EventListener  along  with  mouseClicked(),  mousePressed(), 
// mouseReleased(),  mouseMoved(),  mouseDragged()  methods.  Also  create  KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces

interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{

    @Override
    public void performEvent() {
        System.out.println("perform event called");
    }

    @Override
    public void keyPressed() {
       System.out.println("key pressed called"); 
       }

    @Override
    public void keyReleased() {
       System.out.println("key relesed called");
    }

    @Override
    public void mouseClicked() {
        System.out.println("mouse clicked called");
    }

    @Override
    public void mousePressed() {
        System.out.println("mouse pressed called");
    }

    @Override
    public void mouseReleased() {
        System.out.println("mouse relesed called");
    }

    @Override
    public void mouseMoved() {
        System.out.println("mouse moved called");
    }

    @Override
    public void mouseDragged() {
        System.out.println("mouse dragged called");
    }

} 
public class lab9A {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();

        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
