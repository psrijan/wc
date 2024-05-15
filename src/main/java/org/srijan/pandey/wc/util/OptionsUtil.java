package org.srijan.pandey.wc.util;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class OptionsUtil {

    public static Options generateOptions() {
        Options options = new Options();
        options.addOption(new Option("h", "help", false, "print help information"));
        options.addOption(new Option("c", "byte", false , "print the byte count"));
        options.addOption(new Option("m", "chars", false, "print the character count"));
        options.addOption(new Option("l", "lines", false, "print the newline counts"));
        options.addOption(new Option("L", "max-line-length", false, "print the maximum " +
                "line length"));
        options.addOption(new Option("w", "words", false,"print the word counts"));
        options.addOption(new Option("version", "output version information and exit"));
        return options;
    }

}
