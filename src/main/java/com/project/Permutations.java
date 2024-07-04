package com.project;

import java.util.ArrayList;
import java.util.HashSet;

public class Permutations {

    private static final ArrayList<String> permutationList = new ArrayList<>();

    private Permutations() {

    }

    static ArrayList<String> printPermutations(String string) {

        generatePermutations(string, "");
        ArrayList<String> returnPermutationList = new ArrayList<>(permutationList);
        permutationList.clear();
        return returnPermutationList;

    }

    static ArrayList<String> printPermutationsUnique(String string) {

        generatePermutations(string, "");
        HashSet<String> uniquePermutationList = new HashSet<>(permutationList);
        ArrayList<String> uniquePermutationListString = new ArrayList<>(uniquePermutationList);
        permutationList.clear();
        return uniquePermutationListString;

    }

    private static void generatePermutations(String string, String permutation) {

        if (string.length() == 0) {
            permutationList.add(permutation);
            return;
        }

        int permutationLength = string.length();

        for (int i = 0; i < permutationLength; i++) {

            char permutationLetter = string.charAt(i);

            String remainder = string.substring(0, i) + string.substring(i + 1);
            generatePermutations(remainder, permutation + permutationLetter);

        }

    }


}
