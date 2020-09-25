## DAT250: Software Technology Experiment Assignment 4



### Experiment 1: Spark/Java Framework project and Postman

- Cloned the project and confirmed that the application was running correctly,  `http://localhost:8080/counters` gives me {"red":0,"green":0} and the AppTest is all green.
- Used the postman tool to test the counter service

![expass4_1.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass4_1.png?raw=true)



### Experiment 2: REST API for TODO-items

- I used the Derby database and persistence to ensure that the todo application retained the information after shutdown.

![expass4_2.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass4_2.png?raw=true)

- ```http://localhost:8081/todo/api/addTask``` Is used to add a new task to the todo list. It takes a JSON body containing an todo object in the form 

  ```JSON
          {
              "title": "DAT250",
              "description": "Experiment 2"
          }
  ```

  This is the postman screen after adding the above task

![expass4_3.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass4_3.png?raw=true)

- We can use ```http://localhost:8081/todo/api/getTodoList``` to get the stored todo´s, this request has no body and gives us the same response as above

- To update an item we use ```http://localhost:8081/todo/api/updateTask``` together with a JSON representation of the task

![expass4_4.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass4_4.png?raw=true)

- Deletion of a task is done by sending an JSON representation of the task to ```http://localhost:8081/todo/api/deleteTask```

![expass4_5.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass4_5.png?raw=true)



### Pending issues

- None

### Link to code

- https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiment-Assignment-4/tree/master/counters/counters/src/main/java/no/hvl/dat110/rest/todo





