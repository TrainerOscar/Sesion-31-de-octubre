package models;

public class Moto extends Vehiculo {
    private boolean tieneParabrisas;

    public Moto(String marca, String modelo, int año, boolean tieneParabrisas) {
        super(marca, modelo, año);
        this.tieneParabrisas = tieneParabrisas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tiene parabrisas: " + (tieneParabrisas ? "Sí" : "No"));
    }
}
