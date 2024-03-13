
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
  
  /**
   * Construtor da classe WordGuessingGame
   * @param hiddenWord, representa a palavra que se pretende adivinhar
   * @param guessedWord, representa a palavra que se vai adivinhando
   * @param numberOfTries, para contabilizar o número de tentativas
   */
  public WordGuessingGame(String hiddenWord, String guessedWord,
  int numberOfTries){
      this.hiddenWord = hiddenWord;
      this.guessedWord = guessedWord;
      this.numberOfTries = numberOfTries;
  }
  /**
   * Métodos seletores da classe WordGuessingGame
   */
  public String getGuessedWord(){
      return guessedWord;
  }
  public String getHiddenWord(){
     return hiddenWord;
     
    }
  public int getNumberOfTries(){
      return numberOfTries;
  }
   /**
    * Método que escreve para o ecrã a palavra que se vai adivinhando
    */
  public void showGuessedWord(){
      System.out.println(getGuessedWord());
      
  }
    
}
