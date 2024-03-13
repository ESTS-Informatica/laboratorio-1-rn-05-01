import java.util.ArrayList;
import java.util.Random;

/**
 * Classe para gerar palavras aleatoriamente ou adicionar novas palavras à lista de palavras disponíveis.
 */

public class WordGenerator {
    
    ArrayList words;
    
    
    /**
     * Constrói um objeto WordGenerator e preenche a lista inicial de palavras.
     */
    
    public WordGenerator()
    {
        words = new ArrayList();
        fillArrayList();
       
    }
    /**
     * Método privado que adiciona ao ArrayList um conjunto de palavras
     * que são keywords em java
     */

    private void fillArrayList() {
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    /**
     * Retorna uma palavra aleatória do ArrayList
     *
     */
    public String generateWord(){
        Random rd = new Random();
        int index = rd.nextInt(words.size());
               
        return (String) words.get(index);
    }
    
    
     /**
     * Método que permite adicionar uma palavra ao ArrayList.
     * 
     * @param word palavra a ser adicionada
     */
    public void addWord(String word) {
        words.add(word);
    }
    
    
}


