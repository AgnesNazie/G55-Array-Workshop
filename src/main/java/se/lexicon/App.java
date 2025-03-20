package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "Agnes nazie", "Fidelis Fuche"});
        System.out.println(NameRepository.getSize());
        //declare a variable to store the new names
        String [] allNames = NameRepository.findAll();
        //print names.loop through
        for (String name : allNames) {
            System.out.println(name);
        }
        // call more methods as needed
    }
}