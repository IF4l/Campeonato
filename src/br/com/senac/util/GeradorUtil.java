/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.util;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author fabio.filho1
 */
public class GeradorUtil {

    public static String gerarNome() {
        String[] nomes = {"Messi", "Neymar", "Michael Felps", "Cristiano Ronaldo", "Lembron james", "Marta", "oscar ", "Arthur", "gugu",
            "Pelé", "Mbappé", "Rayssa Leal", "Eduardo", "Letícia", "Jeferson", "Fábio", "luccas", "Igor", "Silvio"};

        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        String nome = nomes[indice];
        return nome;
    }
    
    public static String gerarFederacao() {
        String[] nomes = {"FPBOL", "FCBOL", "FBBOL", "FSBOL", "FBOML", "FBDF", "BOLICHESC", "FBRJ", "FPRBOL", "FBRS"};

        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        String nome = nomes[indice];
        return nome;
    }
    
      public static String gerarTelefoneFixo() {
        String telefone = gerarNumero(10);
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("(##)####-####");
            mascara.setValueContainsLiteralCharacters(false);
            telefone = mascara.valueToString(telefone);
        } catch (ParseException ex) {
            System.out.println("Erro na mascara " + ex.getMessage());
        }
        return telefone;
    }
    
         public static String gerarNumero(int qtd) {
        int numeroGerado;
        String numero = "";

        for (int i = 0; i < qtd; i++) {
            numeroGerado = (int) (Math.random() * 10);
            numero = numero + numeroGerado;
        }
        return numero;
    }
      
          public static void main(String[] args) {

        String numero = gerarTelefoneFixo();
        System.out.println("Número: " + numero);
    }
}
