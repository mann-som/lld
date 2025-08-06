package TicTacToe.Model;

import TicTacToe.Model.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board {
    
    public int size;
    public PlayingPiece[][] board;
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column] != null){
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public List
}
