public class Card {
    String name;

    int speed;
    int health;
    int attack;
    int armor;

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public void attack(Card enemy) {
        if (this.getHealth()>0) {
            if (this.getAttack() > enemy.getArmor()) {
                int dmg = this.getAttack() - enemy.getArmor();
                System.out.println(this.getName() + " SMACKED THE SHIT OUT OF " + enemy.getName() + " FOR " + dmg + " dmg");
                enemy.setHealth(enemy.getHealth() - dmg);
            } else {
                System.out.println(this.getName() + " tried to smack " + enemy.getName() + " but he has too much armor :(");
            }
            if (enemy.getHealth() < 0) {
                enemy.setHealth(0);
            }
        } else {
            System.out.println(this.getName() + " is fucking dead, he cannot attack");
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }

    public Card(String name, int health, int attack, int armor, int speed) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
        this.speed = speed;
    }
}
