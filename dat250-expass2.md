## Installation: Derby Database

Intalling the Apache Derby database 

- Updated my Java version to 14.0.2 
- Added Java 14.0.2 to JAVA_HOME via the bash_profile

- Downloaded and intalled Apache Derby
- Tested that Apache Derby was working by creating a database using the interactive SQL scripting tool "ij"



## Experiment 1: Application using JPA



- I cloned the repository and the initial code was running fine
- I then followed the instructions to add the missing code, the tests now also ran fine.
- I used "ij" to check that the database stored the correct data



#### Technical problems encounterd

- My IntelliJ 2017.2 was not working with Java 14.0.2, updating via the app did just gave me a newer version of 2017.2. This was solved by downloading and instaling the 2020 version of IntelliJ
- Did not manage to view the database using the inbuilt database viewer in IntelliJ. The IntelliJ Apache Derby driver was version 10.14.1.0 and the database was created using version 10.15.2.0. It is not possible to connect to an embeded database with an older driver than what was used during the creation of the database. This was not a major issue, as the interactive SQL scripting tool "ij" was displaying the database just fine.



## Experiment 2: Banking/Credit Card example JPA



- I used the Experiment 1 as a starting point 

- I created classes for Person, CreditCard, Bank, Address and Pincode

- I created a Main class to enter information into the database

- I checked that the data was stored as intended by using the SQL scripting tool "ij"

  



## Pending issues

None
