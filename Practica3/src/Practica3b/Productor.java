//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica3b;

import java.util.concurrent.Semaphore;

public class Productor extends Thread
{
    private int N; //número de iteraciones
    private int id;
    private miAlmacen buff;
    private Semaphore semEmpty;
    private Semaphore semFull;

    public Productor (int N, int id, miAlmacen buff, Semaphore semEmpty, Semaphore semFull)
    {
        this.N = N;
        this.id = id;
        this.buff = buff;
        this.semEmpty = semEmpty;
        this.semFull = semFull;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            try{
                semEmpty.acquire();
            }catch (InterruptedException e) {
                System.out.println("Error al coger el semáforo en hilo prodcutor: " + this.id);
                e.printStackTrace();
            }

            String idProducto = "P-" + this.id + " It-" + i+1;
            Producto producto = new Producto(idProducto);
            System.out.println("Hilo (productor) " + this.id + ": se almacena el producto " + producto.getId());
            
            buff.almacenar(producto);
                    
            semFull.release();
        }
    }
}
