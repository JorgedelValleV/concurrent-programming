//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2a;

public class thDecrementa extends Thread 
{
    private int N;
    private Entero n;
    private MiLock lock;

    public thDecrementa (int N, Entero n, MiLock lock)
    {
        this.N = N;
        this. n = n;
        this.lock = lock;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            lock.lock2();

            n.decrementa();
            System.out.println("Hilo " + this.getId() + " resta. Valor de n: " + n.getN());
                    
            lock.unlock2();
        }
    }
}
