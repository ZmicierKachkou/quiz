package quiz.dto;

import quiz.enums.Answer;

/**
 * Created by 1 on 18.04.2015.
 */
public class Answers {
    private Answer answers[] = new Answer[4];

    public Answer getAnswer(int i) {
        return answers[i];
    }

    public void setAnswer(Answer answer, int i) {
        answers[i] = answer;
    }

    public Answer getResult() {
        int res = 0;
        for(Answer a: answers) {
            res+=a.getValue();
        }
        if(res<8) return Answer.FIRST;
        else if(res<11) return Answer.SECOND;
        else return Answer.THIRD;
    }
}
