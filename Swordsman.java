package gamenovice;


public class Swordsman extends Novice {
    private int smPower;
    private String swSkill;

    public Swordsman(int hp,int exp,int power,String swSkill) {
        super(power);
        smPower = power;
    }
    public int getPower(){
        return smPower;
    }
}
