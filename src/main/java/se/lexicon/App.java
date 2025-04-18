package se.lexicon;


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
        } else {
            System.out.println("Name not found.");
        }
        //test clear() method to remove all names
        //call the clear() methods to empty the name repo
        NameRepository.clear();
        System.out.println("Size after clearing: " + NameRepository.getSize());
        System.out.println("All names after clearing: ");
        // print the result of the clear(): No names found
        printNames(NameRepository.findAll());

        // Test add() again after clearing and print names only once after all actions
        NameRepository.add("Agnes Nazie");
        NameRepository.add("Nazie Agnes");
        NameRepository.add("Mehrdad Javan");
        NameRepository.add("Javan Mehrdad");
        NameRepository.add("Erik Svensson ");
        // print size of the name repo: size 5
        System.out.println("Size after adding Names: " + NameRepository.getSize());
        //print names in the repo
        printNames(NameRepository.findAll());

        // Test add() duplicate name
        //declare array and initialize it
        boolean addDuplicate = NameRepository.add("Agnes Nazie");
        // print result: false
        System.out.println("Add duplicate Agnes Nazie: " + addDuplicate);


        // Test findByFirstName()
        //declare array and initialize it
        String[] firstNameResults = NameRepository.findByFirstName("Mehrdad");
        System.out.println("Find by first name 'Mehrdad': ");
        printNames(firstNameResults);

        //test by findByLastName()
        String[] lastNameResults = NameRepository.findByLastName("Svensson");
        System.out.println("Find by last name 'Svensson': ");
        printNames(lastNameResults);

        //test update()
        boolean updated = NameRepository.update("Nazie Agnes", "Nazie Che");
        System.out.println("updated Nazie Agnes with Nazie Che :" + updated);
        //print names after updating you call the findAll method
        printNames(NameRepository.findAll());

        //test the remove()
        //declare variable and initialise it
        boolean remove = NameRepository.remove("Javan Mehrdad");
        System.out.println("remove Javan Mehrdad: " + remove);
        //print all names after updating by calling the findAll ()
        printNames(NameRepository.findAll());

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
