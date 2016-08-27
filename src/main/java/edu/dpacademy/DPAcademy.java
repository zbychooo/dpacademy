package edu.dpacademy;

import edu.dpacademy.template.DelayProcess;
import edu.dpacademy.template.QuickProcess;
import edu.dpacademy.template.WorkflowProcess;
import org.apache.commons.cli.*;

import java.sql.Timestamp;

public class DPAcademy {


    //This is try of common cli library
    public static void main(String[] args) {

        Options options = new Options();
        Option pattern = new Option("t", "template", false, "run template pattern");
        pattern.setRequired(true);

        options.addOption(pattern);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("t")) {
                //System.out.println("s=" + cmd.getOptionValue("s"));
                invokeTemplateMethod();
            }
        } catch (ParseException e) {
            new HelpFormatter().printHelp("????", options);
            //e.printStackTrace();
        }
    }

    private static void invokeTemplateMethod() {

        Timestamp start = Timestamp.valueOf("2011-10-02 18:48:05.123456");
        Timestamp end = Timestamp.valueOf("2016-01-30 13:00:05.199056");
        int intervals = 20;

        WorkflowProcess quickProcess = new QuickProcess();
        quickProcess.executeWorkflow(start, end, intervals);

        intervals = 30;
        int delay = 25;
        WorkflowProcess delayProcess = new DelayProcess(delay);
        delayProcess.executeWorkflow(start, end, intervals);
    }
}
