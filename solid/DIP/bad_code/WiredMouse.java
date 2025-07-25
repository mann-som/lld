package solid.DIP.bad_code;

public class WiredMouse implements Mouse {
    
    public void type(){
        System.out.println("This is wired mouse");
    }
}

class WirelessMouse implements Mouse{

    public void type(){
        System.out.println("This is wireless mouse");
    }
} 