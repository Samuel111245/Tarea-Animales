package com.mycompany.mascota;

public class Veterinaria {
        public static void main(String[] args) {
        // Crear 3 objetos Mascota (Requerimiento 3)
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3, true);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2, false);
        Mascota mascota3 = new Mascota("Lola", "Conejo", 1, true);

        // Mostrar información de cada mascota
        System.out.println("=== Registro de Mascotas en la Veterinaria ===");
        mascota1.mostrarInformacion(); // Llama al método de la clase Mascota
        mascota2.mostrarInformacion();
        mascota3.mostrarInformacion();
    }
}
