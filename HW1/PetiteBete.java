public class PetiteBete{

	// instance variables
	protected int lvl;
	protected int atk;
	protected int spd;	
	protected int tol;
	protected String name;


	// constructor
	public PetiteBete(int lvl, int atk, int spd, int tol, String name) {
		this.lvl = lvl;
		this.atk = atk;
		this.spd = spd;
		this.tol = tol;
		this.name = name;
	}


	// default constructor for generic PetiteBete
	public PetiteBete() {
		this(1, 1, 1, 5, "Baby");
	}


	// queries
	public int getLvl() {
		return lvl;
	}
	public int getAtk() {
		return atk;
	}
	public int getSpd() {
		return spd;
	}
	public int getTol() {
		return tol;
	}
	public String getName() {
		return name;
	}


	// commands
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public void setTol(int tol) {
		this.tol = tol;
	}
	public void setName(String name) {
		this.name = name;
	}


	// determines damage amount to pass to other.getHit
	public void attack(PetiteBete other) {
		int damage = lvl * atk;
		other.getHit(damage);
	}


	// reduce health by damage amount
	public void getHit(int damage) {
		tol -= damage;

		// if negative damage, set to 0
		if (tol < 0){
			tol = 0;
		}
	}


	// group status
	public static void status(PetiteBete[] group){
		for (PetiteBete bete : group){
			System.out.println(bete.toString());
		}
	}


	/**
	 * Display state of PetiteBete.
	 * @return Returns a string containing PetiteBete's name, level, health, attack, and speed. 
	 */
	@Override
	public String toString() {
		String bete = "";
		bete += name + "'s stats: LEVEL " + lvl + " / ";
		bete += tol + " HEALTH / " + atk + " ATTACK / " + spd + " SPEED"; 
		return bete;
	}

}