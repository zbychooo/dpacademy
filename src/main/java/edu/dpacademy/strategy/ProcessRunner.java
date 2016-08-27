package edu.dpacademy.strategy;

import java.security.Timestamp;

public class ProcessRunner {

    private WorkflowProcess process;

    public ProcessRunner(WorkflowProcess process) {
        this.process = process;
    }

    public void executeWorkflow(Timestamp start, Long seconds, Timestamp end) {
        this.process.start(start);
        this.process.pause(seconds);
        this.process.stop(end);
    }

    public WorkflowProcess getProcess() {
        return process;
    }

    public void setProcess(WorkflowProcess process) {
        this.process = process;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProcessRunner{");
        sb.append("process=").append(process);
        sb.append('}');
        return sb.toString();
    }
}
