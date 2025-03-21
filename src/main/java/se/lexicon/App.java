package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        // call more methods as needed

        // Test add() method to add a new names
        //called the NameRepository.add () i created and initialised the element to add
        NameRepository.add("Agnes Nazie");
        NameRepository.add("Nazie Agnes");
        NameRepository.add("Javan Mehrdad");
        NameRepository.add("Svensson Erik");
        System.out.println("Size after adding Names: " + NameRepository.getSize());
        // call the helper method[printName()] to print all names
        printNames(NameRepository.findAll());

        // Test find() method for specific name search
        String foundName = NameRepository.find("Mehrdad Javan");
        if (foundName != null) {
            System.out.println("Found name: " + foundName); // Expected: "Erik Svensson"
        }
        else {
            System.out.println("Name not found.");
        }
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
