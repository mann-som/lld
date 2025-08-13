package TicTacToe.Model;

public class Player {
    String Name;
    PlayingPiece piece;

    public Player(String Name, PlayingPiece piece){
        this.Name = Name;
        this.piece = piece;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public PlayingPiece getPlayingPiece(){
        return piece;
    }

    public void setPlayingPiece(PlayingPiece piece){
        this.piece = piece;
    }
}
