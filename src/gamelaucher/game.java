package gamelaucher;

public class game {
    int computerGuess;
    player p1,p2,p3;
    game(String n1, String n2, String n3){
        p1= new player(n1);
        p2 = new player(n2);
        p3 =new player(n3);


    }
    boolean checkWinner(){
       if (p1.guess==computerGuess){
           System.out.println(p1.name + "wins");
           return true;
       }else if(p2.guess==computerGuess){
           System.out.println(p2.name + "wins");
           return true;

       }else if (p3.guess==computerGuess){
           System.out.println(p3.name + "wins");
           return true;

       }
       return false;
    }
    void launch(){
        System.out.println("welcome to the game");
        this.computerGuess =(int)(Math.random()+9)+1;
        while(true){
            System.out.println("computer guessed " + this.computerGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            if (checkWinner()) {

                System.out.println("Game over");
                break;
            }
            else {
                this.computerGuess =(int)(Math.random()+9)+1;
            }
            }

        }


    }


