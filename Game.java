package weaponGame;
import java.util.Scanner;
public class Game {
	
	Game(){
		System.out.println("======GAme Has Started=====");
	}
	
	public  Weapon   selectWeapon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You got the Knife!!");
			Knife k=new Knife();
		return k;
		}
		else if(score<=800) {
			System.out.println("Press 1 for Knife or 2 for Gun!!");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have Selected Knife");
				Knife k=new Knife();
			return k;
			}else {
				System.out.println("You have selected Gun");
			return new Gun();
			}
		}
		else {
			System.out.println("Press 1=>Knife, 2==>Gun and 3==>bomb!!");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have Selected Knife");
			return new Knife();
			}
			else if(choice==2) {
				System.out.println("You have selected Gun");
			return new Gun();
			}
			else {
				System.out.println("You have selected Bomb");
			return new Bomb();
			}
		}
	}
	

}
