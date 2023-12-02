public class Trivia {
    public Trivia(){

    }

    String[][] historyQuestions = {
            {"Who was the dictator of Germany during World War II?", "What country originally colonized Canada?", "What American president issued the Emancipation Proclamation?", "Who was the first american president?", "Who was the scientist that created the equation: \"e = mc^2\"?"},
            {"Who did John Wilkes Booth assassinate?", "What was the name of the first civilization?", "Who invented the telephone?", "What was the first country to have gunpowder?", "Who is regarded as \"The Father of communism\"?"},
            {"Who was the 24th president of the United States of America?", "Who was the leader of the Viet Minh during the Vietnam war?", "What is the name of the racial discrimination in South Africa?", "Who was the leader of the Soviet Union during World War II?", "Where was Christopher Columbus trying to travel to when he landed in America?"},
            {"In what year did the american Civil War start?", "Who invented the first computer?", "What year did the Boston Massacre occur in?", "What was the name of the second Japanese city that America bombed near the end of WWII?", "In what year did the USSR disband?"},
            {"Who proposed that the constitution of the United States of America have a bill of rights?", "What is the form of government of the U.K?", "Who was the leader of the russian revolution?", "Who was the Chinese emperor that started construction of the Great Wall of China?", "Who is commonly referred to as the person who created the first printing press?"}
    };

    String[][] historyAnswers = {
            {"Adolf Hitler", "France", "Abraham Lincoln", "George Washington", "Albert Einstein"},
            {"Abraham Lincoln", "Mesopotamia", "Alexander Graham Bell", "China", "Karl Marx"},
            {"Grover Cleveland", "Ho Chi Minh", "Apartheid", "Joseph Stalin", "India"},
            {"1861", "Charles Babbage", "1770", "Nagasaki", "1991"},
            {"George Mason", "Constitutional Monarchy", "Vladimir Lenin", "Qin Shi Huang", "Johannes Gutenberg"}
    };

    public String getQuestion(int array, int question) {
        return historyQuestions[array][question];
    }
    public String getAnswer(int array, int question) {
        return historyAnswers[array][question];
    }

    public boolean checkAnswer(int array, int question, String answer){
        return getAnswer(array, question).toLowerCase().equals(answer.toLowerCase());
    }
}
