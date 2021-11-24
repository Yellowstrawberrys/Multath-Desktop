package cf.yellowstrawberry.multath.system;

import cf.yellowstrawberry.multath.data.DataManager;
import cf.yellowstrawberry.multath.data.Enums.QuestionType;

public class SystemManager {
    public static void setQuestion(int Page, int QuestionNumber, QuestionType questionType){
        DataManager.getStage().setScene(DataManager.getSceneByID(3));
    }
    public static boolean isFinishedQuestion(int QuestionNumber){
        return false;
    }
}
