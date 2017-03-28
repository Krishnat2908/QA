System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
FirefoxProfile profile = new FirefoxProfile();
//setting the local french : ‘fr’
profile.setPreference(“intl.accept_languages”,”fr”);
driver = new FirefoxDriver(profile);
driver.get(“http://google.co.in&#8221;);
Using Chrome Browser :


System.setProperty(“webdriver.chrome.driver”,”D:/DollarArchive/chromedriver.exe”);
ChromeOptions options = new ChromeOptions();
options.addArguments(“–lang= sl”);
ChromeDriver driver = new ChromeDriver(options);
driver.get(“http://google.co.in&#8221;);