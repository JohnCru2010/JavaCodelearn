package AbstractClass2;


public class Wizard extends Player{
    protected int MP;
    protected int MPoints;
    protected int availableMPoints;
    private static final int BaseMP = 1;
    private static final int BaseMPoints = 10;
    public Wizard(String playerName, String characterName){
        super(playerName,characterName);
        this.MP = BaseMP;
        this.MPoints = BaseMPoints;
        this.availableMPoints = BaseMPoints;
    }
    public Wizard(String playerName, String characterName, int level, int hp, int xp, int MP, int MPoints){
        super(playerName, characterName, level, hp, xp);
        this.MP = MP;
        this.MPoints = MPoints;
    }
    
    public int getMP() {
        return MP;
    }
    public void setMP(int MP) {
        this.MP = MP;
    }
    public int getMPoints() {
        return MPoints;
    }
    public void setMPoints(int MPoints) {
        this.MPoints = MPoints;
    }
    public int getAvailableMPoints() {
        return availableMPoints;
    }
    public void setAvailableMPoints(int availableMPoints) {
        this.availableMPoints = availableMPoints;
    }
    

    public void gainXP(int value){
       super.xp += value;
       if(super.level * super.xp > super.level * 1000 * (super.level/2)){
            super.level += 1;
            MP += 1;
            MPoints += 5;
            super.hp += 5;
            availableMPoints = MPoints;
       } 
    }

    public boolean castSpell(int spellDifficulty, int spellCost){
        if(availableMPoints >= spellCost){
            availableMPoints -= spellCost;
            if(MP >= 2 * spellDifficulty){
                System.out.println("Spell casting succeeded");
                return true;
            } else {
                System.out.println("Spell casting failed");
                return false;
            }   
        } else {
            System.out.println("Not enough magical energy");
            return false;
        }
    }

    public void rest(int time){
        System.out.println("Resting");
        if(time < 12){
            if((availableMPoints + MPoints/2) <= MPoints){
                availableMPoints += MPoints/2;
            } else {
                availableMPoints = MPoints;
            }

        } else if (time >= 12){
            availableMPoints = MPoints;
        }
    }

    public String toString (String s){
        return super.toString("") +
        "\nCharacter type: Wizard" +
        "\nMagical Power: " + this.MP +
        "\nMaximum Magical Points: " + this.MPoints +
        "\nAvailable Magical Points: " + this.availableMPoints;
    }
}