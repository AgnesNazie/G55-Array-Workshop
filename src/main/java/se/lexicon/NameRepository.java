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
        // use setNames method  to empty array
        setNames(new String[0]);

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
        int i = 0;
        //loop through to copy elements
        for (String name : names) {
            copyOfNames[i++] = name;
        }
        return copyOfNames;
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
            //not to add if it already exists
            return false;
        }

        //create a new array  to store the added names ( +1) represent the space for the name
        String[] newNames = new String[names.length + 1];
        int index = 0;
        //loop through the names
        for (String name : names) {
            newNames[index++] = name;
        }
        //add the new name at the end of the array
        newNames[names.length] = fullName;
        //reuse setName method to update the array

        setNames(newNames);
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
        int count = 0;
        // loop through to count matching names
        for (String name : names) {
            String[] halfName = name.split(" ");
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                count++;
            }
        }
        //create array to store the count
        String[] result = new String[count];
        int index = 0;
        // loop through to store matching names
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                result[index++] = name;
            }
        }
        return result;
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
        int count = 0;
        // loop through to count matching names
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                count++;
            }
        }
        //create array to store the count
        String[] result = new String[count];
        int index = 0;
        // loop through to store matching names
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                result[index++] = name;
            }
        }
        return result;
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

        // if the name do not exist or updated names exists, we do not need to duplicate
        if (find(original) == null || find(updatedName) != null) {
            return false;
        }
        // create an array to update the name
        String[] newNames = new String[names.length];
        int index = 0;

        for (String name : names) {
            if (name.equalsIgnoreCase(original)) {
                //  replace original with updatedName
                newNames[index++] = updatedName;
            } else {
                newNames[index++] = name;
            }
        }
        setNames(newNames);
        return true;
    }

    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        //todo: implement remove method
        //check if the name exists
        if (find(fullName) == null) {
            return false;
        }
        // if not, create a new array with (-1) space
        String[] newNames = new String[names.length - 1];
        int index = 0;
        //find the index of the name to remove by looping through
        for (String name : names) {
            //skip the name to remove
            if (!name.equalsIgnoreCase(fullName)) {
                newNames[index++] = name;
            }
        }

        // update array with the setNames() method
        setNames(newNames);
        return true;
    }
}

