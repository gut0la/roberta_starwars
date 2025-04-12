
package br.com.roberta.logging;
import java.util.logging.Logger;

public class ExemploLogger {
    //atributos
    private static final Logger logger = 
            Logger.getLogger(ExemploLogger.class.getName());
    
    //construtores
    
    
    //métodos
    public static void main(String[] args) {
        logger.info("Iniciando nosso programa...");
        try {
            int resultado = 10/0;  //forcei um erro pra usar de exemplo
        } catch (ArithmeticException e) {
            logger.severe("Erro: Divisão por zero");
        }
        
        logger.info("Fim do programa.");
        
    }
    
}
