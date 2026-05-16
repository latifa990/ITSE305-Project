package randooptests;
// Regression test suite 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ RegressionTest0.class, RegressionTest1.class, RegressionTest2.class, RegressionTest3.class })
public class RegressionTest {
}
