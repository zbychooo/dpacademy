package edu.dpacademy.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * This is dpacademy. Good Luck!
 */
public class FacadeTrial {

    public static void main(String args[]) {
        MachineFacade mf = new MachineFacade();
        mf.runMachineWithWorker("washingmachine", "wash clothes");
    }
}

@Data
@AllArgsConstructor
class Task {
    private long id;
    private String title;
    private String description;
}

@Data
@AllArgsConstructor
class Worker {
    private long id;
    private String name;
}

@Data
class MachineFacade {

    private long id;
    private String name;
    private Worker worker;
    private Task task;

    public void runMachineWithWorker(String machineName, String taskForMachine) {

        this.id = generateId();
        this.name = machineName;
        this.task = new Task(generateId(), taskForMachine, taskForMachine);
        this.worker = assignWorker();

    }

    private Worker assignWorker() {
        return new Worker(1, "Frank");
    }

    private long generateId() {
        return 0;

    }


}
