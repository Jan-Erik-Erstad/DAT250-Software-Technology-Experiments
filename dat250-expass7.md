## DAT250: Software Technology Experiment Assignment 7

#### Introduction

In this experiment we will explore messaging systems using the message broker RabbitMQ. 



#### Experiment 1: Installation

- Installation of Erlang and RabbitMQ was done trough Chocolatey

![expass7_1](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_1.PNG?raw=true)

![expass7_2](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_2.PNG?raw=true)

- Checked the status of RabbitMQ to see that RabbitMQ was running fine

![expass7_3](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_3.PNG?raw=true)

![expass7_4](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_4.PNG?raw=true)

- Opened a new Maven project and added the following dependencies 

```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/com.rabbitmq/amqp-client -->
    <dependency>
        <groupId>com.rabbitmq</groupId>
        <artifactId>amqp-client</artifactId>
        <version>5.9.0</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-api -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.30</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-simple -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>1.7.30</version>
    </dependency>
</dependencies>
```

#### Experiment 2: Hello World

- Followed the guide and checked that the send and receive program was working

![expass7_5](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_5.PNG?raw=true)

![expass7_6](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_6.PNG?raw=true)

#### Experiment 3: Queue messaging

- Here I first implemented Round-robin dispatching, and we can see that the two worker possesses takes turns processing the messages. 

![expass7_7](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_7.PNG?raw=true)

- I then made the messages durable, and finished the guide by making the queue fair.  Note that I did not make a script for sending the messages, so there is a delay between the messages.

![expass7_8](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_8.PNG?raw=true)

#### Experiment 4: Topics

- Completed the Publish/Subscribe guide and verified the bindings/queues 

![expass7_9](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass7_9.PNG?raw=true)

#### Technical problems and pending issues

- none

#### Link to project

[Code for my RabbitMQ experiment](https://github.com/Jan-Erik-Erstad/Rabbit-MQ-Guide)

