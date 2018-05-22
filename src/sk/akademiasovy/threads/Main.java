package sk.akademiasovy.threads;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Main started...");

        //MyThread thread1 = new MyThread("vlakno1");
        //thread1.start();

       //MyThread thread2 = new MyThread("vlakno2");

        //thread2.start();
        System.out.println("Main finished...");

        AnotherThread another = new AnotherThread("vlakno8",20);
        another.start();


    }
}
