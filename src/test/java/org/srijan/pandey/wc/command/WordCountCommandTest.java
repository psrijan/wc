package org.srijan.pandey.wc.command;

import org.junit.jupiter.api.Test;

public class WordCountCommandTest {

    @Test
    public void testExecute() {
        FileDetailCommand wordCountCommand = new FileDetailCommand();
        wordCountCommand.execute();
        System.out.println("Result");
    }
}
