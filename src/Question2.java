public class Question2 {
    private static Question2 ourInstance = new Question2();

    public static synchronized Question2  getInstance() {
        return ourInstance;
    }

    private Question2() {
    }
}
