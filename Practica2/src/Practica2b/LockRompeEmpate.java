//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2b;


public class LockRompeEmpate extends Lock
{
    //private int N;  //numero de procesos
    private int[] in;
    private int[] last;

    public LockRompeEmpate (int N)
    {
        //this.N = N+1;
        super(N+1);
        this.in = new int[this.N];
        this.last = new int[this.N];
        for(int i = 0; i < this.N; ++i){
            in[i] = 0;
            last[i] = 0;
        }
    }

    public void takeLock(int i)
    {
        for(int j = 1; j < this.N; ++j){
            in[i] = j;
            last[j] = i;
            for(int k = 1; k < this.N; ++k){
                if(k != i){
                    while(in[k] >= in[i] && last[j] == i);
                }
            }
        }
    }

    public void releaseLock(int i)
    {
        in[i] = 0;
    }
}
