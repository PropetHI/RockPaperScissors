public class GameUI {
    public RockPaperScissorsGame game = new RockPaperScissorsGame();

    public void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 'rock', 'paper', or 'scissors' to play.");
        System.out.println("Enter 'quit' to quit the game.");
        String userInput = System.console().readLine();
        if(userInput.equals("quit")){
            System.out.println("Goodbye!");
        }
        else{
            game.makeChoice(Choice.valueOf(userInput.toUpperCase()));
            game.setComputerChoice();
            game.playGame();
        }
    }
}
