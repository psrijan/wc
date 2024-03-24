package org.srijan.pandey.wc;

import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) {
        Options options = new Options();
        options.addOption(new Option("h", "help", false, "print help information"));

        options.addOption(new Option("c", "byte", false , "print the byte count"));
        options.addOption(new Option("m", "chars", false, "print the character count"));
        options.addOption(new Option("l", "lines", false, "print the newline counts"));
        options.addOption(new Option("L", "max-line-length", false, "print the maximum " +
                "line length"));
        options.addOption(new Option("w", "words", false,"print the word counts"));
        options.addOption(new Option("version", "output version information and exit"));

        try {
            CommandLineParser commandLineParser = new DefaultParser();
            CommandLine commandLine = commandLineParser.parse(options, args);

            CommandDelegator commandDelegator = new CommandDelegator(commandLine);
            commandDelegator.delegate();


        } catch (ParseException ex ) {
            ex.printStackTrace();
        }
    }
}
