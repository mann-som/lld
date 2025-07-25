package solid.DIP.good_code;

public class Macbook {
    
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

// this is a good appraoch according to DIP as it creates dependency on the interface rather than concrete class
