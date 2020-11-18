public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt);

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.print(theBoss);
    }
}