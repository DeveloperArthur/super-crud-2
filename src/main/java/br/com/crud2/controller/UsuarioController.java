package br.com.crud2.controller;

import br.com.crud2.dominio.Usuario;
import br.com.crud2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioService service;

    public String adicionar(Usuario usuario) {
        return service.adicionar(usuario);
    }

    public String atualizar(Usuario usuario) {
        return service.atualizar(usuario);
    }

    public String deletar(Long id) {
        return service.deletar(id);
    }

    public Usuario buscarPorId(Long id) {
        return service.buscarPorId(id);
    }

    public List<Usuario> listar() {
        return service.listar();
    }
}
