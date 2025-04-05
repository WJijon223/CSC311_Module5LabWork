package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("William");
        list.add("Michael");
        list.add("wplr");
        list.add("Java");
        list.add("sklkj");

        // Print the list
        System.out.print("Original List: ");
        printList(list);

        List<String> filteredList = list.stream().filter(word -> word.matches(".*[aeiouAEIOU].*")).collect(Collectors.toList());

        // Print the filtered list
        System.out.print("Filtered List (contains vowels): ");
        printList(filteredList);

        List<String> filteredList2 = list.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        // Print the filtered list with words longer than 5 characters
        System.out.print("Filtered List (words longer than 5 characters): ");
        printList(filteredList2);
    }

    public static void printList(List<String> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("The list is empty or null.");
            return;
        }
        System.out.print("List contents: ");
        for (String item : list) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
}