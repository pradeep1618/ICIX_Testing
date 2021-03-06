package icix.Utils;

import org.apache.log4j.Logger;
import org.testng.Reporter;

public class ConsoleLog {

  private static Logger Log = Logger.getLogger(ConsoleLog.class.getSimpleName());


  public static void info(String message) {
    Log.info(message);
    Reporter.log(message);
    System.out.println(message);
  }

  public static void warn(String message) {
    Log.info(message);
    Reporter.log(message);
    System.out.println(message);
  }
}
