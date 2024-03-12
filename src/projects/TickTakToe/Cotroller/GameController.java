package projects.TickTakToe.Cotroller;

import projects.TickTakToe.Cotroller.Service.WinnigStrategy.BotPlayingStrategy.WinnigStrategy;
import projects.TickTakToe.Cotroller.model.Game;
import projects.TickTakToe.Cotroller.model.Move;
import projects.TickTakToe.Cotroller.model.Players;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Players> players, WinnigStrategy name){
        return null;
    }
    public void  displayBoard(Game game){

    }
    public  Players getGameStatus(Game game){
        return null;

    }
    public Move executeMove(Game game, Players players){
        return null;
    }
    public Players checkWinner(Game game, Move lastPlayed){
        return null;
    }
    public void replayGame(Game game){

    }

}
