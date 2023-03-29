package org.mapsa.Q2;

import java.util.Collections;
import java.util.Hashtable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(isUnique("salam"));

    }


    public static boolean isUnique(String str) {
        Hashtable<Integer, Character> hashtable = new Hashtable<>();


        str.chars().forEach(x -> hashtable.put(x, (char)x));

        return str.length() == hashtable.size();

    }
}
