package projects.TickTakToe.Cotroller.model;

public class Move {

    private  Cell cell;
    private  Players players;

    public Move(Cell cell, Players players) {
        this.cell = cell;
        this.players = players;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }
}
