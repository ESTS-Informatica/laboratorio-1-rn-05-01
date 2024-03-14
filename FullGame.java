
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (Pedro Mendes % João Baptista) 
 * @version (um número da versão ou uma data)
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
   * @param wordGenerator, um objeto WordGenerator para gerar a palavra oculta
   * @param reader, Um objeto InputReader para receber entrada do utilizador.
   * @param numberOfTries, para contabilizar o número de tentativas
   * @param wordGuessingGame,um obejecto WordGenerator para iniciar o jogo 
   */
    public FullGame() {
        WordGenerator wordGenerator = new WordGenerator();
        reader = new InputReader();
        int numberOfTries = 10;
        wordGuessingGame = new WordGuessingGame(wordGenerator, numberOfTries, reader);
    }

    
    
    
    
    /**
    * Método para manter o jogo continuadamente até o jagador decidir parar de jogar
    */public void playFullGame() {
        boolean continuePlaying = true;
        while (continuePlaying) {
            
            wordGuessingGame.play();
            System.out.println("Deseja jogar novamente? (s/n)");
            char choice = reader.getChar("");
            if (choice != 's' && choice != 'S') {
                continuePlaying = false;
                
            }else
            {
                wordGuessingGame.reset();
                    
            }
        }
    }
   
    
    
    
    public static void main(String[] args) {
        FullGame fullGame = new FullGame();
        fullGame.playFullGame();
    }



}
    
    

