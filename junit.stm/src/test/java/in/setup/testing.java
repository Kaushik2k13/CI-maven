package in.setup;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({checkTest.class, inttest.class})
public class testing {
	Result result = JUnitCore.runClasses(inttest.class);
}