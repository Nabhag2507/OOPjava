abstract class vegetabel{
    String colour ="";
    public abstract String toString();
}

class potato extends vegetabel{
    public potato(){
        super.colour="yellow";
    }
    public String toString(){
        return super.colour;
    }
}
class brinjal extends vegetabel{
    public brinjal(){
        super.colour="purple";
    }
    public String toString(){
        return super.colour;
    }
}
class tomato extends vegetabel{
    public tomato(){
        super.colour="red";
    }
    public String toString(){
        return super.colour;
    }
}

public class lab8A {
    public static void main(String[] args) {
        potato p = new potato();
        System.out.println("colour of potato is "+p.toString());    

        brinjal b = new brinjal();
        System.out.println("colour of bringle is "+b.toString());    

        tomato t = new tomato();
        System.out.println("colour of tomato is "+t.toString());    
    }
}