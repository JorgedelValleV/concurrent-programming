//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2b;
    
public abstract class miThread extends Thread
{
    protected int N;  //numero de incrementos
    protected int id;
    protected Entero num;
    protected LockRompeEmpate rompeEmpate;
    protected LockTicket ticket;
    protected LockBakery bakery;

    public miThread(int N, int id, Entero num, LockRompeEmpate rompeEmpate, LockTicket ticket, LockBakery bakery)
    {
        this.N = N;
        this.id = id;
        this.num = num;
        this.rompeEmpate = rompeEmpate;
        this.ticket = ticket;
        this.bakery = bakery;
    }

    public abstract void run();
}
