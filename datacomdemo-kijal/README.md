Datacom Demo Automation Suite
=================================

### Tech Stack:
- Language:
      - JAVA

- Framework/s:
      - TestNG

- Build Platform:
      - Maven

- Other:
      - Cucumber
      - Selenium
      - Log4J2

- Reporting:
      - Maven Cucumber Reporting

- CI/CD
      - (Pending)

## How to use:

### Pre-requisites
1) Computer has JAVA 17 or higher installed
2) Computer has MAVEN installed
3) Computer has Chrome browser installed
3) IDE installed with Cucumber plugin


### Setup test suite

1.	Download the latest source code from source control.

2.	Update the following setup files

      •	<Automation_test_suite_location>\datafiles\project.properties

3.	Run following maven command to download all dependencies of maven.

      mvn clean package -DskipTests=true


### Run tests

#### Run full suite

      mvn clean test -PChrome

#### Run full suite and generate report

      mvn clean verify -PChrome