package com.departamentos.departamento.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.departamentos.departamento.Models.Departamentos;
import com.departamentos.departamento.Repository.DepartamentoRepositoryImpl;

@RequestMapping("/api/Departamentos")
@RestController
public class DepartamentosController {

    @Autowired
    DepartamentoRepositoryImpl DepartamentoServiceImpl;

    @GetMapping("/get-all")
    public List<Departamentos> getAll() {
        return this.DepartamentoServiceImpl.getall();
    }

    @GetMapping("/get-by-id/{id}")
    public Departamentos getById(@PathVariable Integer id) {
        return this.DepartamentoServiceImpl.getById(id);
    }

    @GetMapping("/get-by-name/{name}")
    public Departamentos getByName(@PathVariable String name) {
        return this.DepartamentoServiceImpl.getByName(name);
    }

    @GetMapping("/get-by-capital/{capital}")
    public Departamentos getByCapital(@PathVariable String capital) {
        return this.DepartamentoServiceImpl.getByCapital(capital);
    }

    @GetMapping("/get-by-poblacion/{poblacion}")
    public Departamentos getByPoblacion(@PathVariable Integer poblacion) {
        return this.DepartamentoServiceImpl.getByPoblacion(poblacion);
    }

    @GetMapping("/get-by-temperatura/{temperatura}")
    public Departamentos getByTemperatura(@PathVariable String temperatura) {
        return this.DepartamentoServiceImpl.getByTemperatura(temperatura);
    }

}
