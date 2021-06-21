public class HumanTest {
    public static void main(String[] args) {
    System.out.println("== Human Testing ==");
    Human human1 = new Human();
    Human human2 = new Human();
    human1.displayHealth();
    human2.displayHealth();
    human1.attack(human2);
    human2.attack(human1);
    human2.attack(human1);
    human1.displayHealth();
    human2.displayHealth();

    System.out.println();
    System.out.println("== Wizrd Testing ==");
    Wizard wizard = new Wizard();
    Human human3 = new Human();
    human3.setHealth(100);
    wizard.fireBall(human3);
    human3.displayHealth();
    wizard.heal(human3);
    human3.displayHealth();

    System.out.println();
    System.out.println("== Ninja Testing ==");
    Ninja ninja = new Ninja();
    Human human4 = new Human();
    human4.setHealth(100);
    ninja.steal(human4);
    human4.displayHealth();
    ninja.displayHealth();
    ninja.runAway();
    ninja.displayHealth();
    System.out.println();
    System.out.println();
    System.out.println("== Samurai Testing ==");
    Samurai s1 = new Samurai();
    Samurai s2 = new Samurai();
    Samurai s3 = new Samurai();
    Human dum = new Human();
    s1.deathBlow(dum);
    dum.displayHealth();
    s1.displayHealth();
    s1.meditate();
    s1.displayHealth();
    s1.howMany();
    }
    
}