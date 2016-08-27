package edu.dpacademy.template;


import java.sql.Timestamp;

public class QuickProcess extends WorkflowProcess {

    public void start(Timestamp startDate) {
        System.out.println("Process will be started at: " + startDate);
    }

    public void stop(Timestamp endDate) {
        System.out.println("Process will be finished at " + endDate);
    }

    protected void setInterval(int interval) {
        System.out.println("Process's intervals " + interval);
    }
}
