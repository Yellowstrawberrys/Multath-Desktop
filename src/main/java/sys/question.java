package sys;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class question {
    public List<String> generate(){
        List<String> sts = new ArrayList<>();
        Random r = new Random();
        if(Data.grade == 1){
            int num1 = r.nextInt(8)+1;
            int num2 = r.nextInt(8)+1;
            if(Data.level == 1){
                if(Data.learning.equals(Learning.MinPlus)){
                    sts.add(num1+" + "+num2);
                    sts.add(String.valueOf((num1+num2)));
                }
            }else if(Data.level == 2){

            }else{

            }
        }
        return sts;
    }
}
