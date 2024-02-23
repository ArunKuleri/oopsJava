package projects.TickTakToe.Cotroller.model;

import projects.TickTakToe.Cotroller.Service.WinnigStrategy.BotPlayingStrategy.WinnigStrategy;
import projects.TickTakToe.Cotroller.exeception.InvalidBotException;
import projects.TickTakToe.Cotroller.exeception.InvalidPlayerSIzeException;
import projects.TickTakToe.Cotroller.exeception.InvalidSymbolSetUpException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board currentBoard;
    private List<Players> player;
    private Players currentPlayer;


    private GameStatus gameStatus;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinnigStrategy winnigStrategy;
    private int numberOfSymbols;


    public Game(Board currentBoard, List<Players> player, Players currentPlayer, GameStatus gameStatus, List<Move> moves, List<Board> boardStates, WinnigStrategy winnigStrategy, int numberOfSymbols) {
        this.currentBoard = currentBoard;
        this.player = player;
        this.currentPlayer = currentPlayer;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.winnigStrategy = winnigStrategy;
        this.numberOfSymbols = player.size();
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }

    public void setPlayer(List<Players> player) {
        this.player = player;
    }

    public void setCurrentPlayer(Players currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setBoardStates(List<Board> boardStates) {
        this.boardStates = boardStates;
    }

    public void setWinnigStrategy(WinnigStrategy winnigStrategy) {
        this.winnigStrategy = winnigStrategy;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public List<Players> getPlayer() {
        return player;
    }

    public Players getCurrentPlayer() {
        return currentPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public WinnigStrategy getWinnigStrategy() {
        return winnigStrategy;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public static class Builder {
        private Board currentBoard;
        private List<Players> player;
        private Players currentPlayer;
        private GameStatus gameStatus;
        private List<Move> moves;
        private List<Board> boardStates;
        private WinnigStrategy winnigStrategy;
        private int numberOfSymbols;

        public Builder setCurrentBoard(Board currentBoard) {
            this.currentBoard = currentBoard;
            return this;
        }

        public Builder setPlayer(List<Players> player) {
            this.player = player;
            return this;
        }

        public Builder setCurrentPlayer(Players currentPlayer) {
            this.currentPlayer = currentPlayer;
            return this;
        }

        public Builder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setBoardStates(List<Board> boardStates) {
            this.boardStates = boardStates;
            return this;
        }

        public Builder setWinnigStrategy(WinnigStrategy winnigStrategy) {
            this.winnigStrategy = winnigStrategy;
            return this;
        }

        public Builder setNumberOfSymbols(int numberOfSymbols) {
            this.numberOfSymbols = numberOfSymbols;
            return this;
        }

        private void validateNumberOfPlayers() {
            if (player.size() < currentBoard.getDimensions() - 2 || player.size() >= currentBoard.getDimensions() - 2) {
                throw new InvalidPlayerSIzeException("Player size should be n-1 or n-2 as per board");
            }
        }

        private void validatePlayerSymbol() {
            HashSet<Character> symbols = new HashSet<>();
            for (Players player : player) {
                symbols.add(player.getSymbol());

            }
            if (symbols.size() != player.size()) {
                throw new InvalidSymbolSetUpException("There shold be unique symbols");
            }
        }

        private void validateBotCount() {
            int botCount = 0;
            for (Players player : player) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if (botCount > 1 || botCount < 0) {
                throw new InvalidBotException("we can have maximum 1 bot per game ");
            }
        }

        private void validate() {
            validateBotCount();
            validatePlayerSymbol();
            validateNumberOfPlayers();
        }
    }
}

