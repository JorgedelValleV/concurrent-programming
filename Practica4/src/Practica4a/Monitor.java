package Practica4a;
public class Monitor  {
    private int n=0;

    synchronized void request() throws InterruptedException{
        while(n>0)
            wait();
        n++;
    }
    synchronized void release() throws InterruptedException{
        n--;
        if(n==0)
            notifyAll();
    }
}
