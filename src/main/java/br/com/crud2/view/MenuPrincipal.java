package br.com.crud2.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {

    JLabel lblTitulo = new JLabel("Super Crud 2");
    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnAtualizar = new JButton("Atualizar");
    JButton btnDeletar = new JButton("Deletar");
    JButton btnBuscar = new JButton("Buscar por id");
    JButton btnListar = new JButton("Listar usuarios");

    public MenuPrincipal() {
        setTitle("Super Crud 2");
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);
        btnCadastrar.setBounds(180, 80, 120, 40);
        btnAtualizar.setBounds(180, 130, 120, 40);
        btnDeletar.setBounds(180, 180, 120, 40);
        btnBuscar.setBounds(180, 230, 120, 40);
        btnListar.setBounds(180, 280, 120, 40);
        lblTitulo.setBounds(170, 30, 200, 40);

        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 25));

        add(lblTitulo);
        add(btnCadastrar);
        add(btnAtualizar);
        add(btnDeletar);
        add(btnBuscar);
        add(btnListar);

        btnCadastrar.addActionListener(this);
        btnAtualizar.addActionListener(this);
        btnDeletar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnListar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnCadastrar)) {
            new CadastrarUsuario();
        } else if (e.getSource().equals(btnAtualizar)) {
            new AtualizarUsuario();
        } else if (e.getSource().equals(btnDeletar)) {
            new DeletarUsuario();
        } else if (e.getSource().equals(btnBuscar)) {
            new BuscarUsuario();
        } else if (e.getSource().equals(btnListar)) {
            new ListarUsuarios();
        }
    }
}
