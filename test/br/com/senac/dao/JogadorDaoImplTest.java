/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.Jogador;
import br.com.senac.util.GeradorUtil;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class JogadorDaoImplTest {

    private Jogador jogador;
    private JogadorDaoImpl jogDao;

    public JogadorDaoImplTest() {
        jogDao = new JogadorDaoImpl();
    }

//    @Test
    public void PesquisarPorNome() {
        System.out.println("pesquisar por Nome");
        String nome = "fulano";
        List<Jogador> jogs = jogDao.pesquisarPorNome(nome);
        for (Jogador jog : jogs) {
            mostrarJogador(jog);
        }
    }

    @Test
    public void testSalvar() {
        System.out.println("salvar");
        jogador = new Jogador(GeradorUtil.gerarNome(), new Date(), "Bola de 7.5kg", GeradorUtil.gerarTelefoneFixo(),
                "fulano@gmail.com", GeradorUtil.gerarFederacao());
        jogDao.salvar(jogador);
    }

//    @Test
    public void testExcluir() {
        System.out.println("excluir");
        jogDao.excluir(1);
    }

//    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Jogador jogadorBd = jogDao.pesquisarPorID(2);
        jogadorBd.setNome(jogadorBd.getNome() + " alterado");
        jogadorBd.setNascimento(new Date(jogadorBd.getNascimento().getTime() + 2000 - 12 - 22));
        jogadorBd.setBola(jogadorBd.getBola() + "bola 7kg");
        jogadorBd.setTelefone(jogadorBd.getTelefone() + " alterado");
        jogadorBd.setFederacao(jogadorBd.getFederacao() + "FGBOL");
    }

//    @Test
    public void testPesquisarPorID() {
        System.out.println("pesquisarPorID");
        int id = 2;
        Jogador jogadorPesquisado = jogDao.pesquisarPorID(id);
        assertNotNull(jogadorPesquisado);
        System.out.println("Nome " + jogadorPesquisado.getNome());
    }

    private void mostrarJogador(Jogador jog) {
        System.out.println("ID " + jog.getId());
        System.out.println("Nome " + jog.getNome());
        System.out.println("Nascimento " + jog.getNascimento());
        System.out.println("Bola " + jog.getBola());
        System.out.println("Telefone " + jog.getTelefone());
        System.out.println("E-mail " + jog.getEmail());
        System.out.println("Federção " + jog.getFederacao());
    }
}
