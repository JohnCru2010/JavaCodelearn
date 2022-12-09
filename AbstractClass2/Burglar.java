package AbstractClass2;

public class Burglar extends Player{
    protected int AP;    
    private static final int BaseAP = 1;
    public Burglar(String playerName, String characterName){
        super(playerName,characterName);
        this.AP = BaseAP;
    }
    public Burglar(String playerName, String characterName, int level, int hp, int xp, int AP){
        super(playerName, characterName, level, hp, xp);
        this.AP = AP;
    }
    
    public int getAP() {
        return AP;
    }
    public void setAP(int AP) {
        this.AP = AP;
    }
    

    public void gainXP(int value){
       super.xp += value;
       if(super.level * super.xp > super.level * 1000){
            super.level += 1;
            super.hp += 8;
            this.AP += 1;            
       } 
    }

    public boolean disableTrap(int trapDifficulty){
        if(super.level * AP > trapDifficulty){
            System.out.println("Trap disabled");
            return true;
        } else {
            System.out.println("Trap activated");
            super.hp -=10;
            return false;
        }
    }

    public String toString (String s){
        return super.toString("") +
        "\nCharacter type: Burglar" +
        "\nAgility Power: " + this.AP;
    }
}