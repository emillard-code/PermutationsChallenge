package com.project;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args ) {

        print(Permutations.permutationsList("test").toString());
        print(Permutations.permutationsListUnique("test").toString());

    }

    public static void print(String string) {

        System.out.println(string);

    }

}
