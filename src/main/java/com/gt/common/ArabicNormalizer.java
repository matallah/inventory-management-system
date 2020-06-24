package com.gt.common;

import java.io.UnsupportedEncodingException;

public class ArabicNormalizer {

    public static String ArabicNormalize(String input) {
        byte ptext[] = new byte[0];
        try {
            ptext = input.getBytes("UTF-8");
            return new String(ptext, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

}
