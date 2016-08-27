package edu.dpacademy.strategy;

import java.security.Timestamp;

public interface WorkflowProcess {

    void start(Timestamp startDate);

    void stop(Timestamp endDate);

    void pause(Long seconds);
}
