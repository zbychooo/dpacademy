package edu.dpacademy;

import edu.dpacademy.strategy.DelayProcess;
import edu.dpacademy.strategy.ProcessRunner;
import edu.dpacademy.strategy.QuickProcess;
import edu.dpacademy.strategy.WorkflowProcess;
import org.apache.commons.cli.*;

import java.security.Timestamp;

public class DPAcademy {

    //This is try of common cli library
    public static void main(String[] args) {

        Options options = new Options();
        Option pattern = new Option("s", "strategy", false, "run strategy pattern");
        pattern.setRequired(true);

        options.addOption(pattern);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("s")) {
                //System.out.println("s=" + cmd.getOptionValue("s"));
                invokeStrategy();
            }
        } catch (ParseException e) {
            new HelpFormatter().printHelp("????", options);
            //e.printStackTrace();
        }
    }

    private static void invokeStrategy() {
        WorkflowProcess workflowProcess = new QuickProcess();
        ProcessRunner processRunner = new ProcessRunner(workflowProcess);
        Timestamp start = null;
        Long sec = null;
        Timestamp end = null;
        processRunner.executeWorkflow(start, sec, end);


        Long delay = 10L;
        workflowProcess = new DelayProcess(delay);
        processRunner.setProcess(workflowProcess);
        processRunner.executeWorkflow(start, sec, end);
    }
}
