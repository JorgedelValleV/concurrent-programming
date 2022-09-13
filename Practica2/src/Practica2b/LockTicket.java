//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2b;


public class LockTicket extends Lock
{
    //private int N;  //numero de procesos
    volatile int number;
    volatile int next;
    private int[] turn;
    
    public LockTicket (int N)
    {
        //this.N = N;
        super(N+1);
        this.number = 0;
        this.next = 0;
        this.turn = new int[this.N];
        for(int i = 1; i < this.N; ++i){
            turn[i] = 0;
        }
    }

    public void takeLock(int i)
    {
        turn[i] = Fecth_and_add(number, 1);
        while(turn[i] != next);
    }

    public void releaseLock(int i)
    {
        ++this.next;
    }

    private int Fecth_and_add(int x, int incr)  //como se hace atomica?
    {  
        int tmp = x;
        x = x + incr;
        return tmp;
    }
}
