package org.example.view.commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum TradeMenuCommands {
    TRADE("trade -t (?<resource>\\w+( \\w+)?) -a (?<amount>\\d+) -p (?<price>\\d+) -u (?<username>\\w+)" +
            " -m (?<message>.*)"),
    TRADE_ACCEPT("trade accept -i (?<id>\\d+) -m (?<message>.*)")
    ;
    private final String regex;

    TradeMenuCommands(String regex) {
        this.regex = regex;
    }

    public static Matcher getMatcher(String input, TradeMenuCommands command) {
        Matcher matcher = Pattern.compile(command.regex).matcher(input);
        if(matcher.matches()) return matcher;
        else return null;
    }
}
