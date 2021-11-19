/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.Jogador;
import br.com.senac.entidade.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UsuarioDaoImpl {

    private Connection conexao;
    private PreparedStatement prepararSql;
    private ResultSet resultado;

    public Usuario logar(String login, String senha) {
        String consulta = "SELECT * FROM usuario WHERE login = ? and senha = ?";
        Usuario usuario = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
          
            prepararSql.setString(1, login);
            prepararSql.setString(2, senha);
            resultado = prepararSql.executeQuery();
            if (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt("id"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar usuario por id" + e.getMessage());
        }
        return usuario;
    }

    public List<Usuario> pesquisarPorNome(String nome) {
        String consulta = "SELECT * FROM usuario WHERE nome LIKE ?";
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setString(1, "%" + nome + "%");
            resultado = prepararSql.executeQuery();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setNome(resultado.getString("nome"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuarios.add(usuario);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar jogador por nome " + e.getMessage());
        }

        return usuarios;
    }

    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome,login, senha)"
                + " values(?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, usuario.getNome());
            prepararSql.setString(2, usuario.getLogin());
            prepararSql.setString(3, usuario.getSenha());
          
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao salvar o usuario " + e.getMessage());
        }
    }

    public void excluir(int id) {
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement("DELETE FROM usuario WHERE id = ?");
            prepararSql.setInt(1, id);
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("erro ao excluir usuario " + e.getMessage());
        }
    }

    public void alterar(Usuario usuario) {
        String sql = "UPDATE usuario SET nome = ?, login = ?,  senha = ? WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, usuario.getNome());
            prepararSql.setString(2, usuario.getLogin());
            prepararSql.setString(3, usuario.getSenha());
            
            prepararSql.setInt(7, usuario.getId());
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao alterar o usuario " + e.getMessage());
        }
    }

    public Usuario pesquisarPorID(int id) {
        String consulta = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuario = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setInt(1, id);
            resultado = prepararSql.executeQuery();
            if (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(id);
                usuario.setNome(resultado.getString("nome"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar usuario por id" + e.getMessage());
        }
        return usuario;
    }
}
