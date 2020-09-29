## DAT250: Software Technology Experiment Assignment 5

### Introduction

### Experiment 1: Getting started

- The setup was easy and worked perfectly, under you can see screenshots of the service running. 

  ![expass5_1](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_1.PNG?raw=true)

  

  ![expass5_2](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_2.PNG?raw=true)

### Experiment 2: Spring Boot

- I used experiment 1 as a starting point.
- Everything ran fine from intelliJ, but got an error when when running from the command line. This was caused by now having two main classes, one in demo and one in springboot. To correct this I needed to specify the main class I now was working with. This was done by adding `<start-class>com.example.springboot.Application</start-class> `  to my `pom.xml` properties. The project was now running as intended.

  ![expass5_3](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_3.PNG?raw=true)

- The added tests also ran fine

  ![expass5_4](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_4.PNG?raw=true)

- The last part of experiment 2 was to test the groovy support

  ![expass5_5](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_5.PNG?raw=true)

### Experiment 3: REST service

- To get the rest service up and running, I just had to add the classes from the guide, update the main class in my `pom.xml` properties, build the maven project and run the spring-boot.

  ![expass5_6](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_6.PNG?raw=true)

### Experiment 4: Data Access

- Created the files covered in the guide.
- Added JPA and H2 to my `pom.xml` dependencies 

```xml
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
   <groupId>com.h2database</groupId>
   <artifactId>h2</artifactId>
   <scope>runtime</scope>
</dependency>
```

- ran `mvnw clean install` and `mvnw spring-boot:run`

  ![expass5_7](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5/blob/master/screenshots/expass5_7.PNG?raw=true)



### Note

Since I finished the guides using a single project, the start class must be selected. For example: To change from the `AccessingDataJpaApplication` to the `RestServiceApplication` you first locate the `pom.xml` properties. Here you can comment out the `AccessingDataJpaApplication` line and remove the comment on the `RestServiceApplication` line.

```xml
<properties>
   <java.version>11</java.version>
   <!-- <start-class>com.example.demo.DemoApplication</start-class>  -->
   <!-- <start-class>com.example.springboot.Application</start-class>  -->
   <!-- <start-class>com.example.restservice.RestServiceApplication</start-class> -->
   <start-class>com.example.accessingdatajpa.AccessingDataJpaApplication</start-class>
</properties>
```

### code

Code for experiment 5 can be found at [DAT250_Software-Technology-Experiment-Assignment-5](https://github.com/Jan-Erik-Erstad/DAT250_Software-Technology-Experiment-Assignment-5)
