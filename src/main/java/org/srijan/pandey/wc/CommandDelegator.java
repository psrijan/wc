package org.srijan.pandey.wc;

import org.apache.commons.cli.CommandLine;
import org.srijan.pandey.wc.command.FileDetailCommand;
import org.srijan.pandey.wc.command.PrintCommand;
import org.srijan.pandey.wc.command.WcCommand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandDelegator {

    private CommandLine commandLine;
    public CommandDelegator(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    public void delegate() {
        WcCommand wcCommand = null;
        if (commandLine.hasOption("h")) {
            wcCommand = new PrintCommand(List.of("h"));
            wcCommand.execute();
            return;
        } else if (commandLine.hasOption("version")) {
            wcCommand = new PrintCommand(List.of("version"));
            wcCommand.execute();
            return;
        }
        wcCommand = new FileDetailCommand(this.commandLine);
        wcCommand.execute();
    }


}
