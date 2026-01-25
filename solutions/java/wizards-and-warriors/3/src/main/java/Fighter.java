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
        return fighter.isVulnerable() ? 10 : 6;
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
        return !this.isSpell ? true : false;
    }


    public void prepareSpell(){
        this.isSpell = true;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter) {
        return this.isSpell ? 12 : 3;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}