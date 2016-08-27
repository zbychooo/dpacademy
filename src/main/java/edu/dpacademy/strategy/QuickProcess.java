package edu.dpacademy.strategy;

import java.security.Timestamp;

public class QuickProcess implements WorkflowProcess {


    public void start(Timestamp startDate) {
        System.out.println("Process will be started at: " + startDate);
    }

    public void stop(Timestamp endDate) {
        System.out.println("Process will be finished at " + endDate);
    }

    public void pause(Long seconds) {
        System.out.println("Process has been paused for " + seconds);
    }
}
