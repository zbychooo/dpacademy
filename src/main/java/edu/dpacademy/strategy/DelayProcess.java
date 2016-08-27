package edu.dpacademy.strategy;

import java.security.Timestamp;

public class DelayProcess implements WorkflowProcess {

    private long delaySeconds;

    public DelayProcess(long delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    public void start(Timestamp startDate) {
        System.out.println("Process will be started with at: " + startDate + " plus " + delaySeconds + " delay");
    }

    public void stop(Timestamp endDate) {
        System.out.println("Process will be finished at " + endDate);
    }

    public void pause(Long seconds) {
        System.out.println("Process has been paused for " + seconds);
    }

}
