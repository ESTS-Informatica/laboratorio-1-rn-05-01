
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (Pedro Mendes % João Baptista) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame {
   /**
   * Atributos da classe WordGuessingGame
   * 
   */
  String hiddenWord;
  String guessedWord;
  int numberOfTries;
  InputReader reader;
  WordGenerator wordGenerator;
  /**
   * Construtor da classe WordGuessingGame
   * @param wordGenerator, um objeto WordGenerator para gerar a palavra oculta
   * @param numberOfTries, para contabilizar o número de tentativas
   * @param reader, Um objeto InputReader para receber entrada do utilizador.
   */
  public WordGuessingGame(WordGenerator wordGenerator,
  int numberOfTries, InputReader reader){
      this.wordGenerator = wordGenerator;
      this.hiddenWord = wordGenerator.generateWord(); // Gerar a palavra escondida usando o WordGenerator
      this.guessedWord = initializeGuessedWord(); // Inicializar a palavra adivinhada
      this.numberOfTries = numberOfTries;
      this.reader = reader;
  }
  /**
     * Inicializa a palavra que está sendo adivinhada com "_" em todas as posições.
     *
     * @return A palavra inicializada.
     */
    private String initializeGuessedWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hiddenWord.length(); i++) {
            sb.append("_");
        }
        return sb.toString();
    }
  /**
   * Métodos seletores da classe WordGuessingGame
   */
  
  /**
   * Método que retorna a palvara que se vai adivinhando
   */
  public String getGuessedWord(){
      return guessedWord;
  }
  /**
   * Método que retorna a palavra que se pretende adivinhar
   */
  public String getHiddenWord(){
     return hiddenWord;
     
    }
    
  /**
   * Método que retorna o número de tentativas
   */  
  public int getNumberOfTries(){
      return numberOfTries;
  }

   /**
    * Método que escreve para o ecrã a palavra que se vai adivinhando
    */
  public void showGuessedWord(){
      System.out.println(getGuessedWord());
      
  }
  
  /**
   * Apresenta uma mensagem incial de boas vindas
   */
  private void showWelcome(){
      System.out.println("BEM VINDO");
  }
  
  /**
   * Analisa se a letra fornecida pelo utilizador está correta
   */
  private boolean guess(char letter){
      boolean letterCorrect = false;
      for (int i = 0 ; i < hiddenWord.length();i++) {
              if (letter == hiddenWord.charAt(i) && guessedWord.charAt(i) == '_'){
                  guessedWord = changeCharInPosition(i, letter, guessedWord);
                  letterCorrect = true;
              }
        }
     
      return letterCorrect;
    }
    
    /**
     * Método para trocar um caracter num índice específico de uma String
     */
    private String changeCharInPosition(int position, char ch, String str){
    char[] charArray = str.toCharArray();
    charArray[position] = ch;
    return new String(charArray);
}

/**
 * Método para apresentar o número de tentativas, após a palavra ter sido adivinhada
 */
private void showResult(){
    System.out.println("Numero de tentativas:" +getNumberOfTries());
}

    /**
     * Método play, lé as letras que o utilizador vai escrevendo até que ele adivinhe a palavra escondida
     */
    
public void play(){
    showWelcome();
    showGuessedWord();

    while (!guessedWord.equals(hiddenWord)) {
        char letter = reader.getChar("");
        if (!guess(letter)) {
            numberOfTries++;
        }
        showGuessedWord();
    }

    showResult();
}

public void reset(){
    hiddenWord = wordGenerator.generateWord();
    guessedWord = initializeGuessedWord();
    
    
}
    
































}
