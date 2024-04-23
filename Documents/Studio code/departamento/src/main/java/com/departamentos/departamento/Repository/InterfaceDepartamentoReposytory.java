package com.departamentos.departamento.Repository;

import java.util.List;

import com.departamentos.departamento.Models.Departamentos;

public interface InterfaceDepartamentoReposytory {
    public List<Departamentos> getall();

    public Departamentos getByName(String name);

    public Departamentos getById(Integer id);

    public Departamentos getByCapital(String capital);

    public Departamentos getByPoblacion(Integer poblacion);

    public Departamentos getByTemperatura(String temperatura);

}
