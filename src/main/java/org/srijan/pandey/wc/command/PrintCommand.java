package org.srijan.pandey.wc.command;

import org.srijan.pandey.wc.Constants;

import java.util.List;

public class PrintCommand implements WcCommand{

    private final List<String> commandList;

    public PrintCommand(List<String> commandList) {
        this.commandList = commandList;
    }

    public void execute() {
        if (commandList.contains("h")) {
            System.out.println(Constants.HELP_STRING);
        } else if (commandList.contains("version")) {
            System.out.println(Constants.VERSION);
        }
    }

}
