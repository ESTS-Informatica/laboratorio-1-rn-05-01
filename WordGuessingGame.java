
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (Pedro Mendes % João Baptista) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
  /**
   * Atributos da classe WordGuessingGame
   * 
   */
  String hiddenWord = "abc";
  String guessedWord = "___";
  int numberOfTries;
  InputReader reader;
  
  /**
   * Construtor da classe WordGuessingGame
   * @param hiddenWord, representa a palavra que se pretende adivinhar
   * @param guessedWord, representa a palavra que se vai adivinhando
   * @param numberOfTries, para contabilizar o número de tentativas
   */
  public WordGuessingGame(String hiddenWord, String guessedWord,
  int numberOfTries, InputReader reader){
      this.hiddenWord = hiddenWord;
      this.guessedWord = guessedWord;
      this.numberOfTries = numberOfTries;
      this.reader = reader;
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
      
      for (int i = 0 ; i < hiddenWord.length();i++) {
              if (letter == hiddenWord.charAt(i)){
                  guessedWord = changeCharInPosition(i, letter, guessedWord);
              }
        }
     
      return hiddenWord.equals(guessedWord);
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
 
        while (guess(reader.getChar(""))== false){
            guess(reader.getChar(""));
            showGuessedWord();
            numberOfTries++;
            
            if (guessedWord.equals(hiddenWord)){
                break;
            }
        }
   showGuessedWord();
   showResult();

}

  }
