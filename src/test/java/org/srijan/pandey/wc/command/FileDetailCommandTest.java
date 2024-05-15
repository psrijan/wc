package org.srijan.pandey.wc.command;

import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FileDetailCommandTest {


    @Mock
    CommandLine commandLine;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testExecute() {
        FileDetailCommand fileDetailCommand = new FileDetailCommand(commandLine);
        fileDetailCommand.printResult();

    }
}
