package Practica4b;

public class Consumidor extends Thread
{
    private int N; //número de iteraciones
    private int id;
    private miAlmacen buff;
    private Monitor mon;

    public Consumidor (int N, int id, miAlmacen buff, Monitor mon)
    {
        this.N = N;
        this.id = id;
        this.buff = buff;
        this.mon = mon;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            try{
                mon.get();

                Producto producto = buff.extraer();
                System.out.println("Hilo (consumidor) " + this.id + ": se extrae el producto " + producto.getId());
                        
                mon.release();
            }catch (InterruptedException e) {
                System.out.println("Error al coger el semáforo en hilo consumidor: " + this.id);
                e.printStackTrace();
            }
        }
    }
}
