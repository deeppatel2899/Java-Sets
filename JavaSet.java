package com.deeppatel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        // Checking the Size of the Square Set and the Cube Set
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes !");

        // Grabing the UNION of both the Sets !
        Set<Integer> Union = new HashSet<>(squares);
        Union.addAll(cubes);
        System.out.println("Union contains " + Union.size() + " elements !");

        // Grabing the INTERSECTION of both the Sets !
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements !");

        //printing the intersection elements
        for (int i : intersection) {
            System.out.println(i + " is Square root of " + Math.sqrt(i) + " and is the cube root of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String[] arrWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrWords));

        for (String i : words) {
            System.out.println(i);
        }

        Set<String> A1 = new HashSet<>();
        Set<String> A2 = new HashSet<>();

        String[] A1Words = {"A", "B", "C", "D", "E"};
        A1.addAll(Arrays.asList(A1Words));

        String[] A2Words = {"A", "B", "F", "G", "H"};
        A2.addAll(Arrays.asList(A2Words));

        System.out.println("A1 - A2 : ");
        Set<String> diff1 = new HashSet<>(A1);
        diff1.removeAll(A2);
        printSet(diff1);

        System.out.println("A2 - A1 : ");
        Set<String> diff2 = new HashSet<>(A2);
        diff2.removeAll(A1);
        printSet(diff2);

        Set<String> unionTest  = new HashSet<>(A1);
        unionTest.addAll(A2);
        Set<String> intersectionTest = new HashSet<>(A1);
        intersectionTest.retainAll(A2);

        System.out.println("Symmetric Difference between A1 & A2 is ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);
    }
        private static void printSet(Set<String> set){
            System.out.println("\t");
            for(String s:set){
                System.out.println(s + " ");
            }
            System.out.println();
        }
