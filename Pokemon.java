public abstract class Pokemon {
    protected String name;
    protected String type;
    protected int maxhp;
    protected int maxmp;
    protected int hp;
    protected int exp;
    protected int mp;
    protected int dmg;
    protected int no;
    


    public Pokemon(String name){
        this.name = name;
        this.type ="NONE";
        this.hp=0;
        this.mp=0;
        this.exp=0;
        this.dmg=0;
        this.no = 0;
        assert hp <= maxhp;
        assert mp <= maxmp;
        assert hp>=0;
        assert mp >= 0;
    }

   /* public boolean damage(int value){
        int currentHP = hp-value;
        if(currentHP >=0 ){
             this.hp=currentHP;   
        }
        else{    
            this.hp = 0;   
        }
        return true;
    }
    ?*/


    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }

    public int getMP(){
        return mp;
    }

    public int getDMG(){
        return dmg;
    }
    public String toString(){
        return name;
    }

    public int getNo(){
        return no;
    }

    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getMaxhp(){
        return maxhp;
    }
    public String printSkill(String t){
        switch(t){
            case "FIRE" : return " 1.ATTACK         2.EMBER \n 3.Flamethrower   4.FireBlitz" ; 
                          
            case "WATER":return " 1.ATTACK         2.BUBBLE \n3.Dive           4.Bubble Beam";
                          
                          
            case "GLASS AND POISON":return " 1.ATTACK         2.LIFEDRAIN \n 3.Leaf Blade     4.POISON";
                                     
                                
            case "ELECTRIC": return " 1.ATTACK         2.THUNDER \n 3.ELECTRIC BALL  4.Volt Tackle";
                             
                             
            case "FLY":   return " 1.ATTACK         2.TORNADO \n3.FLY            4.ATKBUF";
                           
                          
            case "BUG": return " 1.ATTACK         2.Fury Cutter \n 3.DEFEND UP      4.LIFEDRAIN";
                        
            case "NORMAL" : return " 1.ATTACK         2.Double-Edge \n 3.Egg Bomb       4.BITE";
                           
                           
            case "GROUND" : return " 1.ATTACK         2.DIG \n 3.SANDSTORM      4.Earthquake";
                            
        }
        return type;
    }

    public String printinfo(Pokemon p){
        return "Name: "+p.getName()+"\n Type: "+p.getType()+"\n HP:"+p.getHP()+"\n MP: "+p.getMP()+"\n DMG:"+p.getDMG();
    }

    public void attack (Pokemon pokemon,Pokemon wildpokemon){
            wildpokemon.hp = wildpokemon.hp - pokemon.dmg;
            int random = (int )((Math.random()*2)+1);
            if(random == 1)
            pokemon.hp = pokemon.hp - wildpokemon.dmg;
            else
            pokemon.hp = pokemon.hp - wildpokemon.dmg*2;
    }
    public void skill (Pokemon pokemon,Pokemon wildpokemon){
            pokemon.mp -= 5;
            int ran = (int )((Math.random()*3)+1);
            wildpokemon.hp = wildpokemon.hp - pokemon.dmg*ran;
            int random = (int )((Math.random()*2)+1);
            if(random == 1)
            pokemon.hp = pokemon.hp - wildpokemon.dmg;
            else
            pokemon.hp = pokemon.hp - wildpokemon.dmg*2;
    }
}