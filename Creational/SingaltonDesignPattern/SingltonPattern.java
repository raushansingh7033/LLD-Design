
/**
 * 
 * The Singleton pattern is a creational design pattern that restricts the
 * instantiation of a class to a single object. This is useful when exactly one
 * object of a class is needed to coordinate actions across the system.
 * 
 * 
 */
class Logger {
  private static Logger instance;

  private Logger() {
  }

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String msg) {
    System.out.println("this is " + msg);
  }
}

public class SingltonPattern {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    logger.log("Application started.");
  }

}
