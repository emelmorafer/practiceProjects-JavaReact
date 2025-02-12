package com.company.optionals;

public class Rueda {
    private Long id;
    private String nombre;
    private Neumatico neumatico;

    public Rueda(Long id, String nombre, Neumatico neumatico) {
        this.id = id;
        this.nombre = nombre;
        this.neumatico = neumatico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(Neumatico neumatico) {
        this.neumatico = neumatico;
    }
}
