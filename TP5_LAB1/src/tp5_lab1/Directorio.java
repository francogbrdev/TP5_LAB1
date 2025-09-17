/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_lab1;


import java.util.*;
import java.util.Map.Entry;

public class Directorio {
    // TreeMap: clave = teléfono / valor = Contacto
    private TreeMap<Long, Contacto> mapa = new TreeMap<>();

    // A. agregarContacto()
    public boolean agregarContacto(Long telefono, Contacto c) {
        if (telefono == null || c == null) return false;
        if (mapa.containsKey(telefono)) return false;
        mapa.put(telefono, c);
        return true;
    }

    // B. buscarContacto
    public Contacto buscarContacto(Long telefono) {
        return mapa.get(telefono); // null si no existe
    }

    // C. buscarTelefono()
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> resultado = new TreeSet<>();
        if (apellido == null) return resultado;
        for (Entry<Long, Contacto> e : mapa.entrySet()) {
            if (apellido.equalsIgnoreCase(e.getValue().getApellido())) {
                resultado.add(e.getKey());
            }
        }
        return resultado;
    }

    // D. buscarContactos()
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        if (ciudad == null) return lista;
        for (Contacto c : mapa.values()) {
            if (ciudad.equalsIgnoreCase(c.getCiudad())) {
                lista.add(c);
            }
        }
        return lista;
    }

    // E. borrarContacto(): por teléfono
    public boolean borrarContacto(Long telefono) {
        if (mapa.containsKey(telefono)) {
            mapa.remove(telefono);
            return true;
        }
        return false;
    }

    //metodos auxiliares
    public Set<Long> obtenerTelefonos() {
        return mapa.keySet();
    }

    public Collection<Contacto> obtenerContactos() {
        return mapa.values();
    }

    public Set<String> obtenerCiudades() {
        TreeSet<String> ciudades = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (Contacto c : mapa.values()) {
            if (c.getCiudad() != null && !c.getCiudad().trim().isEmpty()) {
                ciudades.add(c.getCiudad());
            }
        }
        return ciudades;
    }

    public Set<String> obtenerApellidos() {
        TreeSet<String> ap = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (Contacto c : mapa.values()) {
            if (c.getApellido() != null && !c.getApellido().trim().isEmpty()) {
                ap.add(c.getApellido());
            }
        }
        return ap;
    }

    // buscador x DNI
    public Set<Long> buscarTelefonosPorDni(long dni) {
        Set<Long> res = new TreeSet<>();
        for (Entry<Long, Contacto> e : mapa.entrySet()) {
            if (e.getValue().getDni() == dni) res.add(e.getKey());
        }
        return res;
    }
}
