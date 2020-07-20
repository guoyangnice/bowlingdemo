import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BowlingGame bowlingGame= new BowlingGame(new ArrayList<>(),new Frame(new ArrayList<>()));
        for(int i = 0;i < 10;i++){
            bowlingGame.roll(0);
        }
        int score = bowlingGame.getScore();
        System.out.println(score);
        
        StringBuilder result = bowlingGame.showFramesScore();
        System.out.println(result);
    }
}
