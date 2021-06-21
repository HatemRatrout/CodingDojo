public class Human {
    int strength;
    int stealth;
    int intelligence;
    int health;
    public Human () 
    {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }
    public Human (int strength, int stealth, int intelligence, int health) 
    {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }
    public int getStrength () 
    {
        return this.strength;
    }

    public void setStealth(int stealth)
    {
        this.stealth = stealth;
    }
    public int getStealth () 
    {
        return this.stealth;
    }

    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }
    public int getIntelligence () 
    {
        return this.intelligence;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getHealth () 
    {
        return this.health;
    }

    public void attack(Human human) 
    {
        human.setHealth(human.getHealth() - this.strength);
    }

    public void displayHealth() 
    {
        System.out.println("Health: " + this.health + "/" + 100);
    }

    public void increaseHealth(int amount) {
        this.health += amount;
    }
    public void decreaseHealth(int amount) {
        this.health -= amount;
    }
}