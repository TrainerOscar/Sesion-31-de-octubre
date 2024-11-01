package models;

public class Producto {

    private String producto;
    private int cantidad;
    private int precio;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto(String producto, String s, int cantidad, String string, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;



    }


    public static void main(String[] args) {
        Producto producto1 = new Producto("Mantequilla", "Cantidad:", 87, "Precio:", 900);
        System.out.println(producto1.getProducto());
        System.out.println(producto1.getCantidad());
        System.out.println(producto1.getPrecio());
        Producto producto2 = new Producto("Cacao pichel", "Cantidad:",875, "Precio:", 421);
        System.out.println(producto2.getProducto());
        System.out.println(producto2.getCantidad());
        System.out.println(producto2.getPrecio());
    }


}
