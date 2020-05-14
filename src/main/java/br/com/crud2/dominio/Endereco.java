package br.com.crud2.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private int numero;
    private String estado;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String estado, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", estado='" + estado + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
