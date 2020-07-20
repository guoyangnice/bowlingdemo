import java.util.List;

public class Frame {
    private List<Integer> rolls;

    public Frame(List<Integer> rolls){
        this.rolls = rolls;
    }

    //hits 表示每一次的倒瓶数
    public void roll(int hits){
        if(!isEnd()){
            rolls.add(hits);
        }
    }

    public int getScore(){
        int score = 0;
        for(int i = 0; i < rolls.size();i++){
            score += rolls.get(i);
        }
        return score;
    }

    public boolean isEnd(){
        return rolls.size() >= 2 ? true : false;
    }
}
