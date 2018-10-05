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
public class BinarySearchStringTest {

    public BinarySearchStringTest() {
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
     * Test of contains method, of class BinarySearchString.
     */
    @Test
    public void testContains() {
        System.out.println("Testing method: contains()");
        String[] collection;

        // Test case: very small array of single words
        collection = new String[]{"Hello", "World"};
        assertEquals(true, SearchAlgorithms.contains("Hello", collection));
        assertEquals(false, SearchAlgorithms.contains("Goodbye", collection));
        // Test case: case sensitive or not?
        // YOUR TASK: DECIDE IF THE BINARY SEARCH NEEDS TO BE CASE SENSITIVE OR NOT
        // AND SET THE FOLLOWING TESTS TO EITHER FALSE OR TRUE
        //assertEquals(false, BinarySearchString.contains("hello", collection));
        //assertEquals(true, BinarySearchString.contains("wORLD", collection));

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
     * Test of indexOf method, of class BinarySearchString.
     */
    @Test
    public void testIndexOf() {
        System.out.println("Testing method: index1()");
        String[] collection;

        // Test case: very small array of single words
        collection = new String[]{"Hello", "World"};
        assertEquals(0, SearchAlgorithms.index1("Hello", collection));
        assertEquals(1, SearchAlgorithms.index1("World", collection));
        assertEquals(-1, SearchAlgorithms.index1("Goodbye", collection));

        // Test case: small array of SORTED titles - exact match of entire title
        collection = new String[]{"A Wrinkle in Time", "Avengers: Infinity War", "Star Wars", "Thor: Rognarok"};
        assertEquals(0, SearchAlgorithms.index1("A Wrinkle in Time", collection));
        assertEquals(1, SearchAlgorithms.index1("Avengers: Infinity War", collection));
        assertEquals(2, SearchAlgorithms.index1("Star Wars", collection));
        assertEquals(3, SearchAlgorithms.index1("Thor: Rognarok", collection));
        assertEquals(-1, SearchAlgorithms.index1("Gone with the Wind", collection));

        // Test case: UNSORTED titles - only the sorted items at the start will be found
        collection = new String[]{"Avengers: Infinity War", "Thor: Rognarok", "Star Wars", "A Wrinkle in Time"};
        assertEquals(-1, SearchAlgorithms.index1("A Wrinkle in Time", collection));
        assertEquals(0, SearchAlgorithms.index1("Avengers: Infinity War", collection));
        assertEquals(-1, SearchAlgorithms.index1("Star Wars", collection));
        assertEquals(1, SearchAlgorithms.index1("Thor: Rognarok", collection));
        assertEquals(-1, SearchAlgorithms.index1("Gone with the Wind", collection));

    }

    /**
     * Test of main method, of class BinarySearchString.
     */
    @Test
    public void testMain() {
        System.out.println("NOT YET Testing main method: ");
        String[] args = null;

        // YOUR TASK: 
        // - change the tests below to suit your situation, 
        // - create further tests for larger collections
        // - implement measurements in main class and write results to system.out
        // - when you run the file, copy-paste the test output listing 
        //   as evidence of your measurements
        // Test 100
//        System.out.println("== 100 items == ");
//        args = new String[] {"Viens voir papa!", "movieTitles100.txt"};
//        BinarySearchString.main(args);
//        args = new String[] {"The Professor and His Field Glass", "movieTitles100.txt"};
//        BinarySearchString.main(args);
//        // Test 1000
//        System.out.println("== 1000 items == ");
//        args = new String[] {"The Professor and His Field Glass", "movieTitles1K.txt"};
//        BinarySearchString.main(args);
    }

}
