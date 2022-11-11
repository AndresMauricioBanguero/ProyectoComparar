package org.example;

import java.util.*;

public class MergeNames {

    public static void main(String[] args) {

        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        Set<String> mySet1 = new HashSet<String>(Arrays.asList(names1));
        Set<String> mySet2 = new HashSet<String>(Arrays.asList(names2));

        Set<String> union = new HashSet<String>(mySet1);
        union.addAll(mySet2);
        System.out.println("Union of the two Sets with no duplicate names : " + union);

    }
}