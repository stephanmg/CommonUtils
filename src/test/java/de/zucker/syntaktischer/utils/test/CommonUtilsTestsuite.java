/// package's name
package de.zucker.syntaktischer.utils.test;

/// imports
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @brief test suite
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ClassFinderUtilTest.class, FileUtilTest.class, MemoryUtilTest.class})
public class CommonUtilsTestsuite {

	/**
	 * 
	 * @throws Exception 
	 */
	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	/**
	 * 
	 * @throws Exception 
	 */
	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	/**
	 * 
	 * @throws Exception 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 
	 * @throws Exception 
	 */
	@After
	public void tearDown() throws Exception {
	}
}
