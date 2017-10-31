/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import bancoDeMidias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.Filme;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia o conjunto de Listas
public class SistemaGeral implements GerenciadorDoSistema{
    BancoDeMidias colecaoDeFilmes;
    BancoDeMidias colecaoDeAudioLivros;
    BancoDeMidias colecaoDePodcasts;

    public SistemaGeral() {
        this.colecaoDeFilmes = new BancoDeMidias();
        this.colecaoDeAudioLivros = new BancoDeMidias();
        this.colecaoDePodcasts = new BancoDeMidias();
    }
    public void setColecaoDeFilmes(BancoDeMidias colecaoDeFilmes) {
        this.colecaoDeFilmes = colecaoDeFilmes;
    }

    public void setColecaoDeAudioLivros(BancoDeMidias colecaoDeAudioLivros) {
        this.colecaoDeAudioLivros = colecaoDeAudioLivros;
    }

    public void setColecaoDePodcasts(BancoDeMidias colecaoDePodcasts) {
        this.colecaoDePodcasts = colecaoDePodcasts;
    }

    public BancoDeMidias getColecaoDeFilmes() {
        return colecaoDeFilmes;
    }

    public BancoDeMidias getColecaoDeAudioLivros() {
        return colecaoDeAudioLivros;
    }

    public BancoDeMidias getColecaoDePodcasts() {
        return colecaoDePodcasts;
    }
    @Override
    public String toString() {
        return "SistemaGeral{" + "colecaoDeFilmes=" + colecaoDeFilmes + ", colecaoDeAudioLivros=" + colecaoDeAudioLivros + ", colecaoDePodcasts=" + colecaoDePodcasts + '}';
    }

    @Override
    public Midia cadastrar(Midia midia) {
                if(midia instanceof Filme){
                    this.colecaoDeFilmes.cadastrar(midia);
                }
            return midia;
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
