package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        // call more methods as needed

        // Test add() method to add a new name
        NameRepository.add("Agnes Nazie");
        System.out.println("Size after adding Agnes Nazie: " + NameRepository.getSize());


    }

    // created a Helper method to print names array
    private static void printNames(String[] names) {
        if (names.length == 0) {
            System.out.println("No names found.");
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }

    }
}
