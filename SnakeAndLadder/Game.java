package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        initializePlayers();
    }

    public void initializePlayers(){
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){
         while(winner == null) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPos);

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPosition = playerTurn.currentPos + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPos = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
            }

        }

        System.out.println("WINNER IS:" + winner.id);

    }

    private Player findPlayerTurn() {

        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getcell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

}



