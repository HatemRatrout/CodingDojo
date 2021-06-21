public class Wizard extends Human {
    
    public Wizard () 
    {
        super(3, 8, 3, 50);
    }
    public void heal(Human friend)
    {
        friend.increaseHealth(this.getIntelligence());
    }
    public void fireBall(Human enemy) {
        int amount = 3 * this.getIntelligence();
        enemy.decreaseHealth(amount);
    }
}