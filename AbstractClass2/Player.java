package AbstractClass2;

public abstract class Player {
    protected String playerName;
    protected String characterName;
    protected int level;
    protected int hp;
    protected int xp;
    private static final int baseXP = 0;
    private static final int baseLevel = 1;
    private static final int baseHP = 100;

    public Player (String playerName, String characterName){
        this.playerName = playerName;
        this.characterName = characterName;
        this.level = baseLevel;
        this.hp = baseHP;
        this.xp = baseXP;
    }

    public Player (String playerName, String characterName, int level, int hp, int xp){
        this.playerName = playerName;
        this.characterName = characterName;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }
        
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

    public abstract void gainXP(int value);
    public String toString (String s){
        return "Player Name: " + this.playerName +
        "\nCharacter Name: " + this.characterName +
        "\nCharacter Level: " + this.level +
        "\nCharacter XP: " + this.xp +
        "\nCharacter HP: " + this.hp;
    }
}