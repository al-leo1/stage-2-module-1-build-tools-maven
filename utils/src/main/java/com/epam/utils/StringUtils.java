package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isBlank(str)&&org.apache.commons.lang3.StringUtils.isNumeric(str)&& Integer.parseInt(str)>0;
    }
}
