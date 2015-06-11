package quiz.enums;

/**
 * Created by 1 on 18.04.2015.
 */
public enum Answer {
    FIRST, SECOND, THIRD;

    public int getValue() {
        if(this==Answer.FIRST) return 1;
        else if(this==Answer.SECOND) return 2;
        else if(this==Answer.THIRD) return 3;
        else return 0;
    }
}
