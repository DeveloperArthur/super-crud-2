package br.com.crud2.controller;

import br.com.crud2.dominio.Usuario;
import br.com.crud2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioController {
    @Autowired
    UsuarioRepository repository;

    public String adicionar(Usuario usuario){
        repository.save(usuario);
        return "Usuario adicionado com sucesso";
    }

    public String atualizar(Usuario usuario){
        repository.save(usuario);
        return "Usuario atualizado com sucesso";
    }

    public String deletar(Long id){
        repository.delete(id);
        return "Usuario excluido com sucesso";
    }

    public Usuario buscarPorId(Long id){
        return repository.findOne(id);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }
}
