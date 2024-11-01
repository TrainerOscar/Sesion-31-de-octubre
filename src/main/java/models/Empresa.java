package models;

public class Empresa {
    private String nombreEmpresa;
    private Direccion direccion;

    public Empresa(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre de la Empresa: " + nombreEmpresa);
        System.out.println("Dirección: " + direccion.mostrarDireccion());
    }

    public class Main {
        public static void main(String[] args) {
            Direccion direccionEmpresa = new Direccion("Avenida Siempre Viva 123", "Springfield", "12345");
            Empresa empresa = new Empresa("Mi Empresa S.A.", direccionEmpresa);

            empresa.mostrarDetalles();
        }
    }

}
