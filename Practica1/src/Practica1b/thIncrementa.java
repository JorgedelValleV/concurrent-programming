//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica1b;

public class thIncrementa extends Thread 
{
    private int N;
    private Entero n;

    public thIncrementa (int N, Entero n)
    {
        this.N = N;
        this. n = n;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            n.incrementa();
        }
        System.out.println("Hilo " + this.getId() + " suma. Valor de n: " + n.getN());
    }
}
