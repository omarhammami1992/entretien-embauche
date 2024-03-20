package com.neosoft.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StringChecker {

    private  static final Map<String, String> openCloseChars = Map.of(
            "(", ")",
            "[", "]"
    );

    public static boolean check(String stringToCheck) {
        final List<String> characters = Arrays.asList(stringToCheck.split(""));
        Stack<String> stack = new Stack<>();
        for (String c : characters) {
            if (openCloseChars.containsKey(c)) {
                stack.push(c);
            } else if (openCloseChars.containsValue(c)) {
                if (stack.empty()) {
                    return false;
                }
                final String closeingCharacterAssociatedToLastPushedCharacter = openCloseChars.get(stack.peek());
                if (!closeingCharacterAssociatedToLastPushedCharacter.equals(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }

    // public static boolean check(String string) {
    //     AtomicInteger ouvrant = new AtomicInteger();
    //     AtomicInteger fermant = new AtomicInteger();
    //     final List<String> chars = Arrays.asList(string.split(""));
    //     for (String s : chars) {
    //         if (s.equals("(")) {
    //             ouvrant.getAndIncrement();
    //         } else if (s.equals(")")) {
    //             fermant.getAndIncrement();
    //         }
    //         if (fermant.get() > ouvrant.get()) {
    //             return false;
    //         }
    //     }
    //     return ouvrant.get() == (fermant.get());
    // }
}
