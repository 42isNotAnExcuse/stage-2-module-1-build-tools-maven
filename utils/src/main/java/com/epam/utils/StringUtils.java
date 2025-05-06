package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return str != null && !str.isEmpty() && Integer.parseInt(str) >= 0;
    }
}
