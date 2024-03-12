package projects.TickTakToe.Cotroller.model;

import java.util.Scanner;

public class Players {
    private int id;
    private String name;
    private char symbol;
    private PlayerType playerType;
    public Players(){

    }

    public Players(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
    public  Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row for the target cell");
        int row = sc.nextInt();
        System.out.print("Enter the Column for the target cell");
        int col = sc.nextInt();
        Cell playedMoveCell = board.getMatrix().get(row).get(col);
        board.getMatrix().get(row).get(col).setCellState(CellState.FILLED);
        board.getMatrix().get(row).get(col).setPlayers(this);
        return new Move(playedMoveCell, this);


    }


    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
