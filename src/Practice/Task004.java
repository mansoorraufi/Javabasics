package Practice;

public class Task004 {
    public interface WebDriver {
        void open();
        void close();
        String getTitle();
    }
    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }
    interface TakesScreenshot extends RemoteWebDriver{
        void getScreenshot();

    }
   public static class ChromeDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }
   public static class FirefoxDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }
  public static   class SafariDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }
    class Tester {
        public void main(String[] args) {

            WebDriver[] webs = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
            for (WebDriver web : webs) {

                web.close();
                web.open();
                web.getTitle();


            }
        }
    }}

