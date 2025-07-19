
package com.mycompany.mascota;

public class Mascota {
      // Atributos privados (Encapsulamiento)
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;

    // Constructor
    public Mascota(String nombre, String especie, int edad, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    // Getters y Setters (Encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
 
    // Método para mostrar información (Requerimiento 2c)
public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Vacunado: " + (vacunado ? "Si" : "No"));
    System.out.println("---------------------");
}
}
