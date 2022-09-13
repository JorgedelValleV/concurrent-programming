//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica1b;

public class thDecrementa extends Thread 
{
    private int N;
    private Entero n;

    public thDecrementa (int N, Entero n)
    {
        this.N = N;
        this. n = n;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            n.decrementa();
        }
        System.out.println("Hilo " + this.getId() + " resta. Valor de n: " + n.getN());
    }
}
