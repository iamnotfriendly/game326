package gamenovice;

public class item {
    private String name;
    private int power;
    private int hp;
    private int exp;
    private int attack;

public item(int num){

    if(num == 1){
        this.medKit();
    }
    else if(num == 2){
        this.energyDrink();
    }
    else if(num == 3){
        this.painKiller();
    }
}

public void medKit(){
    this.name = "medkit";
    this.hp = 70;
    this.attack = 40;
}
public void energyDrink(){
    this.name = "Energy Drink";
    this.exp = 25;
    this.power = 25;
}
public void painKiller(){
    this.name = "Painkiller";
    this.exp = 50;
    this.power = 50;
}
public String getName(){
    return this.name;
}
}   
