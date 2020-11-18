public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip enemyShip = makeEnemyShip(typeOfShip);

        enemyShip.makeShip();
        // enemyShip.displayEnemyShip();
        // enemyShip.folloeHeroShip();
        // enemyShip.enemyShipShoots();

        return enemyShip;
    }
}