import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calc.programs.CalculatorTest;
import calc.testing.testAddComplete;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, testAddComplete.class, testArrayList.class})

public class AllTestsUsingTestSuite {

}
