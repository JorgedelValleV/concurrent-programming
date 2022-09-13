package Practica4b;

public class Productor extends Thread
{
    private int N; //número de iteraciones
    private int id;
    private miAlmacen buff;
    private Monitor mon;

    public Productor (int N, int id, miAlmacen buff, Monitor mon)
    {
        this.N = N;
        this.id = id;
        this.buff = buff;
        this.mon=mon;
    }
	
	public void run() 
    {
		for(int i = 0; i < N; ++i)
        {
            try{
                mon.put();

                String idProducto = "P-" + this.id + " It-" + i+1;
                Producto producto = new Producto(idProducto);
                System.out.println("Hilo (productor) " + this.id + ": se almacena el producto " + producto.getId());

                buff.almacenar(producto);
                mon.release();
            }catch (InterruptedException e) {
                System.out.println("Error al coger el semáforo en hilo prodcutor: " + this.id);
                e.printStackTrace();
            }
        }
    }
}
