package cf.yellowstrawberry.multath.system;

import cf.yellowstrawberry.multath.data.Enums.Level;
import cf.yellowstrawberry.multath.data.Enums.QuestionType;

import java.util.List;
import java.util.Queue;

public class QuestionSession {
    public QuestionType questionType;
    public Level level;
    public Queue<List<String>> questionsLeft;
    public boolean hasNextQuestionRequest;
    private List<String> currentQuestion;

    public QuestionSession(QuestionType questionType, Level level){
        this.questionType = questionType;
        this.level = level;
    }

    public String getQuestion(){
        currentQuestion = questionsLeft.remove();
        return currentQuestion.get(0);
    }

    public boolean isRightAnswer(String answer){
        return currentQuestion.get(1).equals(answer) || currentQuestion.get(1).contains(answer);
    }

    public void sendNextQuestionRequest(){
        hasNextQuestionRequest = true;
    }
}
