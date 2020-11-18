import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {

        EnemyShipFactory shipfactory = new EnemyShipFactory();

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.print("What type of ship? (U / R / B)? ");
        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        doStuffEnemy(shipfactory.makeEnemyShip(enemyShipOption));
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.shootEnemyShip();
    }
}
