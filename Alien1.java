/* final version */

public class Alien1{

	
	private int health;   // 0=tot, 100=gesund
	private String name;
	private int damage;

	Alien1(int health, String name, int damage){
	this.health = health;
	this.name = name;
	this.damage = damage;
	}
	
	public int getHealth(){
	return health;
	}
	public String getName(){
	return name;
	}
	public int getDamage(){
	return damage;
	}

	public void setHealth(int health){
	this.health = health;
	}
	public void setName(String name){
	this.name = name;
	}
	public void setDamage(int damage){
	this.damage = damage;
	}
	
		public static void main(String[] args){

		crayonalien i = new crayonalien(100,"Bobby",3);
		macraalien j = new macraalien(100,"Flaty",1);
		crayonalien k = new crayonalien(50,"Jeff",3);
		
		AlienGang a = new AlienGang();
		a.AlienGang(3);
		a.addAlien(i,0);
		a.addAlien(j,1);
		a.addAlien(k,2);

		int b = a.calculateDamage();
		System.out.println("DMG DONE BY GANG IS " + b);
	}
}

class crayonalien extends Alien1{
	crayonalien (int health , String name, int damage) {
		super(health, name, damage);
		setDamage(6);
	}
}

class macraalien extends Alien1{
	macraalien (int health, String name, int damage) {
		super(health, name, damage);
		setDamage(10);
	}
}

class littlegreenmanalien extends Alien1{
	littlegreenmanalien (int health, String name, int damage) {
		super(health,name, damage);
		setDamage(1);
	}
}


class AlienGang
{
    Alien1[] aliens;

    void AlienGang(int numAliens)
    {
	aliens = new Alien1[numAliens];
    }

    void addAlien(Alien1 newAlien, int index)
    {
	aliens[index] = newAlien;
    }

    Alien1[] getAliens()
    {
	return aliens;
    }

    int calculateDamage()
    {
	int damage = 0;
	for (int i=0; i < aliens.length; i++)
	    {
		damage = aliens[i].getDamage()+damage;
	}
	return damage;
    }
}
