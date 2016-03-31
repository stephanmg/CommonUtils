/// package's name
package de.zucker.syntaktischer.utils.test;

/// imports
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @brief test suite
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ClassFinderUtilTest.class, FileUtilTest.class, MemoryUtilTest.class})
public class CommonUtilsTestsuite {
}
