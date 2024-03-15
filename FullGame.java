
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (Pedro Mendes % João Baptista) 
 * @version 15/03/24 07h42m
 */
 
public class FullGame {
    
    
    
    /**
   * Atributos da classe FullGame
   * 
   */
    
    WordGuessingGame wordGuessingGame;
    InputReader reader;

    /**
   * Construtor da classe FullGame
   * @param wordGuessingGame, um objeto WordGuessingGame jogo para adivinhar palavras
   * @param reader, Um objeto InputReader para receber entrada do utilizador.
      */
    public FullGame(WordGuessingGame wordGuessingGame, InputReader reader) {
        this.wordGuessingGame = wordGuessingGame;
        this.reader = reader;
      
    }

    
    
    
    
    /**
    * Método para permitir que o jogador adivinhe mais palavras sem o jogo terminar.
    */public void playFullGame() {
        char playAgain = 's';
        
        while (playAgain == 's' || playAgain =='S'){
            wordGuessingGame.reset();
            wordGuessingGame.play();
            
            System.out.println("Quer continuar a jogar? (s/n): ");
            playAgain = reader.getChar("");
        }
    
      
      
    }
   
    
    /**
     * Main
     */
   
    public static void main(String[] args) {
       WordGenerator wordGenerator = new WordGenerator();
        InputReader reader = new InputReader();
        WordGuessingGame wordGame = new WordGuessingGame(wordGenerator, 0, reader);
        FullGame fullGame = new FullGame(wordGame, reader);
        fullGame.playFullGame();
    }



}
    
    

