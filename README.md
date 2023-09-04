
# 1. JDBC
Project Employees using JDBC

## Part 1.1
1. Created a Maven project with the archetype org.apache.maven.archetypes:maven-archetype-webapp.
2. Added the PostgreSQL dependency from https://mvnrepository.com/ and the maven-compiler-plugin plugin to the pom.xml file (example pom.xml file below).
3. Created the Application class and configured the connection to the previously created skypro database.
4. Fetched and displayed the full data of one of the employees (name, surname, gender, city) based on the provided id.

## Part 1.2
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

# 2. Hibernate
## Part 2.1
SQL Employee Database Using Hibernate

1. Added a dependency on hibernate-core version 5.6.14.Final to the pom.xml file.
2. Replaced the "city" field in the Employee class with an "int" type.
3. The Employee class has been annotated as an Entity with all the necessary annotations applied.
4. Created a configuration class for database connection.
5. Created a configuration file named hibernate.cfg.xml.
6. Modified the delete and update methods in the EmployeeDAO interface to accept an object of type Employee.
7. Modified the methods in the EmployeeDAOImpl class to implement them using Hibernate.
8. Modified the Application class to implement functionality using Hibernate.

## Part 2.2
SQL - Employee Database Using Hibernate (Working with Multiple Tables)
1. The Employee and City classes have been modified to meet Entity requirements.
2. Entities are related in such a way that multiple employees can belong to one city, and one employee can only belong to one city.
3. Full cascading is enabled.
4. A DAO layer has been created for the City entity.
5. In the main method, CRUD operations for related entities have been invoked.
