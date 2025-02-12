package com.company.optionals;

public class Carro {
    private Long id;
    private String nombre;
    private Rueda rueda;

    public Carro(Long id, String nombre, Rueda rueda) {
        this.id = id;
        this.nombre = nombre;
        this.rueda = rueda;
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

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }
}
