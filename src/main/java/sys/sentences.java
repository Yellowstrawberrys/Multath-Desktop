package sys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sentences {
    public static List<String> Vegetables = new ArrayList<>();
    public static List<String> names = Arrays.asList("Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin", "Lucas", "Henry", "Alexander",
            "Olivia", "Emma", "Ava", "Charlotte", "Sophia", "Amelia", "Isabella", "Mia", "Evelyn", "Harper");
    public static List<String> plus(int type){
        if(type == 1){
            return Arrays.asList("There were %n1 of %f1 but %p1 bought %n2 of %f1. How many %v1 are there?");
        }else{
            return Arrays.asList("One Day, There were %n1 %f1 and %n2 %f2 in the table but at night, %n3 %f1 and %n4 %f2" +
                    "has been eaten by %p1, and she/he left letter in the table. That letter said \"If you find out" +
                    "how much I ate in %d1 then, I will give back your %f1 and %f2!\". How much %p1" +
                    "ate %f1 and %f2?");
        }
    }
    public static List<String> min(int type) {
        if(type == 1){
            return Arrays.asList("There were %n1 of %f1 but %p1 ate %n2 of %f1. How many %v1 left?");
        }else {
            return Arrays.asList("One Day, There were %n1 %f1 and %n2 %f2 in the table but at night, %n3 %f1 and %n4 %f2" +
                    "has been eaten by %p1, and she/he left letter in the table. That letter said \"If you find out" +
                    "how much I ate in %d1 then, I will give back your %f1 and %f2!\". How much %p1" +
                    "ate %f1 and %f2?");
        }
    }
    public static List<String> multiply = new ArrayList<>();
    public static List<String> division = new ArrayList<>();
}
