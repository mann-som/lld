package solid.DIP.bad_code;

public class WiredKeyboard implements Keyboard{
    
    public void type(){
        System.out.println("This is wired Keyboard");
    }
}

class wirelessKeyboard implements Keyboard{

    public void type(){
        System.out.println("this is wireless Keyboard");
    }
}