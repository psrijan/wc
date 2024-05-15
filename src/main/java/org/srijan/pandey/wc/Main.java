package org.srijan.pandey.wc;

import org.apache.commons.cli.*;
import org.srijan.pandey.wc.util.OptionsUtil;

public class Main {
    public static void main(String[] args) {
        Options options = OptionsUtil.generateOptions();
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
