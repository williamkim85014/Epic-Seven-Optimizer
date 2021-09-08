import java.util.ArrayList;

public class Equipment{
	private int pattack;
	private int attack;
	private int phealth;
	private int health;
	private int pdefense;
	private int defense;
	private int speed;
	private int pcrit;
	private int dcrit;
	private int eff;
	private int res;
	private int id;
	int setCritical = 0;
	int setHit = 0;
	int setSpeed = 0;
	int setAttack = 0;
	int setHealth = 0;
	int setDefense = 0;
	int setResist = 0;
	int setDestruction = 0;
	int setLifesteal = 0;
	int setCounter = 0;
	int setUnity = 0;
	int setImmunity = 0;
	int setRage = 0;
	int setRevenge = 0;
	int setInjury = 0;
	int setPenetration = 0;

	public int getPattack() {
		return pattack;
	}

	public int getAttack() {
		return attack;
	}

	public int getPhealth() {
		return phealth;
	}

	public int getHealth() {
		return health;
	}

	public int getPdefense() {
		return pdefense;
	}

	public int getDefense() {
		return defense;
	}

	public int getSpeed() {
		return speed;
	}

	public int getPcrit() {
		return pcrit;
	}

	public int getDcrit() {
		return dcrit;
	}

	public int getEff() {
		return eff;
	}

	public int getRes() {
		return res;
	}

	public Equipment() {

	}

	public int getSetCritical() {
		return setCritical;
	}

	public int getSetHit() {
		return setHit;
	}

	public int getSetSpeed() {
		return setSpeed;
	}

	public int getSetAttack() {
		return setAttack;
	}

	public int getSetHealth() {
		return setHealth;
	}

	public int getSetDefense() {
		return setDefense;
	}

	public int getSetResist() {
		return setResist;
	}

	public int getSetDestruction() {
		return setDestruction;
	}

	public int getSetLifesteal() {
		return setLifesteal;
	}

	public int getSetCounter() {
		return setCounter;
	}

	public int getSetUnity() {
		return setUnity;
	}

	public int getSetImmunity() {
		return setImmunity;
	}

	public int getSetRage() {
		return setRage;
	}

	public int getSetRevenge() {
		return setRevenge;
	}

	public int getSetInjury() {
		return setInjury;
	}

	public int getSetPenetration() {
		return setPenetration;
	}

	public void setSetCritical(int setCritical) {
		this.setCritical = setCritical;
	}

	public void setSetHit(int setHit) {
		this.setHit = setHit;
	}

	public void setSetSpeed(int setSpeed) {
		this.setSpeed = setSpeed;
	}

	public void setSetAttack(int setAttack) {
		this.setAttack = setAttack;
	}

	public void setSetHealth(int setHealth) {
		this.setHealth = setHealth;
	}

	public void setSetDefense(int setDefense) {
		this.setDefense = setDefense;
	}

	public void setSetResist(int setResist) {
		this.setResist = setResist;
	}

	public void setSetDestruction(int setDestruction) {
		this.setDestruction = setDestruction;
	}

	public void setSetLifesteal(int setLifesteal) {
		this.setLifesteal = setLifesteal;
	}

	public void setSetCounter(int setCounter) {
		this.setCounter = setCounter;
	}

	public void setSetUnity(int setUnity) {
		this.setUnity = setUnity;
	}

	public void setSetImmunity(int setImmunity) {
		this.setImmunity = setImmunity;
	}

	public void setSetRage(int setRage) {
		this.setRage = setRage;
	}

	public void setSetRevenge(int setRevenge) {
		this.setRevenge = setRevenge;
	}

	public void setSetInjury(int setInjury) {
		this.setInjury = setInjury;
	}

	public void setSetPenetration(int setPenetration) {
		this.setPenetration = setPenetration;
	}

