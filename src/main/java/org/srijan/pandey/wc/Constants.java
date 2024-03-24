package org.srijan.pandey.wc;

public class Constants {

    public static final String HELP_STRING = "Usage: wc [OPTION]... [FILE]...\n" +
            "  or:  wc [OPTION]... --files0-from=F\n" +
            "Print newline, word, and byte counts for each FILE, and a total line if\n" +
            "more than one FILE is specified.  A word is a non-zero-length sequence of\n" +
            "characters delimited by white space.\n" +
            "\n" +
            "With no FILE, or when FILE is -, read standard input.\n" +
            "\n" +
            "The options below may be used to select which counts are printed, always in\n" +
            "the following order: newline, word, character, byte, maximum line length.\n" +
            "  -c, --bytes            print the byte counts\n" +
            "  -m, --chars            print the character counts\n" +
            "  -l, --lines            print the newline counts\n" +
            "      --files0-from=F    read input from the files specified by\n" +
            "                           NUL-terminated names in file F;\n" +
            "                           If F is - then read names from standard input\n" +
            "  -L, --max-line-length  print the maximum display width\n" +
            "  -w, --words            print the word counts\n" +
            "      --help     display this help and exit\n" +
            "      --version  output version information and exit\n";


    public static final String VERSION = "wc (GNU coreutils) 8.32\n" +
            "Copyright (C) 2024 Free Software Foundation, Inc.\n" +
            "This is free software: you are free to change and redistribute it.\n" +
            "There is NO WARRANTY, to the extent permitted by law.\n" +
            "\n" +
            "Written by Srijan Pandey.";
}
