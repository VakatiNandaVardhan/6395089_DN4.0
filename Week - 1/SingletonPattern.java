public class SingletonPattern {
    private static SingletonPattern instance;
    private SingletonPattern() {}
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        SingletonPattern logger1 = SingletonPattern.getInstance();
        SingletonPattern logger2 = SingletonPattern.getInstance();
        System.out.println(logger1 == logger2);
        logger1.log("Singleton works");
    }
}
