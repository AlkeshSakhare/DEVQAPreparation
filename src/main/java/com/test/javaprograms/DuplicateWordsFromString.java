package com.test.javaprograms;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordsFromString {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String dup[] = string.split(" ");
        int count = 0;
        String unique = "";
        Set<String> uniqueItem = new LinkedHashSet<>(List.of(string.split(" ")));
        for (String s : uniqueItem) {
            unique = unique + " " + s;
        }
        System.out.println(unique);
    }
}