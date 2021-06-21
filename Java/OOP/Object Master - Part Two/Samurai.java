public class Samurai extends Human {

    private static int counter = 0;

    public Samurai() 
    {
        super(3, 3, 3, 200);
        counter++;
    }
    public void deathBlow(Human enemy) 
    {
        enemy.setHealth(0);
        this.decreaseHealth(this.getHealth() / 2);
    }
    public void meditate() 
    {
        this.setHealth( (int) (1.5 * getHealth()) );
    }
    public void howMany()
    {
        System.out.println(String.format("There are %d samurai's", counter));
    }
    @Override
    public void displayHealth() {
        System.out.println("Health: " + this.getHealth() + "/" + 200);
    }
    
}