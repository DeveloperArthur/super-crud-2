package br.com.crud2;

import br.com.crud2.controller.UsuarioController;
import br.com.crud2.dominio.Endereco;
import br.com.crud2.dominio.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Crud2Application {
    public static void main(String[] args) {
        SpringApplication.run(Crud2Application.class, args);
    }
}
