package com.departamentos.departamento.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Departamentos {
    private String name;
    private Integer id;
    private String Capital;
    private Integer Poblacion;
    private String Temperatura;

    // Constructor
    public Departamentos(Integer id, String name, String capital, Integer poblacion, String temperatura) {
        this.id = id;
        this.name = name;
        Capital = capital;
        Poblacion = poblacion;
        Temperatura = temperatura;
    }

    public Departamentos() {
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public Integer getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        Poblacion = poblacion;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

}
