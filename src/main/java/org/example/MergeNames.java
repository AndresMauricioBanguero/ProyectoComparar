package org.example;

import java.util.*;

public class MergeNames {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Emma"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        Set<String> union = new HashSet<>();
        union.addAll(Arrays.asList(names1));
        union.addAll(Arrays.asList(names2));
        System.out.println("Union of the two Sets with no duplicate names : " + union);

    }
}