package projects.TickTakToe.Cotroller.Service.WinnigStrategy.BotPlayingStrategy;

import projects.TickTakToe.Cotroller.model.Board;
import projects.TickTakToe.Cotroller.model.Cell;
import projects.TickTakToe.Cotroller.model.Move;
import projects.TickTakToe.Cotroller.model.Players;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinnigStrategy implements WinnigStrategy {
    private int dimension;
    private List<HashMap<Character,Integer>> rowHashMapList;
    private List<HashMap<Character,Integer>> colHashMapList;
    private HashMap<Character,Integer> leftDignonal;
    private HashMap<Character,Integer> rightDignonal;
    private HashMap<Character,Integer> cornerHashMap;
    public OrderOneWinnigStrategy(int dimension){
        this.dimension = dimension;
        this.rowHashMapList = new ArrayList<>();
        this.colHashMapList =new ArrayList<>();
        this.rightDignonal = new HashMap<>();
        this.leftDignonal = new HashMap<>();
        for(int i = 0; i<dimension; i++){
            rowHashMapList.add(new HashMap<>());
            colHashMapList.add(new HashMap<>());
        }

    }

    @Override
    public Players checkWinner(Board board, Move lastMove) {
        Players player = lastMove.getPlayers();
        char symbol = player.getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();

        boolean winnerResult = checkCorner(row,col) && winnerCheckForCorners(board.getMatrix(), symbol)
                ||checkAndUpdateForRowHashMap(row,symbol)
                || checkAndUpdateForColHashMap(col,symbol)
                || ( checkLeftDiagonal(row, col) && checkAndUpdateLeftDiagonalHashmap(symbol))
                || ( checkRightDiagonal(row, col) && checkAndUpdateRightDiagonalHashmap(symbol));

        if (winnerResult)
            return player;
        else
            return null;


    }


    private  boolean checkLeftDiagonal(int row,int col){
        return row==col;
    }
    private boolean checkRightDiagonal(int row , int col){
        return ((row+col)==(dimension -1));
    }
    private  boolean checkCorner(int row ,int col){
        return (
                (row ==0 && col ==0)
                        || (row==0 && col ==dimension-1)
                || (row ==dimension -1 && col ==0)
                || (row ==dimension -1 && col ==dimension -1)


                );
    }
    private  boolean checkAndUpdateForRowHashMap(int row ,char symbol){
        HashMap<Character, Integer> rowHasMap = rowHashMapList.get(row);
        if (rowHasMap.containsKey(symbol)){
            rowHasMap.put(symbol, rowHasMap.get(symbol)+1);
            return  rowHasMap.get(symbol)==dimension;

        }else{
            rowHasMap.put(symbol,1);
        }
        return false;


    }
    private  boolean checkAndUpdateForColHashMap(int col ,char symbol){
        HashMap<Character, Integer> colHashMap = colHashMapList.get(col);
        if (colHashMap.containsKey(symbol)){
            colHashMap.put(symbol, colHashMap.get(symbol)+1);
            return  colHashMap.get(symbol)==dimension;

        }else{
            colHashMap.put(symbol,1);
        }
        return false;


    }
    private  boolean checkAndUpdateLeftDiagonalHashmap(char symbol){
        if (leftDignonal.containsKey(symbol)){
            leftDignonal.put(symbol,leftDignonal.get(symbol)+1);
            return leftDignonal.get(symbol)==dimension;
        }else {
            leftDignonal.put(symbol,1);
        }
        return  false;
    }
    private  boolean checkAndUpdateRightDiagonalHashmap(char symbol){
        if (rightDignonal.containsKey(symbol)){
            rightDignonal.put(symbol,rightDignonal.get(symbol)+1);
            return rightDignonal.get(symbol)==dimension;
        }else {
            rightDignonal.put(symbol,1);
        }
        return  false;
    }


    private boolean winnerCheckForCorners(List<List<Cell>> matrix, char symbol){
        if (cornerHashMap.containsKey(symbol)) {
            cornerHashMap.put(symbol, cornerHashMap.get(symbol) + 1);
            return cornerHashMap.get(symbol) == 4;
        }else {
            cornerHashMap.put(symbol,1);


        }
        return false;


    }



}
