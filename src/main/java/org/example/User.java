package org.example;

import org.testng.annotations.Test;

import java.util.Locale;

public class User {


    @Test
    public boolean checkAge(int a) {
        if (a >= 18 || a < 100) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkPassword(String p) {
        String p2 = p.toLowerCase();
        if (!p.equals(p2)) {
        }

        if (p.contains(".") || p.contains(",") || p.contains("!") || p.contains("&")) {
        }
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isDigit(c)) {
            }
        }
        if (p.length() <= 8) {
        }
        return true;
    }
}
