package br.com.crud2.view;

import br.com.crud2.controller.UsuarioController;
import br.com.crud2.dominio.Endereco;
import br.com.crud2.dominio.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarUsuario extends JFrame implements ActionListener {

    JLabel lblTitulo = new JLabel("Adicionar usuario");
    JLabel lblNome = new JLabel("Nome");
    JLabel lblIdade = new JLabel("Idade");
    JLabel lblCpf = new JLabel("Cpf");
    JLabel lblLogradouro = new JLabel("Logradouro");
    JLabel lblNumero = new JLabel("Numero");
    JLabel lblEstado = new JLabel("Estado");
    JLabel lblBairro = new JLabel("Bairro");
    JButton btnCadastrar = new JButton("Cadastrar");
    JLabel lblMensagem = new JLabel("");

    JTextField txtNome = new JTextField(10);
    JTextField txtIdade = new JTextField(10);
    JTextField txtCpf = new JTextField(10);
    JTextField txtLogradouro = new JTextField(10);
    JTextField txtNumero = new JTextField(10);
    JTextField txtEstado = new JTextField(10);
    JTextField txtBairro = new JTextField(10);

    public CadastrarUsuario() {
        setTitle("Adicionar usuario");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);
        lblTitulo.setBounds(150, 30, 200, 40);
        lblNome.setBounds(100, 70, 200, 50);
        lblIdade.setBounds(100, 110, 200, 50);
        lblCpf.setBounds(100, 150, 200, 50);
        lblLogradouro.setBounds(100, 190, 200, 50);
        lblNumero.setBounds(100, 230, 200, 50);
        lblEstado.setBounds(100, 270, 200, 50);
        lblBairro.setBounds(100, 310, 200, 50);
        btnCadastrar.setBounds(180, 380, 120, 40);

        txtNome.setBounds(200, 80, 200, 30);
        txtIdade.setBounds(200, 120, 200, 30);
        txtCpf.setBounds(200, 160, 200, 30);
        txtLogradouro.setBounds(200, 200, 200, 30);
        txtNumero.setBounds(200, 240, 200, 30);
        txtEstado.setBounds(200, 280, 200, 30);
        txtBairro.setBounds(200, 320, 200, 30);
        lblMensagem.setBounds(180, 430, 290, 30);

        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNome.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblIdade.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblCpf.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblLogradouro.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblEstado.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblBairro.setFont(new Font("Calibri", Font.PLAIN, 20));
        lblMensagem.setFont(new Font("Calibri", Font.PLAIN, 20));

        txtNome.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtIdade.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtCpf.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtLogradouro.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtEstado.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtBairro.setFont(new Font("Calibri", Font.PLAIN, 20));

        add(lblTitulo);
        add(lblNome);
        add(lblIdade);
        add(lblCpf);
        add(lblLogradouro);
        add(lblNumero);
        add(lblEstado);
        add(lblBairro);
        add(btnCadastrar);
        add(txtNome);
        add(txtIdade);
        add(txtCpf);
        add(txtLogradouro);
        add(txtNumero);
        add(txtEstado);
        add(txtBairro);
        add(lblMensagem);

        btnCadastrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Endereco endereco = new Endereco(txtLogradouro.getText(), Integer.parseInt(txtNumero.getText()), txtEstado.getText(), txtBairro.getText());
        Usuario usuario = new Usuario(txtNome.getText(), Integer.parseInt(txtIdade.getText()), txtCpf.getText(), endereco);
        String mensagem = new UsuarioController().adicionar(usuario);
        lblMensagem.setText(mensagem);
    }
}
