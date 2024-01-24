package gamelaucher;

public class player {
    String name;
    int guess;
    player(String name){
        this.name= name;

    }
    void makeGuess(){
        this.guess = (int)(Math.random()*9)+1;
        System.out.println(this.name + "guessed " + this.guess);
    }
}
