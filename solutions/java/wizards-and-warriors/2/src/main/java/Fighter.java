class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()){
            return 10;
        }
        return 6;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    
}

class Wizard extends Fighter{
    private boolean isSpell = false;
    
    @Override
    public boolean isVulnerable(){
        if(!isSpell){
            return true;
        }
        return false;
    }


    public void prepareSpell(){
        this.isSpell = true;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter) {
        if(this.isSpell){
            return 12;
        }
        return 3;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}