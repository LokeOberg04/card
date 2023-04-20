public class Game {
    public static void main(String[] args) {
        Alexandro player1 = new Alexandro();
        System.out.println(player1);
        Bruiser player2 = new Bruiser("alvin", 50, 50, 50, 50);
        System.out.println(player2);
        if (player2.getSpeed() > player1.getSpeed()) {
            System.out.println(player2.getName() + " goes first");
            player2.attack(player1);
        } else if (player2.getSpeed() < player1.getSpeed()) {
            System.out.println(player1.getName() + " goes first");
            player1.attack(player2);
        } else {
            int start = (int) (Math.random() * 2);
            if (start == 0) {
                System.out.println("The coin has decided that " + player1.getName() + " goes first");
                player1.attack(player2);
            } else {
                System.out.println("The coin has decided that " + player2.getName() + " goes first");
                player2.attack(player1);
            }
        }
        player1.attack(player1);
        player1.attack(player1);
        player1.attack(player1);
        player1.attack(player1);
        player1.attack(player1);
        System.out.println(player1);
        System.out.println(player2);
    }
}
