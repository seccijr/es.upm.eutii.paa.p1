package almacen;

import paa.provincias.IPoblacion;

class Poblacion implements IPoblacion, Comparable<IPoblacion> {
    private String nombre;
    private String provincia;
    private int habitantes;

    public Poblacion() {}

    public Poblacion(String nombre) {
        this.nombre = nombre;
    }

    public Poblacion(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Poblacion(String nombre, String provincia, int habitantes) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public int getHabitantes() {
        return this.habitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int compareTo(IPoblacion p) {
        return this.getNombre().compareTo(p.getNombre());
    }
}
