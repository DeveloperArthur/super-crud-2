package br.com.crud2.service;

import br.com.crud2.dominio.Usuario;
import br.com.crud2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository repository;

    @Override
    public String adicionar(Usuario usuario) {
        try {
            repository.save(usuario);
            return "Usuario adicionado com sucesso";
        } catch (Exception e) {
            return "Erro ao adicionar usuario";
        }
    }

    @Override
    public String atualizar(Usuario usuario) {
        try {
            repository.save(usuario);
            return "Usuario atualizado com sucesso";
        } catch (Exception e) {
            return "Erro ao atualizar usuario";
        }
    }

    @Override
    public String deletar(Long id) {
        try {
            repository.delete(id);
            return "Usuario excluido com sucesso";
        } catch (Exception e) {
            return "Erro ao deletar usuario";
        }
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
