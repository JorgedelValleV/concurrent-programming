package Practica4b;
public class Monitor  {
    private int n;
    private int t;
    public Monitor(int tam){
        t=tam;
        n=0;
    }

    synchronized void put() throws InterruptedException{
        while(n==t)
            wait();
        n++;
    }
    synchronized void get() throws InterruptedException{
        while(n==0)
            wait();
        n--;
    }
    synchronized void release() throws InterruptedException{
        notify();
    }
}
