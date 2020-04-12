package com.example.ac1poo2.Service;

import java.util.List;

import com.example.ac1poo2.Entity.Funcionario;
import com.example.ac1poo2.Repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FuncionarioService
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll(); 
    }
}