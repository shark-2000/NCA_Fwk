# TestNG and Selenium framework with java
## Framework file strucuture
```mermaid
flowchart LR;
src-->main;
src-->test;
src-->main-->java-->pages-->Prerequisite.java;
src-->main-->java-->pages-->DashBoard.java;
src-->main-->java-->pages-->Users.java;
src-->main-->java-->pages-->CreateUser.java;



src-->main-->java-->utils-->BrowserManager.java;
src-->main-->java-->utils-->ExtentReport.java;
src-->main-->java-->utils-->ScreenShot.java;
src-->main-->java-->utils-->Constant.java;
src-->main-->java-->utils-->ConfigurationReader.java;

src-->main-->resources-->configurations-->configuration.properties;

src-->test-->Java;
src-->test-->Java-->abstracted-->Report.java;
src-->test-->Java-->base-->TestScript.java;
src-->test-->Java-->dataProviders-->Data.java;
src-->test-->Java-->dataProviders-->DataWithExcel.java;



src-->test-->Resources-->drivers;
```

## Driver flow(Multi browser)
```mermaid 
flowchart TD;

Testng.xml-->browserName1-->ConfigurationReader-->Browser.setProperty-->Prerequisite.driver
