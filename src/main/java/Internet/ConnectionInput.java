package Internet;

public interface ConnectionInput {
    default void onAuth(boolean success){}
    default void onVersion(String version){}
}
