package br.com.roberta.expressaoregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRegexCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String celular;
        
        
        System.out.println("Digite o telefone no formato (XX)XXXXX-XXXX");
        celular = leia.nextLine();
        
        String regex_cel = "\\d{2}\\+\\(\\d{2}\\)\\d{5}-\\d{4}";
        Pattern pattern = Pattern.compile(regex_cel);
        
        Matcher matcher = pattern.matcher(celular);
        
        if (matcher.matches()){
            System.out.println("Celular válido");
        }else{
            System.out.println("Celular Inválido");
        }
        leia.close();
    }
    
}
