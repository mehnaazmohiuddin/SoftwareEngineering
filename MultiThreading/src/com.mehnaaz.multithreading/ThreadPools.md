Thread Pools

What are they and what is their motivation ?
So instead of us creating as many threads as we like . We create a thread pool . limit the number say 10 and submit our
tasks to a queue. And let another library take care of assigning threads to do the task.


The Thread's life cycle is managed by these ThreadPool Service.


In Java we have Executors class and ExecutorService, that creates these threadpools

Executor has  a single execute method  has an unbounded queue . where we can submit out runnable threads. 
[a link] 


ExecutorService has submit which gives a Future instance . which can return the result from the thread's execution. 