package searchassessment;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * YOUR TASK: adjust these tests for your own purposes.
 *
 * @author Computer Power Plus
 */
public class SequentialSearchStringTest {

    public SequentialSearchStringTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of contains method, of class SequentialSearchString.
     */
    @Test
    public void testContains() {
        System.out.println("SequentialSearchString - Testing method: contains()");
        String[] collection;

        // Test case: very small array of single words
        collection = new String[]{"Hello", "World"};
        assertEquals(true, SearchAlgorithms.contains("Hello", collection));
        assertEquals(false, SearchAlgorithms.contains("Goodbye", collection));
        // Test case: case sensitivity
        // YOUR TASK: decide whether the sequential search should be case sensitive or not
        // and set the following assertions to false or true
//        assertEquals(true, SequentialSearchString.contains("hello", collection));
//        assertEquals(true, SequentialSearchString.contains("wORLD", collection));

        // Test case: array of 1 string
        collection = new String[]{"Hello"};
        assertEquals(true, SearchAlgorithms.contains("Hello", collection));
        assertEquals(false, SearchAlgorithms.contains("Goodbye", collection));

        // Test case: small array of phrases - exact match of entire phrase
        collection = new String[]{"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(true, SearchAlgorithms.contains("Star Wars", collection));
        assertEquals(true, SearchAlgorithms.contains("Thor: Rognarok", collection));
        assertEquals(false, SearchAlgorithms.contains("Thor", collection));
        assertEquals(false, SearchAlgorithms.contains("War", collection));
    }

    /**
     * Test of indexOf method, of class SequentialSearchString.
     */
    @Test
    public void testIndexOf() {
        System.out.println("SequentialSearchString - Testing method: index2()");
        String[] collection;

        // Test case: very small array of single words
        collection = new String[]{"Hello", "World"};
        assertEquals(0, SearchAlgorithms.index2("Hello", collection));
        assertEquals(1, SearchAlgorithms.index2("World", collection));
        assertEquals(-1, SearchAlgorithms.index2("Goodbye", collection));

        // Test case: small array of SORTED titles - exact match of entire title
        collection = new String[]{"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(0, SearchAlgorithms.index2("A Wrinkle in Time", collection));
        assertEquals(1, SearchAlgorithms.index2("Avengers: Infinity War", collection));
        assertEquals(2, SearchAlgorithms.index2("Star Wars", collection));
        assertEquals(3, SearchAlgorithms.index2("Thor: Rognarok", collection));
        assertEquals(-1, SearchAlgorithms.index2("Gone with the Wind", collection));

        // Test case: UNSORTED titles - itmes should be found all the same
        collection = new String[]{"Avengers: Infinity War", "Thor: Rognarok", "Star Wars", "A Wrinkle in Time"};
        assertEquals(3, SearchAlgorithms.index2("A Wrinkle in Time", collection));
        assertEquals(0, SearchAlgorithms.index2("Avengers: Infinity War", collection));
        assertEquals(2, SearchAlgorithms.index2("Star Wars", collection));
        assertEquals(1, SearchAlgorithms.index2("Thor: Rognarok", collection));
        assertEquals(-1, SearchAlgorithms.index2("Gone with the Wind", collection));

    }

    /**
     * Test of main method, of class SequentialSearchString.
     */
    @Test
    public void testMain() {
        System.out.println("SequentialSearchString - NOT YET Testing main method: ");
        String[] args = null;

        // YOUR TASK: 
        // - change the tests below to suit your situation, 
        // - create further tests for larger collections
        // - implement measurements in main class and write results to system.out
        // - when you run the file, copy-paste the test output listing 
        //   as evidence of your measurements
        // Test 100
//        System.out.println("== 100 items == 1. found, 2. not found");
//        args = new String[] {"Viens voir papa!", "movieTitles100.txt"};
//        SequentialSearchString.main(args);
//        args = new String[] {"The Professor and His Field Glass", "movieTitles100.txt"};
//        SequentialSearchString.main(args);
//
//
//        // Test 1000
//        System.out.println("== 1000 items == found ");
//        args = new String[] {"The Professor and His Field Glass", "movieTitles1K.txt"};
//        SequentialSearchString.main(args);
    }

}
