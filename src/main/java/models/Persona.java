package models;

public class Persona {

    private String nombre;
    private String genero;
    private int edad;

    public Persona() {
    }
    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Oscar");
        persona.setEdad(Integer.parseInt("75"));
        persona.setGenero("Masculino");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getGenero());

    }
}
