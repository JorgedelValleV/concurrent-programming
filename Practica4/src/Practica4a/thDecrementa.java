//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica4a;

public class thDecrementa extends miThread 
{
    public thDecrementa (int N, int id, Entero num, Monitor mon)
    {
        super(N, id, num, mon);
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            try{
                mon.request();
                num.decrementa();
                mon.release();
            }catch (InterruptedException e) {
                System.out.println("Error al coger el monitor en hilo: " + this.id);
                e.printStackTrace();
            }
            //System.out.println("Hilo " + this.id + " resta. Valor de num: " + num.getN());
        }
    }
}