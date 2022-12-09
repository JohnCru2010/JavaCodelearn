package AbstractClass2;

public class Warrior extends Player{
    protected int CP;
    protected int DP;
    private static final int BaseCP = 1;
    private static final int BaseDP = 1;
    public Warrior(String playerName, String characterName){
        super(playerName,characterName);
        this.CP = BaseCP;
        this.DP = BaseDP;
    }
    public Warrior(String playerName, String characterName, int level, int hp, int xp, int CP, int DP){
        super(playerName, characterName, level, hp, xp);
        this.CP = CP;
        this.DP = DP;
    }
    
    public int getCP() {
        return CP;
    }
    public void setCP(int CP) {
        this.CP = CP;
    }
    public int getDP() {
        return DP;
    }
    public void setDP(int DP) {
        this.DP = DP;
    }

    public void gainXP(int value){
       super.xp += value;
       if(super.level * super.xp > super.level * 1000 * (super.level/4)){
            super.level += 1;
            super.hp += 10;
            this.CP += 1;
            this.DP += 1;
       } 
    }

    public boolean attack(int enemyDP){
        if(CP >= 2 * enemyDP){
            System.out.println("Attack succeeded");
            return true;
        } else {
            System.out.println("Attack failed");
            return false;
        }
    }

    public String toString (String s){
        return super.toString("") +
        "\nCharacter type: Warrior" +
        "\nCombat Power: " + this.CP +
        "\nCombat Defense: " + this.DP;
    }
}