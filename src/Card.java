public class Card {
    String name;
    int health;
    int attack;
    int armor;

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }

    public Card(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }
}
