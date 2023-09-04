# JDBC
Project Employees using JDBC

## Part 1
1. Created a Maven project with the archetype org.apache.maven.archetypes:maven-archetype-webapp.
2. Added the PostgreSQL dependency from https://mvnrepository.com/ and the maven-compiler-plugin plugin to the pom.xml file (example pom.xml file below).
3. Created the Application class and configured the connection to the previously created skypro database.
4. Fetched and displayed the full data of one of the employees (name, surname, gender, city) based on the provided id.

## Part 2
1. Created the Employee and City classes with fields analogous to the created tables.
2. Created the EmployeeDAO interface.
3. Defined the following methods in the interface:
* Creating (adding) an Employee entity to the table
* Getting a specific Employee object by id
* Getting a list of all Employee objects from the database
* Modifying a specific Employee object in the database by id
* Deleting a specific Employee object from the database by id
4. Implemented the EmployeeDAO service and each of its methods in separate classes.
5. Verified the correctness of all methods in the Application class.
