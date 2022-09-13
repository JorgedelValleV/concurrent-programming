//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica4a;
    
public class miThread extends Thread
{
    protected int N;  //numero de incrementos/decrementos
    protected int id;
    protected Entero num;
    protected Monitor mon;

    public miThread(int N, int id, Entero num, Monitor mon)
    {
        this.N = N;
        this.id = id;
        this.num = num;
        this.mon = mon;
    }
}