	public void setPattack(int pattack) {
		this.pattack = pattack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setPhealth(int phealth) {
		this.phealth = phealth;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setPdefense(int pdefense) {
		this.pdefense = pdefense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setPcrit(int pcrit) {
		this.pcrit = pcrit;
	}

	public void setDcrit(int dcrit) {
		this.dcrit = dcrit;
	}

	public void setEff(int eff) {
		this.eff = eff;
	}

	public void setRes(int res) {
		this.res = res;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static ArrayList<Equipment> getWeapons(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getWeapons();
		ArrayList<Equipment> weapons = new ArrayList<Equipment>();	
		int weaponId = 0;

		for (Inventory equipment : equipments) {
			weaponId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if(specific) {
				if (build.contains("Attack")) {
					if (missingStat(equipment, "pattack", 0)) {
						continue;
					}	

				}
				if (build.contains("Health")) {
					if (missingStat(equipment, "health", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			weapons.add(addEquipment(equipment, weaponId));
		}
		return weapons;
	}

	public static ArrayList<Equipment> getHelmets(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getHelmets();
		ArrayList<Equipment> helmets = new ArrayList<Equipment>();	
		int helmetId = 0;		
		for (Inventory equipment : equipments) {
			helmetId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if (specific) {
				if (build.contains("Attack")) {
					if (missingStat(equipment, "attack", 0)) {
						continue;
					}	
				}
				if (build.contains("Health")) {
					if (missingStat(equipment, "phealth", 0)) {
						continue;
					}	

				}
				if (build.contains("Defense")) {
					if (missingStat(equipment, "defense", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			helmets.add(addEquipment(equipment, helmetId));
		}
		return helmets;
	}

	public static ArrayList<Equipment> getArmors(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getArmors();
		ArrayList<Equipment> armors = new ArrayList<Equipment>();	
		int armorId = 0;		
		for (Inventory equipment : equipments) {
			armorId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if(specific) {
				if (build.contains("Health")) {
					if (missingStat(equipment, "health", 0)) {
						continue;
					}	

				}
				if (build.contains("Defense")) {
					if (missingStat(equipment, "pdefense", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			armors.add(addEquipment(equipment, armorId));
		}
		return armors;
	}

	public static ArrayList<Equipment> getNecklaces(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getNecklaces();
		ArrayList<Equipment> necklaces = new ArrayList<Equipment>();	
		int necklaceId = 0;		
		for (Inventory equipment : equipments) {
			necklaceId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if (specific) {
				if (build.contains("Attack")) {
					if (missingStat(equipment, "attack", 0)) {
						continue;
					}	
				}
				if (build.contains("Health")) {
					if (missingStat(equipment, "health", 0)) {
						continue;
					}	

				}
				if (build.contains("Defense")) {
					if (missingStat(equipment, "defense", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			necklaces.add(addEquipment(equipment, necklaceId));
		}
		return necklaces;
	}

	public static ArrayList<Equipment> getRings(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getRings();
		ArrayList<Equipment> rings = new ArrayList<Equipment>();	
		int ringId = 0;		
		for (Inventory equipment : equipments) {
			ringId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if (specific) {
				if (build.contains("Attack")) {
					if (missingStat(equipment, "attack", 0)) {
						continue;
					}	
				}
				if (build.contains("Health")) {
					if (missingStat(equipment, "health", 0)) {
						continue;
					}	

				}
				if (build.contains("Defense")) {
					if (missingStat(equipment, "defense", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			rings.add(addEquipment(equipment, ringId));
		}
		return rings;
	}

	public static ArrayList<Equipment> getBoots(String build, boolean specific){
		ArrayList<Inventory> equipments = Inventory.getBoots();
		ArrayList<Equipment> boots = new ArrayList<Equipment>();	
		int bootId = 0;		
		for (Inventory equipment : equipments) {
			bootId++;
			if (equipment.getEquiped() != null) {
				continue;
			}
			if (specific) {
				if (build.contains("Attack")) {
					if (missingStat(equipment, "attack", 0)) {
						continue;
					}	
				}
				if (build.contains("Health")) {
					if (missingStat(equipment, "health", 0)) {
						continue;
					}	

				}
				if (build.contains("Defense")) {
					if (missingStat(equipment, "defense", 0)) {
						continue;
					}	

				}
				if (build.contains("Speed")) {
					if (missingStat(equipment, "speed", 0)) {
						continue;
					}	

				}
				if (build.contains("Crit")) {
					if (missingStat(equipment, "crit", 0)) {
						continue;
					}	

				}			
				if (build.contains("Eff")) {
					if (missingStat(equipment, "eff", 0)) {
						continue;
					}	

				}
				if (build.contains("Res")) {
					if (missingStat(equipment, "res", 0)) {
						continue;
					}				
				}
			}
			boots.add(addEquipment(equipment, bootId));
		}
		return boots;
	}

	public static void addStat(Equipment equipment, String stat, int value) {
		switch (stat) {
		case "attack":
			equipment.setAttack(value);
			break;
		case "pattack":
			equipment.setPattack(value);
			break;
		case "defense":
			equipment.setDefense(value);
			break;
		case "pdefense":
			equipment.setPdefense(value);
			break;
		case "health":
			equipment.setHealth(value);
			break;
		case "phealth":
			equipment.setPhealth(value);
			break;
		case "speed":
			equipment.setSpeed(value);
			break;
		case "pcrit":
			equipment.setPcrit(value);
			break;
		case "dcrit":
			equipment.setDcrit(value);
			break;
		case "eff":
			equipment.setEff(value);
			break;
		case "res":
			equipment.setRes(value);
			break;
		default:
		}
	}

	public static void addSet(Equipment equipment, String set){
		switch (set) {
		case "critical":
			equipment.setSetCritical(1);
			break;
		case "hit":
			equipment.setSetHit(1);
			break;
		case "speed":
			equipment.setSetSpeed(1);
			break;
		case "attack":
			equipment.setSetAttack(1);
			break;
		case "health":
			equipment.setSetHealth(1);
			break;
		case "defense":
			equipment.setSetDefense(1);
			break;
		case "resist":
			equipment.setSetResist(1);
			break;
		case "destruction":
			equipment.setSetDestruction(1);
			break;
		case "lifesteal":
			equipment.setSetLifesteal(1);
			break;
		case "counter":
			equipment.setSetCounter(1);
			break;
		case "unity":
			equipment.setSetUnity(1);
			break;
		case "immunity":
			equipment.setSetImmunity(1);
			break;
		case "rage":
			equipment.setSetRage(1);
			break;
		case "revenge":
			equipment.setSetRevenge(1);
			break;
		case "injury":
			equipment.setSetInjury(1);
			break;
		case "penetration":
			equipment.setSetPenetration(1);
			break;
		default:
		}
	}

	public static boolean missingStat(Inventory equipment, String stat, int value) {
		if (equipment.getMain().contains(stat)) {
			if (equipment.getStatMain() > value) {
				return false;
			}
		}
		if (equipment.getSub1().contains(stat)) {
			if (equipment.getStat1() > value) {
				return false;
			}
		}
		if (equipment.getSub2().contains(stat)) {
			if (equipment.getStat2() > value) {
				return false;
			}
		}
		if (equipment.getSub3().contains(stat)) {
			if (equipment.getStat3() > value) {
				return false;
			}
		}
		if (equipment.getSub4().contains(stat)) {
			if (equipment.getStat4() > value) {
				return false;
			}
		}
		return true;
	}

	public static Equipment addEquipment(Inventory Inventory, int id) {
		Equipment equipment = new Equipment();
		equipment.setId(id);
		addStat(equipment, Inventory.getMain(), Inventory.getStatMain());
		addStat(equipment, Inventory.getSub1(), Inventory.getStat1());
		addStat(equipment, Inventory.getSub2(), Inventory.getStat2());
		addStat(equipment, Inventory.getSub3(), Inventory.getStat3());
		addStat(equipment, Inventory.getSub4(), Inventory.getStat4());
		addSet(equipment, Inventory.getSet());
		return equipment;
	}


}