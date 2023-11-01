We will cover the topics of MultiThreading in JAVA

1) How to create multiple threads?
2) How to create a race condition, and how to fix it.
3) Some of the Thread safe collections.
5) Thread Creation.
6) Thread Synchronization.
7) Thread Intercommunication.
8) Thread Pools.
9) Concurrency Utilities
10) Thread Safety:
11) Thread Deadlock and Avoidance:
12) ThreadLocal [done]
13) Concurrency Challenges:
14) Fork/Join Framework:
15) Parallel Streams:
16) Best Practices and Patterns:
17) Java Memory Model (JMM):
18) Thread Safety in Java APIs:

=======

How to create multiple threads == 
1) Thread, Runnable , Callable. 

How to create a race condition, and how to fix it?
Race condition happens when 2 or more parties 
are accessing the same resource wiz mutable and modifing it. 

For example 

a = a+1 ..

Now we can synchronize it . causing it to be without racecondition


static void synchronize add1(Resource a  ) {
        a.add1();
}

or 

public void  add1(Resource a  ) {
synchronize(this){
a.add1();
}

}

public void  add1(Resource a  ) {
synchronize(ThisClass.class){
a.add1();
}

}

we can also accuquire the same lock again and again.



Thread Safe Collections ?

![this was showing the image for thread sharing resource](https://www.baeldung.com/wp-content/uploads/sites/4/2022/11/Shared-resources-in-a-process-1024x462.png)
