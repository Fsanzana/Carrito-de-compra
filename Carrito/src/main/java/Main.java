import java.util.Random;
public class Main {
    static Random rnum = new Random();
    public static void main(String[] Args){
        int[] carrito = new int[rnum.nextInt(20)+1];
        agregarProducto(carrito);
        mostrarCarrito(carrito);
        detalleProductos(carrito);
        total(carrito);
    }
    public static int[] agregarProducto(int[] carrito){
        for(int i=0;i<carrito.length;i++){
            carrito[i]=rnum.nextInt(16);
        }
        return carrito;
    }
    public static  void mostrarCarrito(int[] carrito){
        int productos = 0;
        for (int i=0;i<carrito.length;i++) {
            productos += carrito[i];
        }
        System.out.println("\nEl carrito contiene "+productos+" productos");
    }
    public static  int total(int[] carrito){
        int total = 0;
        for (int i=0;i<carrito.length;i++) {
            total += (500+(150*i))*carrito[i];
        }
        return total;
    }
    public static  void detalleProductos(int[] carrito){
        int subTotal = 0;
        int total = total(carrito);
        System.out.println("Detalle de compra:");
        for(int i=0;i<carrito.length;i++){
            subTotal = (500+(150*i))*carrito[i];
            System.out.println("Cantidad producto "+(i+1)+": "+carrito[i]+", subtotal: $"+subTotal);
        }
        System.out.println("Total de compra : $"+total);
    }

}

