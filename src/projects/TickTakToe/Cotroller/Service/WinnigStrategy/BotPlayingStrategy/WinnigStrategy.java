package projects.TickTakToe.Cotroller.Service.WinnigStrategy.BotPlayingStrategy;

import projects.TickTakToe.Cotroller.model.Board;
import projects.TickTakToe.Cotroller.model.Move;
import projects.TickTakToe.Cotroller.model.Players;

public interface WinnigStrategy {
    Players checkWinner(Board board, Move lastMove);
}
