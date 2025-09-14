package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    
    Cell[][] cells;

    Board(int boardSize, int numOfSnakes, int numOfLadder){
        initializeBoard(boardSize);
        addSnakeAndLadder(cells, numOfSnakes, numOfLadder);
    }

    public void initializeBoard(int boardSize){

        cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    public void addSnakeAndLadder(Cell cell[][], int numOfSnakes, int numOfLadder){

        while(numOfSnakes > 0){
            int start = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int end = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(start <= end){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = start;
            snakeObj.end = end;

            Cell boardCell = getcell(start);
            boardCell.jump = snakeObj;
            numOfSnakes--;
        }

        while(numOfLadder > 0){
            int start = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int end = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);

            if(start >= end){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = start;
            ladderObj.end = end;

            Cell boardCell = getcell(start);
            boardCell.jump = ladderObj;
            numOfLadder--;
        }
    }

    public Cell getcell(int playerPosition){
        int x = playerPosition/cells.length;
        int y = playerPosition%cells.length;

        return cells[x][y];
    }
}
