package projects.TickTakToe.Cotroller.model;

public class Cell {
    private int row;
    private int col;
    private  CellState cellState;
    private  Players players;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.players = null;
    }
    public void displayCell(){
        if (players == null){
            System.out.print(" |  |");
        }else {
            System.out.print("|"+players.getSymbol() + '|');
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }
}
