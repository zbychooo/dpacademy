package edu.dpacademy.template;

import java.sql.Timestamp;

public abstract class WorkflowProcess {

    protected abstract void start(Timestamp startDate);

    protected abstract void stop(Timestamp endDate);

    protected abstract void setInterval(int interval);

    public void executeWorkflow(Timestamp start, Timestamp end, int interval) {
        start(start);
        setInterval(interval);
        stop(end);
    }
}
