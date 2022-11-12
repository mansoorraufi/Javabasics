package Class22_UpCasting_Final;

public class WebDriverTester {
    public static void main(String[] args) {

   /*     Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/


        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        System.out.println("___________");
        for (int i = 0; i < browsers.length; i++) {
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }



          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */

    }

}
