package sk.akademiasovy.threads;

import java.util.Random;

public class MyThread implements Runnable
{
    public MyThread(String name)
    {
        this.name = name;
        System.out.println("Creating a new thread:"+name);
    }

    private String name;
    private Thread t;


    @Override
    public void run()
    {
        System.out.println("Running thread:"+name);
        Random random = new Random();
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.println(name + " Ahoj");
            try {

                Thread.sleep(500+random.nextInt(1100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Thread " + name +" exiting");

    }

    public void start()
    {

        System.out.println("Starting "+name);
        if(t==null)
        t=new Thread(this,name);
        t.start();


    }
}
