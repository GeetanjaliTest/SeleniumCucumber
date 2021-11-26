public class Log4jExample {

    public static void main(String[] args) {
        Logger logger= Logger.getLogger("Log4jExample");
        PropertyConfigurator.configure("log4j.properties");

        WebDriver driver = new FirefoxDriver();

        logger.info("browser opened");
    }

}