package edu.dpacademy;

import edu.dpacademy.prototype.DBSource;
import edu.dpacademy.prototype.DataSourceContainer;
import edu.dpacademy.prototype.Sourceable;
import edu.dpacademy.prototype.XMLSource;
import edu.dpacademy.template.DelayProcess;
import edu.dpacademy.template.QuickProcess;
import edu.dpacademy.template.WorkflowProcess;
import org.apache.commons.cli.*;

import java.sql.Timestamp;

public class DPAcademy {


    //This is try of common cli library
    public static void main(String[] args) {

        Options options = new Options();
        Option pattern = new Option("dp", "design_patterns", false, "run design patterns");
        pattern.setRequired(true);

        options.addOption(pattern);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("dp")) {
                //System.out.println("s=" + cmd.getOptionValue("s"));
                invokeTemplateMethod();
                invokePrototype();
            }
        } catch (ParseException e) {
            new HelpFormatter().printHelp("????", options);
            //e.printStackTrace();
        }
    }

    private static void invokeTemplateMethod() {

        System.out.println("----> template method: ");
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

    private static void invokePrototype() {

        System.out.println("----> prototype: ");
        Sourceable xml = DataSourceContainer.getInstance(XMLSource.class.getName());
        System.out.println(xml);
        Sourceable xmlClone = xml.clone();
        System.out.println(xmlClone);

        Sourceable db = DataSourceContainer.getInstance(DBSource.class.getName());
        System.out.println(db);
        Sourceable dbClone = db.clone();
        System.out.println(dbClone);
    }
}
