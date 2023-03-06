import java.util.Random;

public class RockPaperScissorsGame {
    private Choice playerChoice;
    private Choice computerChoice;
    public RockPaperScissorsGame() {

    }

    public void makeChoice(Choice choice){
        playerChoice = choice;
    }

    public void setComputerChoice(){
        computerChoice = Choice.values()[new Random().nextInt(3)];
    }
    public void setComputerChoice(Choice choice){
        computerChoice = choice;
    }

    public void playGame(){
        if(playerChoice.equals(computerChoice)){
            System.out.println("Tie!");
        }
        else if(playerChoice.equals(Choice.ROCK)){
            if(computerChoice.equals(Choice.SCISSORS)){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(playerChoice.equals(Choice.PAPER)){
            if(computerChoice.equals(Choice.ROCK)){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
    }
}
enum Choice {
    ROCK,
    PAPER,
    SCISSORS;
}
