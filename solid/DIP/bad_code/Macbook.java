package solid.DIP.bad_code;

public class Macbook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook(){
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}


// not a good way as it creates dependency on the concrete class 