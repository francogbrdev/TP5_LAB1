/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_lab1;

/**
 *
 * @author franco
 */
public class TestDirectorio {
     public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // A. Agregar contactos
        directorio.agregarContacto(123456789L, new Contacto(12345678, "Juan", "Perez", "Mendoza", "Av. Siempre Viva 123"));
        directorio.agregarContacto(987654321L, new Contacto(87654321, "Ana", "Gomez", "San Luis", "Belgrano 456"));
        directorio.agregarContacto(456123789L, new Contacto(45678912, "Luis", "Martinez", "Mendoza", "Rivadavia 789"));
        directorio.agregarContacto(741852963L, new Contacto(96325874, "Laura", "Perez", "Córdoba", "Colon 321"));

        // B. Buscar contacto por teléfono
        System.out.println("Buscar contacto por teléfono: " + directorio.buscarContacto(123456789L));

        // C. Buscar teléfonos por apellido
        System.out.println("Teléfonos de apellido Perez: " + directorio.buscarTelefono("Perez"));

        // D. Buscar contactos por ciudad
        System.out.println("Contactos en Mendoza: " + directorio.buscarContactos("Mendoza"));

        // E. Borrar contacto
        directorio.borrarContacto(987654321L);
        System.out.println("Directorio después de borrar: " + directorio);
    }
}
