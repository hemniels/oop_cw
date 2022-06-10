abstract class Alien2{

	
	protected int health;   // 0=tot, 100=gesund
	protected String name;
	protected int damage;
	
	Alien2(){}
	
	Alien2(int health, String name, int damage){
		this.name = name;
		this.health = health;
		this.damage = damage;
	}

	abstract public void setDamage(int damage);
	abstract public int getDamage();

	
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

class crayonalien extends Alien2{
	crayonalien(){}

	crayonalien (int health , String name, int damage) {
		super(health, name, damage);
		setDamage(6);
	}

	public void setDamage(int damage){
		this.damage=damage;
	}

	public int getDamage(){
		return damage;
	}
}

class macraalien extends Alien2{
	macraalien(){}

	macraalien (int health , String name, int damage) {
		super(health, name, damage);
		setDamage(10);
	}
	public void setDamage(int damage){
		this.damage=damage;
	}
	public int getDamage(){
		return damage;
	}
}

class littlegreenmanalien extends Alien2{
	littlegreenmanalien(){}

	littlegreenmanalien (int health , String name, int damage) {
		super(health, name, damage);
		setDamage(1);
	}
	public void setDamage(int damage){
		this.damage=damage;
	}
	public int getDamage(){
		return damage;
	}
}


class AlienGang
{
    Alien2[] aliens;

    void AlienGang(int numAliens)
    {
	aliens = new Alien2[numAliens];
    }

    void addAlien(Alien2 newAlien, int index)
    {
	aliens[index] = newAlien;
    }

    Alien2[] getAliens()
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
