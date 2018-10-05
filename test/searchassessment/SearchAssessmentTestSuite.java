package searchassessment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This TestSuite class simply runs the two unit test classes listed.
 *
 * To run this test suite, select the class in the project explorer, right click
 * on it and select RUN.
 *
 * @author Computer Power Plus
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({searchassessment.BinarySearchStringTest.class, searchassessment.SequentialSearchStringTest.class})
public class SearchAssessmentTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
