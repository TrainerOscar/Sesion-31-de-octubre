package models;

public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String mostrarDireccion() {
        return "Calle: " + calle + ", Ciudad: " + ciudad + ", Código Postal: " + codigoPostal;
    }
}







