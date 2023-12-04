public class Hangman {
    private String word = "";
    private int counter = 0;
    private final String[][] possibleWords = {
            {"sigh", "tart", "kids", "rope", "sore", "core", "lore", "mope", "ball", "mace", "fame", "good", "fork", "cook", "stay", "trap", "pore", "gray", "head", "mice"},
            {"saint", "stray", "bored", "trope", "arise", "shore", "beach", "rough", "trout", "ocean", "drama", "giant", "dense", "tired", "stuck", "liked", "again", "roses", "stand", "queen"},
            {"damage", "glazed", "defeat", "trivia", "sorted", "unlike", "lenses", "maniac", "string", "sister", "bother", "desert", "notice", "insane", "bouncy", "forward", "psyche", "guilty", "guitar", "dances"}
    };
    int random = (int)(Math.random() * 19);

    public Hangman(){

    }

    public String getWord(){
        return word;
    }

    String revealed = "";

    public void setWord(int length){
        if(length == 4){
            this.word = possibleWords[0][random];
            revealed = "____";
        } else if(length == 5){
            this.word = possibleWords[1][random];
            revealed = "_____";
        } else if(length == 6){
            this.word = possibleWords[2][random];
            revealed = "______";
        }
    }


    public void checkLetter(String letter){
        for(int i = 0; i < word.length(); i++){
            if(letter.equals(word.substring(i, i + 1))){
                counter++;
                revealed = (revealed.substring(0, i) + letter + revealed.substring(i + 1, word.length()));
            }
        }
    }

    public int getCounter() {
        int x = counter;
        counter = 0;
        return x;
    }
}
