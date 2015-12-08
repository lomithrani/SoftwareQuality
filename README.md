# Second Assignment - MyStack - Hanoi Tower - Junit - Louis Gentil - Xavier Cauzard

>1:Write an implementation of a bounded stack of integers using an array of int.

You can find here the implementation: [MyStack.java](https://github.com/lomithrani/SoftwareQuality/blob/master/Assignment2/src/main/java/SoftwareQuality/Assignment2/MyStack.java) 
>2: Write the different unit tests for all the methods. Pay attention to the order of the tests

Tests are here: [MyStackTests.java](https://github.com/lomithrani/SoftwareQuality/blob/master/Assignment2/src/test/java/SoftwareQuality/Assignment2/MyStackTests.java)
>3: If you were to implement differently the Stack class, find an architecture that permits not to rewrite all of the methods. Give the class diagram.

![ClassDiagram](https://github.com/lomithrani/SoftwareQuality/blob/master/Assignment2/MyStack.png)

>4: Will you need to rewrite all the unit tests? Which ones would you rewrite (if any) and why ?

I would just need to rewrite the setup in order to instantiate an item of the new implementation, but if the methods are named the same the tests will be the same. I'll just write new tests if any methods have changed / are new
>5: Give the architecture of the test classes that allows your previous answer (class diagram)

![ClassDiagram](https://github.com/lomithrani/SoftwareQuality/blob/master/Assignment2/MyStackTest2.png)
