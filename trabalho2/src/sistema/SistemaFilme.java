/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.Filme;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class SistemaFilme extends SistemaGeral implements GerenciadorDoSistema{
    Filme filme;
    public SistemaFilme(){
        super();
    }
    @Override
    public Midia cadastrar(Midia midia) {
        Filme atual = (Filme) midia;
        this.filme = new Filme(atual.getGenero(), atual.getIdioma(), atual.getDiretor(),atual.getAtoresPrincipais(), atual.getDuracao(), atual.getCaminho(), atual.getTitulo(), atual.getDescricao(), atual.getAno());
        return this.filme;
    }

    @Override
    public Midia consultar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia excluir(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia exibir(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenar(List<Midia> midias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
