package thread.race.app;

import org.apache.log4j.Logger;

public class FirstThreadDemo extends Thread {
    private static final Logger LOGGER = Logger.getLogger(FirstThreadDemo.class);
    private final Incrementer incrementer;

    public FirstThreadDemo(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getCounter() <= 100) {
            incrementer.setCounter(incrementer.getCounter() + 1);
            LOGGER.info("Thread-0 value = " + incrementer.getCounter());
        }
    }
}
