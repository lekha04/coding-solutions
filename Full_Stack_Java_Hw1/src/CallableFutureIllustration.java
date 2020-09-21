//Problem 11. Java program to illustrate Callable and FutureTask

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableFutureIllustration implements Callable {

    public Object call() throws Exception{
        Random rand = new Random();
        Integer num = rand.nextInt(10);
        Thread.sleep(num *1000);
        return num;
    }

    public static void main(String[] args) throws Exception{
        FutureTask[] tasks = new FutureTask[5];

        for(int i=0; i<5; i++){
            Callable callable = new CallableFutureIllustration();
            tasks[i] = new FutureTask(callable);
            Thread t = new Thread(tasks[i]);
            t.start();
        }

        for(int i=0; i<5; i++){
            System.out.println(tasks[i].get());
        }
    }
}
