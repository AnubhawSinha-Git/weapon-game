package weaponGame;

public class Gun extends Weapon{
	int noOfBullets=100;
	
	public void use() {
		System.out.println("Use the Gun");
		System.out.println("Load it and aim it");
		System.out.println("Now Fire at Enemy...");
		fire();
	}
	public void fire() {
		noOfBullets--;
	}
	

}
