/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_lab1;


import java.util.Objects;



public class Contacto {
    private long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto(long dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public long getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCiudad() { return ciudad; }
    public String getDireccion() { return direccion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " (DNI: " + dni + ") - " + ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto c = (Contacto) o;
        return dni == c.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
