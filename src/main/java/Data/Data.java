package Data;

public class Data {
    public static int level = 1;
    public static int grade = 1;
    public static String username = "";
    public static String icon = "";
    public static Learning learning = Learning.Non;
    protected static String token = "";

    public static String getToken(){
        return token;
    }

    public static void setToken(String Token){
        token = Token;
    }
}
