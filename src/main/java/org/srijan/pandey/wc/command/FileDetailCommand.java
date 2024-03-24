package org.srijan.pandey.wc.command;

import org.apache.commons.cli.CommandLine;

import java.io.*;
import java.util.List;

public class FileDetailCommand implements WcCommand {

    private int wordCount = 0;
    private int totalLineCounts = 0;
    private int totalCharacterCounts = 0;
    private int maxLineWidth = 0;

    private long byteCount = 0;

    private String fileName = null;


    private CommandLine cmd;

    // if space then isSkip false
    // if other value and isSkip then just continue
    // if other value nad not isSkip then increment totalWord count and move on setting is skip true

    public FileDetailCommand(CommandLine cmd) {
        this.cmd = cmd;

        List<String> argList = cmd.getArgList();

        if (argList != null && !argList.isEmpty()) {
            fileName = argList.get(argList.size() - 1);
        }
    }

    public void execute() {
        try {

            File file = new File(fileName);
            long fileSizeByte = file.length();
            BufferedReader br = new BufferedReader(new FileReader(file));

            char[] ch = new char[100];
            int count = 0;
            int totalWords = 0;
            int totalLineCount =0;
            int characterCount = 0;
            int maxLineWidth = 0;

            boolean isSkip = false;
            int curWidth = 0;

            while (br.ready() &&  (count = br.read(ch, 0, 100)) > 0) {

                characterCount += count;

                for (char i = 0;i < count; i++) {
                    char c = ch[i];
                    System.out.println(Character.toString(c));

                    if (Character.isWhitespace(c)) {
                        isSkip = false;
                    } else if (!isSkip && !Character.isWhitespace(c)) {
                        isSkip = true;
                        totalWords++;
                    }

                    // for line
                    if (c == '\n') {
                        totalLineCount++;
                    }

                    if (c != '\n') {
                        curWidth++;
                    } else {
                        maxLineWidth = Math.max(curWidth, maxLineWidth);
                        curWidth = 0;
                    }
                }
            }

            maxLineWidth = Math.max(curWidth, maxLineWidth);

            this.maxLineWidth = maxLineWidth;
            this.totalLineCounts = totalLineCount;
            this.totalCharacterCounts = characterCount;
            this.wordCount = totalWords;
            this.byteCount = fileSizeByte;

            printResult();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printResult() {
        StringBuffer sb = new StringBuffer();

        if (cmd.hasOption("l")) {
            sb.append(totalLineCounts).append(" ");
        }

        if (cmd.hasOption("w")) {
            sb.append(wordCount).append(" ");
        }

        if (cmd.hasOption("c")) {
            sb.append(byteCount).append(" ");
        }

        if(cmd.hasOption("m")) {
            sb.append(totalCharacterCounts).append(" ");
        }

        if (cmd.hasOption("L")) {
            sb.append(maxLineWidth).append(" ");
        }

        sb.append(fileName).append(" ");
        System.out.println(sb);
    }

}
