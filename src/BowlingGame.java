import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private List<Frame> frames;
    private Frame currentFrame;
    private int score;

    public BowlingGame(List<Frame> frames,Frame currentFrame){
        this.frames = frames;
        this.currentFrame = currentFrame;
    }

    public void roll(int hits){
        if(currentFrame.isEnd()){
            currentFrame = new Frame(new ArrayList<>());
            frames.add(currentFrame);

        }
        currentFrame.roll(hits);
    }

    public int getScore(){
        for(Frame frame : frames){
            this.score += frame.getScore();
        }
        return score;
    }

    public StringBuilder showFramesScore(){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < frames.size();i++){
            if(i == 0){
                sb.append(frames.get(i).getScore());
            }else{
                sb.append("|").append(frames.get(i).getScore());
            }
        }
        return sb;
    }

    public boolean isEnd() {
        return this.frames.size() >= 10 ? true : false;
    }
}
