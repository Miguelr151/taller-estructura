package com.departamentos.departamento.Repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.departamentos.departamento.Models.Departamentos;

@Repository
public class DepartamentoRepositoryImpl implements InterfaceDepartamentoReposytory {
    // List de tipo departamento
    List<Departamentos> dataDepartamentos;

    // Constructor
    public DepartamentoRepositoryImpl(List<Departamentos> dataDepartamentos) {
        this.dataDepartamentos = Arrays.asList(
                new Departamentos(01, "Huila", "Neiva", 1800, "40c"),
                new Departamentos(02, "Boyaca", "Tunja", 2000, "12c"),
                new Departamentos(03, "Cundinamarca", "Bogota", 5000, "15C"),
                new Departamentos(04, "Nariño", "Pasto", 2100, "22c"));

    }

    @Override
    public List<Departamentos> getall() {
        return dataDepartamentos;
    }

    @Override
    public Departamentos getByName(String name) {
        return this.dataDepartamentos.stream().filter(Departamento -> Departamento.getName().equals(name)).findFirst()
                .orElse(null);
    }

    @Override
    public Departamentos getById(Integer id) {
        return this.dataDepartamentos.stream().filter(Departamento -> Departamento.getId().equals(id)).findFirst()
                .orElse(null);
    }

    @Override
    public Departamentos getByCapital(String capital) {
        return this.dataDepartamentos.stream().filter(Departamento -> Departamento.getCapital().equals(capital))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Departamentos getByPoblacion(Integer poblacion) {
        return this.dataDepartamentos.stream().filter(Departamento -> Departamento.getPoblacion().equals(poblacion))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Departamentos getByTemperatura(String temperatura) {
        return this.dataDepartamentos.stream().filter(Departamento -> Departamento.getTemperatura().equals(temperatura))
                .findFirst()
                .orElse(null);
    }

}
