# PlayWright
Playwright Tool implementation with Maven and TestNG

### Local Setup
1. Clone this repository and open ```/assesment``` folder in your IDE (Eclipse / IntelliJ)
2. Resolve maven dependencies using pom.xml. Loading as maven project in IDE should auto resolve all the dependencies.
3. If the dependencies are not automatically resolved by your IDE, run below command to resolve them
   ```mvn install -DskipTests```
4. Once all the dependencies are resolved, you can run your tests using maven along with various arguments
   eg.
   ```mvn clean test -Dsurefire.suiteXmlFiles=Testng.xml```

### Report
1. When the test is run, report is generated in ```test-output``` folder
2. You can open this report in browser as it is available both in html and xml format.


### FAQ

- **Q:** How to run tests on different browser without hardcoding?
- **A:** By default the tests are run with chromium browser
  To run tests on different browser, you can pass the parameter as shown in the TestNg.xml file as a **parameter**.

  eg.
  ```<parameter name = "browser" value="safari"/>```

- **Q:** How to run tests with headless or browser mode without hardcoding?
- **A:** By default the tests are run with headless mode.
  To run tests with browser mose, you can pass the parameter as shown in the TestNg.xml file as a **parameter**.

  eg.
  ```<parameter name = "type" value="head"/>```

Refer [Run single test](https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html) for more details
