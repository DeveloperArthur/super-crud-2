package br.com.crud2.service;

import br.com.crud2.dominio.Usuario;

import java.util.List;

public interface UsuarioService {
    String adicionar(Usuario usuario);

    String atualizar(Usuario usuario);

    String deletar(Long id);

    Usuario buscarPorId(Long id);

    List<Usuario> listar();
}
