/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificador;

/**
 *
 * @author SABRINA

    /**
     * @param args the command line arguments
     */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;    
import javax.swing.JOptionPane;

/**
 * @author Jean Cheiran
 */
public class Classificador {
     public static final Logger logger = Logger.getLogger(Classificador.class.getName());
     public static FileHandler log = null;
    /**
     * Recebe do usuário até 10 números inteiros para ordenar.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        try{ 
            
            log = new FileHandler("log.txt");

        }catch(IOException ex){
             Logger.getLogger(Classificador.class.getName()).log(Level.SEVERE, null, ex);
        }
         log.setFormatter(new SimpleFormatter());
        /* dizendo que vamos escrever logs de qualquer nível */
        log.setLevel(Level.ALL);
        /* registrando o arquivo para registros no LOGGER */
        logger.addHandler(log);
        
        logger.info("Declarando o vetor!");
        int[] numeros = new int[10];
        logger.info("PREENCHENDO O VETOR!");
        for(int i=1; i<10; i++){
            numeros[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite um número inteiro maior que zero: "));
        }
     
        numeros = Classificador.ordenar(numeros);
        int vetor = 0; 
        
        /* mostra os números ordenados */
        for(int i=1; i<10; i++){
            if(numeros[i]!=0){
                vetor = vetor +1;
            }
        }
        logger.warning("Deveria haver 10 na variáveis no vetor numeros e há " + vetor);
    }

    
    /**
     * Método que ordena os números no vetor recebido do menor par ao maior.
     * 
     * @param numeros
     * @return vetor de números ordenado
     */
    public static int[] ordenar(int[] numeros){
        int quantidadeDeNumeros = numeros.length;
        
        boolean houveTroca = false;
        
        /* repete as passagens no vetor até que não ocorra nenhuma troca */
        while(!houveTroca){
            houveTroca = false;
            /* percorre do início ao penúltimo elemento */
            for(int i=0; i<quantidadeDeNumeros-1; i++){
                /* se encontrar dois elementos adjacentes em ordem trocada... */
                if(numeros[i] > numeros[i+1]){
                    int temporario = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = numeros[i];
                    houveTroca = true;
                }
            }
        }
        
        return numeros;
    }
    
}
    
