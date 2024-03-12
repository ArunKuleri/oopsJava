package projects.TickTakToe.Cotroller.model;

public class Bot extends Players{
    private BotDiificultyLevel botDiificultyLevel;

    public Bot(int id,  char symbol,  BotDiificultyLevel botDiificultyLevel) {
        super(id, "Chitti", symbol,PlayerType.BOT);
        this.botDiificultyLevel = botDiificultyLevel;
    }
    @Override
    public Move makeMove(Board board){
        return null;

    }
}
