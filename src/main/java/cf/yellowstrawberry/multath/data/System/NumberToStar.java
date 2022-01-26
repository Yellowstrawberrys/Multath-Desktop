package cf.yellowstrawberry.multath.data.System;

public class NumberToStar {
    public static String toStar(int num){
        if(!(num > 5)){
            StringBuilder sb = new StringBuilder();
            sb.append("★".repeat(Math.max(0, num)));
            sb.append("☆".repeat(Math.max(0, 5 - sb.length())));
            return sb.toString();
        }else
            return null;
    }
}
