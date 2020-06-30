package thread.race.app;

import org.apache.log4j.Logger;

public class SecondThreadDemo implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(SecondThreadDemo.class);
    private final Incrementer incrementer;

    public SecondThreadDemo(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getCounter() <= 100) {
            incrementer.setCounter(incrementer.getCounter() + 1);
            LOGGER.info("Thread-1 value = " + incrementer.getCounter());
        }
    }
}
