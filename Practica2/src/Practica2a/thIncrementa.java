//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2a;

public class thIncrementa extends Thread 
{
    private int N;
    private Entero n;
    private MiLock lock;

    public thIncrementa (int N, Entero n, MiLock lock)
    {
        this.N = N;
        this. n = n;
        this.lock = lock;
    }
	
	public void run() 
    {
        for(int i = 0; i < N; ++i)
        {
            lock.lock1();

            n.incrementa();
            System.out.println("Hilo " + this.getId() + " suma. Valor de n: " + n.getN());
                    
            lock.unlock1();
        }
    }
}
