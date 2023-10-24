package demo

import org.junit.runner.JUnitCore
import org.junit.runner.Result
import org.junit.runner.notification.Failure

class TestRunner {
   public static void main(String[] args) {
//        System.out.println("printing ");
//        Result result = JUnitCore.runClasses(JunitTestSuite.class); // This is also working ok
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//
//        System.out.println(result.wasSuccessful());

       JUnitCore core = new JUnitCore()
       core.run(JunitTestSuite.class) // This is also working ok
    }
}
