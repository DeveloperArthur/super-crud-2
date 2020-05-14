package br.com.crud2.service;

import br.com.crud2.dominio.Usuario;
import br.com.crud2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository repository;

    @Override
    public String adicionar(Usuario usuario) {
        repository.save(usuario);
        return "Usuario adicionado com sucesso";
    }

    @Override
    public String atualizar(Usuario usuario) {
        repository.save(usuario);
        return "Usuario atualizado com sucesso";
    }

    @Override
    public String deletar(Long id) {
        repository.delete(id);
        return "Usuario excluido com sucesso";
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Usuario> listar() {
        return repository.findAll();
    }
}
