package com.departamentos.departamento.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departamentos.departamento.Models.Departamentos;
import com.departamentos.departamento.Repository.InterfaceDepartamentoReposytory;

@Service
public class DepartamentoServiceImpl implements InterfaceDepartamentoService {

    @Autowired
    InterfaceDepartamentoReposytory DepartamentoRep;

    @Override
    public List<Departamentos> getall() {
        return this.DepartamentoRep.getall();
    }

    @Override
    public Departamentos getByName(String name) {
        return this.DepartamentoRep.getByName(name);
    }

    @Override
    public Departamentos getById(Integer id) {
        return this.DepartamentoRep.getById(id);
    }

    @Override
    public Departamentos getByCapital(String capital) {
        return this.DepartamentoRep.getByCapital(capital);
    }

    @Override
    public Departamentos getByPoblacion(Integer poblacion) {
        return this.DepartamentoRep.getByPoblacion(poblacion);
    }

    @Override
    public Departamentos getByTemperatura(String temperatura) {
        return this.DepartamentoRep.getByTemperatura(temperatura);
    }

}
