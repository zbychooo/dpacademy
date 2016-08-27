package edu.dpacademy.template;


import java.sql.Timestamp;

public class DelayProcess extends WorkflowProcess {

    private long delaySeconds;

    public DelayProcess(long delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    public void start(Timestamp startDate) {
        System.out.println("Process will be started at: " + startDate + " plus " + delaySeconds + " delay");
    }

    public void stop(Timestamp endDate) {
        System.out.println("Process will be finished at " + endDate);
    }

    protected void setInterval(int interval) {
        System.out.println("Process's intervals " + interval);
    }
}
