/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.Jogador;
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
public class JogadorDaoImpl {

    private Connection conexao;
    private PreparedStatement prepararSql;
    private ResultSet resultado;

    public List<Jogador> pesquisarPorNome(String nome) {
        String consulta = "SELECT * FROM jogador WHERE nome LIKE ?";
        Jogador jog;
        List<Jogador> jogadores = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setString(1, "%" + nome + "%");
            resultado = prepararSql.executeQuery();
            while (resultado.next()) {
                jog = new Jogador();
                jog.setId(resultado.getInt("id"));
                jog.setNome(resultado.getString("nome"));
                jog.setNascimento(resultado.getDate("nascimento"));
                jog.setBola(resultado.getString("bola"));
                jog.setTelefone(resultado.getString("Telefone"));
                jog.setEmail(resultado.getString("email"));
                jog.setFederacao(resultado.getString("federacao"));
                jogadores.add(jog);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar jogador por nome " + e.getMessage());
        }

        return jogadores;
    }

    public void salvar(Jogador jogador) {
        String sql = "INSERT INTO jogador (nome, nascimento, bola, telefone, email, federacao)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, jogador.getNome());
            prepararSql.setDate(2,  new Date(jogador.getNascimento().getTime()));
            prepararSql.setString(3, jogador.getBola());
            prepararSql.setString(4, jogador.getTelefone()); 
            prepararSql.setString(5, jogador.getEmail());
            prepararSql.setString(6, jogador.getFederacao());
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao salvar o jogador " + e.getMessage());
        }
    }

    public void excluir(int id) {
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement("DELETE FROM jogador WHERE id = ?");
            prepararSql.setInt(1, id);
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("erro ao excluir jogador " + e.getMessage());
        }
    }

    public void alterar(Jogador jogador) {
        String sql = "UPDATE jogador SET nome = ?, nascimento = ?, bola= ?, telefone = ?, email = ?, federacao = ? WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, jogador.getNome());
            prepararSql.setDate(2, new Date(jogador.getNascimento().getTime()));
            prepararSql.setString(3, jogador.getBola());
            prepararSql.setString(4, jogador.getEmail());
            prepararSql.setString(5, jogador.getTelefone());
            prepararSql.setString(6, jogador.getFederacao());
            prepararSql.setInt(7, jogador.getId());
            prepararSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao alterar o jogador " + e.getMessage());
        }
    }

    public Jogador pesquisarPorID(int id) {
        String consulta = "SELECT * FROM jogador WHERE id = ?";
        Jogador jogador = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setInt(1, id);
            resultado = prepararSql.executeQuery();
            if (resultado.next()) {
                jogador = new Jogador();
                jogador.setId(id);
                jogador.setNome(resultado.getString("nome"));
                jogador.setNascimento(resultado.getDate("nascimento"));
                jogador.setBola(resultado.getString("bola"));
                jogador.setTelefone(resultado.getString("telefone"));
                jogador.setEmail(resultado.getString("email"));
                jogador.setFederacao(resultado.getString("federacao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar jogador por id" + e.getMessage());
        }
        return jogador;
    }
}
