## Introduction

This rapport will cover the steps taken to complete the [Heroku guide][1] together with a conclusion covering the pressure points in the assignment

## Before the guide

- created account on Heroku

## [Following the guide "Getting Started on Heroku with Java"][3]

#### Introduction

- updated my java version
- added JAVA_HOME by adding ["export JAVA_HOME=$(/usr/libexec/java_home)" to the "~/.bash_profile"][1]
- downloaded and extracted Maven
- added Maven to PATH ["export PATH=/Users/jee/maven/apache-maven-3.6.3/bin:$PATH"][2]

#### Set up

- ran "brew install heroku/brew/heroku" to install the CLI
- ran "heroku login" and logged in via the webpage, this work and CLI is now logged inn

#### Prepare the app

- ran "git clone https://github.com/heroku/java-getting-started" to clone the repository
- entered the project's directory "java-getting-started" 

#### Deploy the app

- running "heroku create" to prepare Heroku for the "java-getting-started" source code
- ran "git push heroku master" and got a successful deploy
- used the command "heroku ps:scale web=1" to check that an instance was running. Responce "Scaling dynos... done, now running web at 1:Free"
- Opened the application by running the command "heroku open", the application opened correctly in the web browser.

#### View logs

- used the command "heroku logs --tail" to start a streaming log. 
- refreshed and confirmed that the log was updating
- exited the logging service by pressing "CTRL+C"

#### Define a Procfile

- read and understod what a Procfile does

#### Scale the app

- checked dyno stats
- set scale to 0 and confirmed that the application stopped working. Used command "heroku ps:scale web=0" and got an error message when refreshing the page.
- set scale back to 1 to get a working application again, "heroku ps:scale web=1"

#### Declare app dependencies

- used "mvn clean install" to install local dependencies and got a "BUILD SUCCESS" without any errors or warnings 

#### Run the app locally

- used "heroku local" to start a local instance of the application, and confirmed that the application was displaying correctly in http://localhost:5000/

#### Push local changes

- Pasted the new dependecy into pom.xml, added the new imports and code into Main.java and created the hello.html file.
- ran a clean maven install and ran "http://localhost:5000/hello", witch displayed "E=mc^2: 12 GeV = (2.139194076302506E-26 ± 1.4E-42) kg" on the page.
- Deployed the new code and cofirmed that "heroku open hello" sent me to the "E=mc^2: 12 GeV = (2.139194076302506E-26 ± 1.4E-42) kg" page

#### Define config vars

- adding new code that gets the energy from the environment variables.
- "http://localhost:5000/hello" now gives us "E=mc^2: 20 GeV = (3.5653234605041761E-26 ± 2.9E-42) kg"
- The energy was set on the Heroku config and the application was redeployed, showing us "E=mc^2: 20 GeV = (3.5653234605041761E-26 ± 2.9E-42) kg" 

#### Start a one-off dyno

- Ran a console command through heroku 

#### Provision add-ons

- I did not add payment information, so i was unable to add papertrail to heroku

#### Use a database

- Tried the Postgres database included in the application, this stored the db access date/time in the database. by visiting "herokuapp.com/db" a new entry was added to the database and displayed on screen.  



## Conclusions

- Durring the setup of the software development environment there where one minor issue that that had to be resolved, this was that JAVA_HOME was not configured on my laptop. This was resolved by following the instructions from the site [baeldung][1]
- The only new tools in this software development environment was Maven and Heroku. Validation that the software development environment was working correctly was observed while following the [Heroku guide][3], as documented above. 
- Only minor issue that occurred durring the Heroku guide was that i did not enter payment options, and thereby was unable to test the add-on papertrail.
- No pending issues, exept for the papertrail add-on mentioned above





#### resorces used: 
- https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux
- https://maven.apache.org/install.html
- https://devcenter.heroku.com/articles/getting-started-with-java

[1]: <https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux>

[2]: <https://maven.apache.org/install.html>

[3]: <https://devcenter.heroku.com/articles/getting-started-with-java>
