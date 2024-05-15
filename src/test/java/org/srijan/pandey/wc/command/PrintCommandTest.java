package org.srijan.pandey.wc.command;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrintCommandTest {

    PrintCommand helpCommand = new PrintCommand(List.of("h"));
    PrintCommand versionCommand = new PrintCommand(List.of("version"));

    @Test
    public void testHelpCommand() {
        helpCommand.execute();
    }

    @Test
    public void testVersionCommand() {
        versionCommand.execute();
    }
}
