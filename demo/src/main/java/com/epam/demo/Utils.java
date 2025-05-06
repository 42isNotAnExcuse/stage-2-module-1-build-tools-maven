package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream()
                .allMatch(n ->
                        n != null && n.isEmpty() && Integer.parseInt(n) >= 0);
    }
}