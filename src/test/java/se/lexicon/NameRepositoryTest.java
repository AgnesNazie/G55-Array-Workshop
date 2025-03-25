package se.lexicon;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit 5 tests for the NameRepository class.
 */
public class NameRepositoryTest {

    @BeforeEach
    void Setup() {
        //reset the names Array before each test
        // the main reason is because I need to initialise values for multiple tests
        String[] initialNames ={"Erik Svensson", "Mehrdad Javan"};
        NameRepository.setNames(initialNames);
    }
    @Test
    void testSetName() {
        //create a new array and initialise it (arrange)
        String[] newNames = {"Agnes Nazie", " Che Mbo"};
        //call the setName method (act)
        NameRepository.setNames(newNames);
        //check the result (assert)
        assertArrayEquals(newNames, NameRepository.findAll());
    }
    @Test
    void testGetSize() {
        assertEquals(2, NameRepository.getSize());

    }

}
