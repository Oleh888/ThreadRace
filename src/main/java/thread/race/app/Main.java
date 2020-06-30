package thread.race.app;

public class Main {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        FirstThreadDemo firstThreadDemo = new FirstThreadDemo(incrementer);
        Thread secondThread = new Thread(new SecondThreadDemo(incrementer));
        firstThreadDemo.start();
        secondThread.start();
    }
}
