### ⏱ Java Test Automation Framework

These testing cases are as learning of Selenium web-driver. The observable website is [https://demoqa.com](https://demoqa.com).  
You can use this Java framework as a boilerplate to build your own. I'll try to add new features soon.
 
### What's installed:
1. Browser ChromeDriver:

```
brew install ChromeDriver
```

See versions of ChromeDriver and Web Browser Chrome. In our case, it's 103.0.5060.53 for both.
For macOS Need to allow executed ChromeDriver in System>Security>Privacy.

2. Install allure:

```
brew install allure
```

#### How to run:
1. Start our tests:

```
mvn clean test
```

2. See all results in allure test reports:

```
./allure.sh
```


📌 *notation keys:*:
 - [`✍🏻`] - in progress;
 - [`✔️`] - done;


#### [Cases:](src/test/java/com/meugenom/)

Group | Case| Status |
------------------------|--------------------------|---------
Browser|[OpenBrowserTest](src/test/java/com/meugenom/OpenBrowserTest.java#L15)|[`✔️`]
