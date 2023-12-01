public class Trivia {
    public Trivia(String type){

    }

    String[][] historyQuestions = {
            {"Who was the dictator of Germany during World War II?", "What country originally colonized Canada?", "What American president issued the Emancipation Proclamation?", "Who led the British colonies in North America to a victory in the revolutionary war?", "Who was the first president of the United States of America?"},
            {"Who did John Wilkes Booth assassinate?", "What was the name of the first civilization?", "Who invented the telephone?", "What was the first country to have gunpowder?", "Who is regarded as \"The Father of communism\"?"},
            {"Who was the 34th president of the United States of America?", "Who was the leader of the Viet Cong during the Vietnam war?", "What is the name of the racial discrimination in South Africa?", "Who was the leader of the Soviet Union during World War II?", "What Spanish explorer conquered the Aztecs?"},
            {"In what year did the american Civil War start?", "Who invented the first computer?", "What year did the Boston Massacre occur in?", "What was the name of the second Japanese city that America bombed near the end of WWII?", "In what year did the USSR disband?"},
            {"Who proposed that the constitution of the United States of America have a bill of rights?", "What is the form of government of the U.K?", "Who was the leader of the russian revolution?", "Who was the Chinese emperor that started construction of the Great Wall of China?", "Who is commonly referred to as the person who created the first printing press?"}};

    public String getHistoryQuestions(int array, int question) {
        return historyQuestions[array][question];
    }
}
