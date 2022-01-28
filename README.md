#Aspire TestAutomation: Documentation and Framework Setup Guide
•  This is a customized framework to write automation scripts for Web Application using Selenium.
•  It runs tests against your application running in real browser interacting with it as a user would.

Software required:
•  Editor(IntelliJ IDEA or Eclipse IDE)
•  Java
•  Git
•  Maven

Steps for project setup:
•  git clone git_url
•  Open editor and import project from local drive
•  Download chromedriver.exe and keep in /usr/local/bin (Mac System)

Project Structure:
•   /src/main/java/Pages – Contains page classes
•  /src/test/java – Contains test classes
•  /TestData.prop – testdata file
•  /testng.xml – runner file to run tests
•  /test-output – testng test runs report

Test Execution:
•  Run testing.xml file directly or
•  Run Maven command mvn test
