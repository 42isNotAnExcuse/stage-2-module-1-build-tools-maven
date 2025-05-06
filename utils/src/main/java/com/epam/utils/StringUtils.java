package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return str != null && !str.trim().isEmpty()
                    && (str.trim().matches("-?\\d*\\.?\\d+")
                    || Integer.parseInt(str) > 0
                    || Double.parseDouble(str) > 0
                    || Long.parseLong(str) > 0);
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
