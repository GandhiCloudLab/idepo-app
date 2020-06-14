package com.idepo.stockservice.util;

public class NumberUtil {

    public static int object2Int(Object text1) {
        int result = 0;
        try {
            result = Integer.parseInt((String) text1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
