package edu.dpacademy;

import org.apache.commons.cli.*;

public class DPAcademy {

    //This is try of common cli library
    public static void main( String[] args ) {

        Options options = new Options();
        Option pattern = new Option("p", "pattern", true, "the name of the pattern");
        pattern.setRequired(true);

        options.addOption(pattern);

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            if(cmd.hasOption("p")) {
                System.out.println("p=" + cmd.getOptionValue("p"));
            }
        } catch (ParseException e) {
            new HelpFormatter().printHelp("????", options);
            //e.printStackTrace();
        }
    }
}
