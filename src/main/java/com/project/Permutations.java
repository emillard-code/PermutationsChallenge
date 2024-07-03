package com.project;

import java.util.ArrayList;

public class Permutations {

    private static final ArrayList<String> permutationList = new ArrayList<>();

    private Permutations() {

    }

    static void printPermutations(String string) {

        generatePermutations(string, "");
        System.out.println(permutationList);

    }

    static void printPermutationsUnique() {

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
