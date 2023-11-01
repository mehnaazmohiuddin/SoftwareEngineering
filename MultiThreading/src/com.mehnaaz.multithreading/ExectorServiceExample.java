package com.mehnaaz.multithreading;

import java.util.concurrent.*;

public class ExectorServiceExample {





    public static void main(String [] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = new ThreadPoolExecutor(2,10,100, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
        Callable<String> callableTask = () ->{
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };
        Future<String> future =
                executorService.submit(callableTask);

       System.out.println(future.get(1000,TimeUnit.MILLISECONDS)); // this thing actually WAITS for
        // the task to finish for 1 sec
        System.out.println(future.get(100,TimeUnit.MILLISECONDS)); // this thing will throw an exacpetion.
        // if not for the above line
        executorService.shutdown(); // makes the pool to get shutdown
    }
}
