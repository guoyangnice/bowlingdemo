import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BowlingGame bowlingGame= new BowlingGame(new ArrayList<>(),new Frame(new ArrayList<>()));
        for(int i = 0;i < 10;i++){
            bowlingGame.roll(0);
        }
        int score = bowlingGame.getScore();
        System.out.println(score);

        int rolls[] = {1,1,1,1};
        for(int i = 0;i < rolls.length;i++){
            bowlingGame.roll(rolls[i]);
        }
        StringBuilder result = bowlingGame.showFramesScore();
        System.out.println(result);


    }
}
