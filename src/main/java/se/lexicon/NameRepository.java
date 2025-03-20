package se.lexicon;

import java.util.Arrays;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0];


    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        //todo: implement getSize method
        //get the size of an array
        return names.length;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param names The array of names to set.
     */
    public static void setNames(String[] names) {
        //todo: implement setNames method
        //replace the names in the array with a new array
       NameRepository.names = names;
    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        //todo: implement clear method
        //set names to a new empty array
        names = new String[0];

    }


    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        //todo: implement findAll method
        // create a new array with the same size
        String[] copyOfNames = new String[names.length];
        //copy all elements from names to copyOfNames
        System.arraycopy(names,0,copyOfNames,0,names.length);

        //return the new array
        return Arrays.copyOf(names, names.length);
    }


    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(String fullName) {
        //todo: implement find method
        // use loop to go through all names in the array
        for (String name : names) {
            // check case-sensitive match
            if (name.equalsIgnoreCase(fullName)) {
                // return the name if it is available
                return name;
            }
        }
        // no match if it is not in the list of names
        return null;
    }


    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(String fullName) {
        //todo: implement add method
        // to add fullName only if it do not exist. i used null because we are dealing with string datatype
       //to check if the name already exist
        if (find(fullName) != null) {

            //not to add if it already exist
            return false;
        }
        //create a new array with space to add the name( +1) represent the space for the name
        names = Arrays.copyOf(names, names.length + 1);

        //add the new name(-1 0 represents the last index in java
        names[names.length - 1] = fullName;

        //adds name
        return true;
    }


    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(String firstName) {
        //todo: findByFirstName method
        // declare variable and initialize it for the count. this is store the count temporary
        int count =0;
        // loop through to count matching names
        for (String name:names) {
            String[] halfName = name.split(" ");
            if (halfName[0].equalsIgnoreCase(firstName)) {
                count++;
            }
        }
        //create array to store the count
        String[] result = new String[count];
        int index =0;
        // loop through to store matching names
        for (String  name: names) {
            String[] halfName = name.split(" ");
            if (halfName[0].equalsIgnoreCase(firstName)) {
                result[index++] = name;
            }
        }
        return null;
    }


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(String lastName) {
        //todo: implement findByLastName method
       // declare variable and initialize it for the count. this is store the count temporary
        int count =0;
        // loop through to count matching names
        for (String name:names) {
            String[] halfName = name.split(" ");
            if (halfName.length > 1 && halfName[1].equalsIgnoreCase(lastName)) {
                count++;
            }
        }
        //create array to store the count
        String[] result = new String[count];
        int index =0;
        // loop through to store matching names
        for (String  name: names) {
            String[] halfName = name.split(" ");
            if (halfName.length> 1 && halfName[1].equalsIgnoreCase(lastName)) {
                result[index++] = name;
            }
        }
        return null;
    }


    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(String original, String updatedName) {
        //todo: implement update method
        return false;
    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        //todo: implement remove method
        return false;
    }


}