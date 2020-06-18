# Automated-Ticket-Booking
•	Web automation testing on the SpiceJet website using Selenium WebDriver with Java.
•	Test features: login, signup, book flights, book hotels, COVID-19 information.
•	Selenium locators: id, className, name, CSS selector, XPath are used.
•	Calendar concepts are covered using a while and for loops. It is designed to select any year, month, and date. 'Select' class is used for the static drop-down, parent-child XPath is used for dynamic drop-down as FROM and TO have the same city names. Implicit waits and explicit waits are used depending on the situation. Various other selenium concepts are handled.
•	Regular Expressions in the feature file and Hooks are used to maintain reusable code across the framework. The base class is used to initialize WedDriver, get browser URL, window maximize. Before hooks & tags are used to navigate to a specific page and after hooks & tags are used to close driver. Tags are also used with Test Runner to control the test cases required to be executed.
•	DataTable is used to drive the data and test cases are parameterized with multiple sets of data using scenario outline.
•	Gherkin syntax, dryRun, and strict (are set to true in test runner) are used for 100% test coverage.
•	Along with the pretty plugin, HTML, JSON, and JUnit reports are generated in the target folder. Monochrome is set to true is to provide detail and neatly formatted output.
•	The WebDriver object is centralized for accessibility across Framework using a Base class and the driver is made accessible to multiple-step definition functions using inheritance. Global properties are set up to drive data in the framework and few page objects are implemented.
•	The project is run in Eclipse, using Maven command with tags, Jenkins with tags in choice parameter, and JUnit test result report is generated in Jenkins.
•	Framework: Cucumber BDD, Maven Project, Jenkins Continuous Integration Tool





















