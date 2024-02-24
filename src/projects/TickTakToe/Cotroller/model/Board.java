package projects.TickTakToe.Cotroller.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimensions;
    private List<List<Cell>> matrix;
    public Board(int dimensions){
        this.dimensions = dimensions;
        matrix = new ArrayList<>();
        for (int i=0;i<dimensions;i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<dimensions;j++){
                matrix.get(i).add(new Cell(i,j));
            }
        }
    }
public void displayBoard(){
        for (int i =0; i<dimensions; i++){
            List<Cell> cells = matrix.get(i);
            for (Cell cell : cells){
                cell.displayCell();

            }
            System.out.println();
        }
}

    public int getDimensions() {
        return dimensions;
    }
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

}
