import org.junit.Before;
import org.junit.Test;

public class testingGame {
    RockPaperScissorsGame game = new RockPaperScissorsGame();

    // Tests the makeChoice method.

    @Before
    public void setUp() {
        game = new RockPaperScissorsGame();
    }

    @Test
    public void testMakeChoiceRock() {
        game.makeChoice(Choice.ROCK);
    }

    // Tests that it is possible to make a choice of paper and that paper beats rock.
    @Test
    public void MakeChoicePaperVSComputer() {
        game.makeChoice(Choice.PAPER);
        game.setComputerChoice(Choice.ROCK);
        game.playGame();
    }
    public void main(String[] args) {

    }
}
