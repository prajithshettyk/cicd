package example;

import com.google.common.base.Joiner;

import java.io.Console;

public class Example {

    public static String join(String... args) {
        return Joiner.on(' ').join(args);
    }
}
