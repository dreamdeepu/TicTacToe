package models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "BOT", symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }


}
