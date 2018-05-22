package sk.akademiasovy.threads;

import java.util.Random;

public class AnotherThread  implements Runnable {


    public AnotherThread(String name,int z)
    {
        this.name = name;
        this.z = z;
    }

    private String name;
    private int z;
    private Thread t;



    public void run()
    {
        System.out.println("Running thread:"+name+" "+z);
        Random random = new Random();
        int i;
        for(i=0;i<=z;i++)
        {
            System.out.println(name + " Ahoj " + i);
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

