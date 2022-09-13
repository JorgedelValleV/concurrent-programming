//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2b;

public class thIncrementa extends miThread 
{
    /*
    private int N;  //numero de incrementos
    private int id;
    private Entero num;
    private LockRompeEmpate rompeEmpate;
    private LockTicket ticket;
    private LockBakery bakery;
    */

    public thIncrementa (int N, int id, Entero num, LockRompeEmpate rompeEmpate, LockTicket ticket, LockBakery bakery)
    {
        /*
        this.N = N;
        this.id = id;
        this.num = num;
        this.rompeEmpate = rompeEmpate;
        this.ticket = ticket;
        this.bakery = bakery;
        */
        super(N, id, num, rompeEmpate, ticket, bakery);
    }
	
	public void run() 
    {
        for(int i = 0; i < N; ++i)
        {
            rompeEmpate.takeLock(this.id);

            num.incrementa();
            System.out.println("Hilo " + this.id + " suma. Valor de num: " + num.getN());
                    
            rompeEmpate.releaseLock(this.id);
        }
    }
}
