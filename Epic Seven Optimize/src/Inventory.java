import java.util.ArrayList;

public class Inventory {
	private String set;
	private String main;
	private int statMain;
	private String sub1;
	private int stat1;
	private String sub2;
	private int stat2;
	private String sub3;
	private int stat3;
	private String sub4;
	private int stat4;
	private String equiped = null;

	public Inventory(String set, String main, int statMain, String sub1, int stat1, String sub2, int stat2, String sub3,
			int stat3, String sub4, int stat4) {
		super();
		this.set = set;
		this.main = main;
		this.statMain = statMain;
		this.sub1 = sub1;
		this.stat1 = stat1;
		this.sub2 = sub2;
		this.stat2 = stat2;
		this.sub3 = sub3;
		this.stat3 = stat3;
		this.sub4 = sub4;
		this.stat4 = stat4;
	}

	public Inventory(String set, String main, int statMain, String sub1, int stat1, String sub2, int stat2, String sub3,
			int stat3, String sub4, int stat4, String equiped) {
		super();
		this.set = set;
		this.main = main;
		this.statMain = statMain;
		this.sub1 = sub1;
		this.stat1 = stat1;
		this.sub2 = sub2;
		this.stat2 = stat2;
		this.sub3 = sub3;
		this.stat3 = stat3;
		this.sub4 = sub4;
		this.stat4 = stat4;
		this.equiped = equiped;
	}
	
	public String getSet() {
		return this.set;
	}

	public String getMain() {
		return main;
	}

	public int getStatMain() {
		return statMain;
	}

	public String getSub1() {
		return sub1;
	}

	public int getStat1() {
		return stat1;
	}

	public String getSub2() {
		return sub2;
	}

	public int getStat2() {
		return stat2;
	}

	public String getSub3() {
		return sub3;
	}

	public int getStat3() {
		return stat3;
	}

	public String getSub4() {
		return sub4;
	}

	public int getStat4() {
		return stat4;
	}	
		
	public String getEquiped() {
//		return equiped;
		return null;
	}
	
	public static ArrayList<Inventory> getWeapons(){
		ArrayList<Inventory> weapons = new ArrayList<Inventory>();
		weapons.add(new Inventory("attack","attack",475,"phealth",26,"pattack",7,"pcrit",11,"dcrit",6));
		weapons.add(new Inventory("destruction","attack",475,"pattack",10,"speed",8,"pcrit",15,"dcrit",6));
		weapons.add(new Inventory("rage","attack",440,"pattack",11,"speed",5,"pcrit",12,"dcrit",5));
		weapons.add(new Inventory("lifesteal","attack",515,"phealth",18,"pattack",18,"speed",8,"pcrit",16));
		weapons.add(new Inventory("lifesteal","attack",500,"phealth",22,"pattack",13,"speed",4,"pcrit",8));
		weapons.add(new Inventory("lifesteal","attack",440,"phealth",5,"pattack",19,"speed",8,"pcrit",5));
		weapons.add(new Inventory("lifesteal","attack",330,"phealth",10,"pattack",4,"speed",8,"pcrit",6));
		weapons.add(new Inventory("destruction","attack",475,"pattack",6,"pcrit",8,"dcrit",23,"phealth",14));
		weapons.add(new Inventory("destruction","attack",500,"phealth",16,"pattack",19,"pcrit",4,"dcrit",10));
		weapons.add(new Inventory("health","attack",290,"health",218,"phealth",16,"pattack",4,"pcrit",6));
		weapons.add(new Inventory("attack","attack",210,"pattack",13,"speed",4,"pcrit",5,"eff",9));
		weapons.add(new Inventory("attack","attack",440,"pattack",24,"speed",4,"pcrit",4,"eff",18));
		weapons.add(new Inventory("destruction","attack",330,"pattack",10,"speed",7,"pcrit",7,"eff",10));
		weapons.add(new Inventory("destruction","attack",440,"pattack",18,"pcrit",7,"dcrit",15,"eff",7));
		weapons.add(new Inventory("attack","attack",440,"phealth",16,"pattack",21,"speed",6,"pcrit",4));
		weapons.add(new Inventory("attack","attack",440,"phealth",12,"pattack",12,"speed",7,"pcrit",6));
		weapons.add(new Inventory("speed","attack",465,"pattack",17,"speed",9,"pcrit",4,"eff",12,"Falconer Kluri"));
		weapons.add(new Inventory("health","attack",465,"phealth",7,"speed",13,"pcrit",4,"res",11));
		weapons.add(new Inventory("health","attack",465,"phealth",11,"speed",4,"pcrit",16,"res",13));
		weapons.add(new Inventory("attack","attack",465,"phealth",7,"pattack",13,"speed",12,"pcrit",14));
		weapons.add(new Inventory("attack","attack",465,"phealth",19,"pattack",15,"speed",6,"pcrit",8));
		weapons.add(new Inventory("speed","attack",440,"phealth",11,"pattack",13,"speed",5,"pcrit",9));
		weapons.add(new Inventory("hit","attack",515,"phealth",21,"speed",11,"pcrit",5,"eff",15));
		weapons.add(new Inventory("speed","attack",515,"phealth",17,"pattack",17,"speed",9,"pcrit",15));
		weapons.add(new Inventory("speed","attack",515,"phealth",14,"pattack",16,"speed",5,"pcrit",20));
		weapons.add(new Inventory("speed","attack",515,"phealth",16,"pattack",17,"speed",9,"pcrit",16));
		weapons.add(new Inventory("speed","attack",515,"phealth",15,"pattack",25,"speed",5,"pcrit",14));
		weapons.add(new Inventory("speed","attack",515,"phealth",18,"pattack",9,"speed",20,"pcrit",6,"Faithless Lidica"));
		weapons.add(new Inventory("speed","attack",515,"phealth",15,"pattack",33,"speed",5,"pcrit",10,"Kayron"));
		weapons.add(new Inventory("speed","attack",515,"phealth",38,"pattack",9,"speed",5,"pcrit",12));
		weapons.add(new Inventory("speed","attack",515,"phealth",32,"pattack",14,"speed",5,"pcrit",12));
		weapons.add(new Inventory("speed","attack",515,"phealth",17,"pattack",32,"speed",5,"pcrit",10));
		weapons.add(new Inventory("speed","attack",515,"phealth",14,"pattack",29,"speed",8,"pcrit",6));
		weapons.add(new Inventory("speed","attack",515,"phealth",16,"pattack",9,"speed",9,"pcrit",18));
		weapons.add(new Inventory("speed","attack",515,"phealth",18,"pattack",22,"speed",9,"pcrit",12));
		weapons.add(new Inventory("speed","attack",515,"phealth",9,"pattack",18,"speed",9,"pcrit",21,"Arbiter Vildred"));
		weapons.add(new Inventory("speed","attack",515,"phealth",17,"pattack",24,"speed",5,"pcrit",15));
		weapons.add(new Inventory("unity","attack",515,"eff",6,"speed",14,"dcrit",7,"pcrit",14,"Iseria"));
		weapons.add(new Inventory("rage","attack",515,"pattack",22,"dcrit",18,"speed",3,"health",399));
		weapons.add(new Inventory("health","attack",515,"phealth",9,"health",594,"res",13,"pcrit",12));
		weapons.add(new Inventory("health","attack",515,"dcrit",12,"pcrit",12,"health",638,"speed",6));
		weapons.add(new Inventory("health","attack",515,"dcrit",12,"phealth",20,"pcrit",7,"pattack",15));
		weapons.add(new Inventory("health","attack",515,"pcrit",10,"health",368,"speed",4,"phealth",24));
		weapons.add(new Inventory("health","attack",515,"phealth",19,"pcrit",3,"speed",7,"eff",20));
		weapons.add(new Inventory("health","attack",515,"eff",22,"pattack",17,"health",446,"speed",7));
		weapons.add(new Inventory("rage","attack",425,"phealth",31,"pattack",11,"pcrit",4,"dcrit",6));
		weapons.add(new Inventory("unity","attack",425,"phealth",18,"speed",2,"pattack",16,"dcrit",8));
		weapons.add(new Inventory("unity","attack",425,"eff",21,"speed",4,"pattack",6,"phealth",12));
		weapons.add(new Inventory("unity","attack",425,"speed",5,"dcrit",21,"phealth",7,"pattack",9));
		weapons.add(new Inventory("health","attack",475,"phealth",7,"speed",10,"pcrit",13,"res",12));
		weapons.add(new Inventory("speed","attack",525,"dcrit",17,"pattack",28,"pcrit",5,"speed",8,"Challenger Dominiel"));
		weapons.add(new Inventory("speed","attack",525,"speed",7,"phealth",7,"dcrit",18,"pattack",18,"Specter Tenebria"));
		weapons.add(new Inventory("speed","attack",525,"speed",8,"pcrit",25,"phealth",5,"dcrit",7));
		weapons.add(new Inventory("critical","attack",525,"health",460,"pcrit",6,"dcrit",27,"pattack",16,"Judge Kise"));
		weapons.add(new Inventory("speed","attack",525,"health",478,"res",12,"phealth",15,"speed",11));
		weapons.add(new Inventory("critical","attack",525,"speed",15,"pcrit",9,"eff",9,"dcrit",14,"Cerise"));
		weapons.add(new Inventory("hit","attack",500,"dcrit",6,"res",10,"pattack",32,"speed",4));
		weapons.add(new Inventory("critical","attack",500,"dcrit",14,"health",527,"phealth",19,"speed",4));
		weapons.add(new Inventory("speed","attack",500,"eff",11,"phealth",21,"speed",5,"res",13));
		weapons.add(new Inventory("speed","attack",500,"res",24,"speed",3,"pcrit",8,"phealth",14));
		weapons.add(new Inventory("speed","attack",440,"pcrit",10,"phealth",10,"speed",6,"pattack",11));
		weapons.add(new Inventory("unity","attack",500,"pattack",23,"dcrit",11,"health",157,"phealth",10));
		weapons.add(new Inventory("immunity","attack",440,"health",317,"speed",5,"res",12,"phealth",16));
		weapons.add(new Inventory("health","attack",525,"pattack",16,"health",440,"dcrit",21,"pcrit",8));
		weapons.add(new Inventory("counter","attack",525,"phealth",20,"dcrit",7,"speed",13,"pcrit",10,"Elena"));
		weapons.add(new Inventory("counter","attack",500,"phealth",13,"dcrit",12,"res",12,"pattack",21));
		weapons.add(new Inventory("counter","attack",500,"pcrit",3,"phealth",11,"pattack",20,"speed",7));
		weapons.add(new Inventory("speed","attack",525,"health",734,"dcrit",13,"speed",12,"pcrit",5,"Lilias"));
		weapons.add(new Inventory("destruction","attack",500,"phealth",9,"dcrit",11,"health",366,"pcrit",14));
		weapons.add(new Inventory("hit","attack",515,"phealth",11,"speed",11,"res",17,"eff",6));
		weapons.add(new Inventory("speed","attack",515,"phealth",6,"pattack",6,"speed",15,"res",13,"Sinful Angelica"));
		weapons.add(new Inventory("attack","attack",515,"pattack",16,"speed",7,"pcrit",7,"res",11));
		weapons.add(new Inventory("health","attack",425,"phealth",19,"pattack",12,"pcrit",8,"res",5));
		weapons.add(new Inventory("immunity","attack",515,"phealth",24,"pattack",13,"speed",6,"res",6));
		weapons.add(new Inventory("destruction","attack",515,"pattack",22,"speed",8,"pcrit",10,"res",10));
		weapons.add(new Inventory("destruction","attack",475,"pattack",19,"phealth",17,"pcrit",7,"dcrit",6));
		weapons.add(new Inventory("immunity","attack",475,"phealth",28,"pattack",7,"pcrit",4,"dcrit",17));
		weapons.add(new Inventory("lifesteal","attack",440,"pattack",11,"pcrit",3,"dcrit",17,"speed",3));
		weapons.add(new Inventory("critical","attack",440,"pattack",5,"speed",8,"pcrit",9,"health",158));
		weapons.add(new Inventory("critical","attack",330,"phealth",18,"speed",4,"pcrit",3,"dcrit",3));
		weapons.add(new Inventory("hit","attack",525,"phealth",9,"speed",18,"eff",15,"dcrit",7,"Auxiliary Lots"));
		weapons.add(new Inventory("speed","attack",525,"dcrit",7,"pattack",25,"pcrit",12,"speed",2));
		weapons.add(new Inventory("speed","attack",525,"pcrit",18,"speed",7,"dcrit",8,"phealth",8));
		weapons.add(new Inventory("speed","attack",525,"pcrit",15,"dcrit",13,"speed",9,"res",6));
		weapons.add(new Inventory("speed","attack",500,"dcrit",18,"pcrit",8,"pattack",9,"res",6));
		weapons.add(new Inventory("critical","attack",500,"eff",6,"dcrit",16,"pattack",16,"health",179));
		weapons.add(new Inventory("hit","attack",500,"speed",11,"phealth",8,"pattack",13,"health",335));
		weapons.add(new Inventory("speed","attack",500,"dcrit",16,"pcrit",4,"speed",8,"eff",6));		
		weapons.add(new Inventory("speed","attack",500,"pcrit",15,"phealth",16,"speed",4,"res",6));
		weapons.add(new Inventory("speed","attack",440,"dcrit",11,"speed",2,"pattack",19,"health",163));
		weapons.add(new Inventory("speed","attack",240,"pattack",9,"eff",7,"phealth",10,"dcrit",8));
		weapons.add(new Inventory("rage","attack",500,"pcrit",18,"speed",4,"phealth",7,"eff",14));
		weapons.add(new Inventory("rage","attack",500,"pattack",6,"speed",8,"dcrit",14,"eff",11));
		weapons.add(new Inventory("immunity","attack",500,"speed",10,"phealth",15,"res",7,"pattack",4));
		weapons.add(new Inventory("attack","attack",500,"pcrit",9,"pattack",14,"res",12,"phealth",4));
		weapons.add(new Inventory("lifesteal","attack",500,"res",10,"dcrit",13,"speed",10,"pattack",4));
		weapons.add(new Inventory("resist","attack",500,"dcrit",8,"pcrit",6,"phealth",19,"eff",7));
		weapons.add(new Inventory("resist","attack",500,"pattack",13,"dcrit",22,"phealth",8,"pcrit",5));
		weapons.add(new Inventory("destruction","attack",500,"phealth",17,"pcrit",3,"pattack",19,"res",8));
		weapons.add(new Inventory("hit","attack",500,"dcrit",11,"speed",11,"eff",6,"health",180));
		return weapons;
	}

	{
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public static ArrayList<Inventory> getHelmets(){
		ArrayList<Inventory> helmets = new ArrayList<Inventory>();
		helmets.add(new Inventory("resist","health",2565,"phealth",12,"pdefense",11,"speed",4,"res",24));
		helmets.add(new Inventory("destruction","health",2565,"phealth",6,"pattack",22,"pdefense",10,"speed",7));
		helmets.add(new Inventory("speed","health",2360,"phealth",6,"pattack",19,"pdefense",12,"speed",5));
		helmets.add(new Inventory("lifesteal","health",2765,"phealth",17,"pattack",18,"speed",5,"pcrit",18));
		helmets.add(new Inventory("lifesteal","health",2700,"phealth",23,"pattack",7,"speed",7,"pcrit",7));
		helmets.add(new Inventory("lifesteal","health",2360,"phealth",12,"pattack",14,"speed",2,"pcrit",12));
		helmets.add(new Inventory("lifesteal","health",1760,"phealth",18,"pattack",6,"speed",2,"pcrit",7));
		helmets.add(new Inventory("destruction","health",2565,"pattack",14,"pcrit",12,"dcrit",19,"phealth",6));
		helmets.add(new Inventory("health","health",2125,"phealth",13,"pdefense",14,"pcrit",8,"res",9));
		helmets.add(new Inventory("attack","health",1565,"attack",21,"pattack",18,"pcrit",5,"eff",9));
		helmets.add(new Inventory("attack","health",2360,"pattack",26,"speed",7,"pcrit",6,"dcrit",6));
		helmets.add(new Inventory("destruction","health",1760,"pattack",9,"pcrit",7,"dcrit",13,"eff",11));
		helmets.add(new Inventory("destruction","health",2360,"phealth",12,"speed",6,"pcrit",4,"res",22));
		helmets.add(new Inventory("attack","health",2360,"phealth",11,"pattack",19,"speed",7,"pcrit",8));
		helmets.add(new Inventory("attack","health",2360,"phealth",6,"pattack",10,"pcrit",9,"eff",16));
		helmets.add(new Inventory("health","health",2495,"phealth",19,"pdefense",12,"speed",6,"res",14));
		helmets.add(new Inventory("health","health",2495,"phealth",24,"pdefense",7,"speed",10,"res",7));
		helmets.add(new Inventory("attack","health",2495,"phealth",22,"pattack",11,"speed",8,"pcrit",7));
		helmets.add(new Inventory("attack","health",2495,"phealth",7,"pattack",18,"speed",6,"pcrit",13));
		helmets.add(new Inventory("speed","health",2360,"phealth",11,"pattack",12,"speed",8,"pcrit",6));
		helmets.add(new Inventory("attack","health",2765,"phealth",23,"pattack",26,"dcrit",7,"eff",8));
		helmets.add(new Inventory("defense","health",2765,"attack",49,"dcrit",6,"phealth",29,"speed",11));
		helmets.add(new Inventory("defense","health",2765,"res",7,"speed",15,"phealth",6,"dcrit",20,"Lilias"));
		helmets.add(new Inventory("defense","health",2765,"pattack",24,"speed",4,"pcrit",8,"eff",17));
		helmets.add(new Inventory("defense","health",2765,"pattack",14,"dcrit",19,"eff",6,"res",16));
		helmets.add(new Inventory("defense","health",2765,"speed",7,"attack",47,"res",30,"pdefense",9));
		helmets.add(new Inventory("hit","health",2765,"speed",7,"pcrit",9,"pattack",12,"dcrit",17));
		helmets.add(new Inventory("counter","health",2765,"res",6,"defense",38,"speed",17,"pdefense",14,"Elena"));
		helmets.add(new Inventory("counter","health",2765,"attack",146,"pdefense",12,"dcrit",13,"pcrit",6));
		helmets.add(new Inventory("speed","health",2295,"pdefense",11,"speed",10,"pcrit",4,"eff",16,"Iseria"));
		helmets.add(new Inventory("immunity","health",2295,"phealth",10,"dcrit",5,"pattack",14,"defense",74));
		helmets.add(new Inventory("unity","health",2295,"speed",8,"attack",37,"pattack",16,"eff",11));
		helmets.add(new Inventory("health","health",2565,"pdefense",25,"phealth",14,"res",14,"speed",4));
		helmets.add(new Inventory("speed","health",2835,"speed",8,"dcrit",5,"pcrit",17,"attack",142,"Specter Tenebria"));
		helmets.add(new Inventory("speed","health",2835,"speed",16,"defense",83,"attack",96,"phealth",7,"Auxiliary Lots"));
		helmets.add(new Inventory("speed","health",2835,"attack",98,"speed",9,"dcrit",14,"pcrit",14,"Arbiter Vildred"));
		helmets.add(new Inventory("critical","health",2835,"speed",7,"pcrit",9,"pattack",21,"dcrit",15,"Judge Kise"));
		helmets.add(new Inventory("speed","health",2835,"attack",104,"pcrit",4,"dcrit",12,"speed",15));
		helmets.add(new Inventory("hit","health",2835,"speed",9,"dcrit",16,"pcrit",10,"pattack",18));
		helmets.add(new Inventory("speed","health",2835,"dcrit",10,"pattack",26,"phealth",13,"speed",7));
		helmets.add(new Inventory("speed","health",2835,"speed",4,"phealth",28,"eff",15,"pdefense",12,"Falconer Kluri"));
		helmets.add(new Inventory("speed","health",2700,"dcrit",19,"speed",2,"pdefense",8,"pattack",19));
		helmets.add(new Inventory("critical","health",2700,"pcrit",15,"pdefense",19,"phealth",4,"dcrit",6));
		helmets.add(new Inventory("speed","health",2700,"phealth",11,"speed",7,"dcrit",6,"res",29,"Sinful Angelica"));
		helmets.add(new Inventory("speed","health",2700,"pdefense",16,"dcrit",13,"pattack",8,"pcrit",8));
		helmets.add(new Inventory("critical","health",2700,"dcrit",4,"attack",120,"pcrit",13,"speed",6));
		helmets.add(new Inventory("speed","health",2700,"speed",4,"res",16,"defense",91,"phealth",5));
		helmets.add(new Inventory("speed","health",2700,"attack",122,"speed",8,"phealth",21,"defense",32));
		helmets.add(new Inventory("critical","health",2700,"dcrit",12,"speed",7,"pdefense",12,"phealth",18));
		helmets.add(new Inventory("speed","health",2700,"res",8,"pdefense",19,"dcrit",13,"speed",9));
		helmets.add(new Inventory("speed","health",2700,"phealth",16,"pdefense",5,"eff",18,"speed",5));
		helmets.add(new Inventory("rage","health",2700,"res",17,"pattack",10,"dcrit",17,"speed",2));
		helmets.add(new Inventory("rage","health",2360,"speed",5,"pattack",16,"eff",19,"dcrit",3));
		helmets.add(new Inventory("counter","health",2700,"speed",4,"eff",19,"dcrit",16,"pattack",14));
		helmets.add(new Inventory("lifesteal","health",2700,"pdefense",9,"speed",8,"eff",13,"res",12));
		helmets.add(new Inventory("lifesteal","health",2700,"phealth",12,"dcrit",10,"pattack",19,"res",12));
		helmets.add(new Inventory("speed","health",2835,"pattack",38,"speed",4,"defense",37,"dcrit",11));
		helmets.add(new Inventory("immunity","health",2835,"defense",42,"speed",8,"pattack",31,"dcrit",11,"Kayron"));
		helmets.add(new Inventory("speed","health",2835,"dcrit",12,"attack",53,"pattack",38,"pcrit",6,"Challenger Dominiel"));
		helmets.add(new Inventory("speed","health",2700,"res",14,"speed",4,"dcrit",24,"attack",68));
		helmets.add(new Inventory("speed","health",2700,"pattack",11,"dcrit",14,"speed",3,"attack",172));
		helmets.add(new Inventory("speed","health",2700,"eff",20,"attack",34,"pcrit",7,"speed",7));
		helmets.add(new Inventory("counter","health",2700,"eff",15,"speed",4,"pcrit",18,"phealth",7));
		helmets.add(new Inventory("speed","health",2700,"eff",20,"speed",5,"attack",85,"phealth",10));
		helmets.add(new Inventory("speed","health",2700,"attack",115,"pcrit",12,"speed",5,"eff",6));
		helmets.add(new Inventory("speed","health",2700,"speed",8,"eff",10,"phealth",19,"pattack",13));
		helmets.add(new Inventory("destruction","health",2700,"pattack",8,"eff",13,"attack",120,"dcrit",16));
		helmets.add(new Inventory("speed","health",2700,"eff",26,"speed",5,"dcrit",11,"res",6));
		helmets.add(new Inventory("hit","health",2765,"pattack",17,"speed",6,"pcrit",5,"res",18));
		helmets.add(new Inventory("speed","health",2765,"phealth",20,"pdefense",13,"speed",7,"res",6));
		helmets.add(new Inventory("attack","health",2765,"pattack",19,"speed",9,"res",11,"eff",5));
		helmets.add(new Inventory("health","health",2295,"phealth",7,"pdefense",11,"speed",14,"res",5));
		helmets.add(new Inventory("immunity","health",2765,"phealth",25,"pdefense",6,"res",16,"pcrit",5));
		helmets.add(new Inventory("destruction","health",2765,"pattack",6,"pcrit",8,"dcrit",12,"res",28));
		helmets.add(new Inventory("destruction","health",2565,"pattack",11,"phealth",14,"pcrit",8,"eff",18));
		helmets.add(new Inventory("immunity","health",2565,"phealth",30,"pattack",7,"speed",11,"eff",7));
		helmets.add(new Inventory("speed","health",2360,"phealth",12,"pdefense",9,"speed",6,"defense",28));
		helmets.add(new Inventory("speed","health",1295,"phealth",13,"pdefense",8,"speed",2,"defense",13));
		helmets.add(new Inventory("speed","health",1515,"eff",15,"speed",4,"phealth",9,"attack",26));
		helmets.add(new Inventory("speed","health",2835,"pcrit",8,"speed",15,"dcrit",6,"pdefense",7,"Faithless Lidica"));
		helmets.add(new Inventory("speed","health",2835,"speed",14,"eff",12,"dcrit",6,"pcrit",6,"Cerise"));
		helmets.add(new Inventory("speed","health",2700,"eff",19,"pdefense",12,"speed",7,"res",6));
		helmets.add(new Inventory("speed","health",2700,"pcrit",13,"phealth",16,"speed",3,"eff",14));
		helmets.add(new Inventory("critical","health",2700,"phealth",14,"pdefense",8,"dcrit",13,"defense",58));
		helmets.add(new Inventory("speed","health",2700,"pattack",18,"pcrit",9,"dcrit",9,"phealth",4));
		helmets.add(new Inventory("critical","health",2700,"pattack",13,"speed",8,"pcrit",10,"pdefense",7));
		helmets.add(new Inventory("critical","health",2700,"pattack",13,"pcrit",13,"dcrit",12,"eff",8));
		helmets.add(new Inventory("critical","health",2700,"pcrit",7,"pattack",18,"dcrit",12,"attack",37));
		helmets.add(new Inventory("speed","health",2700,"speed",2,"phealth",13,"pdefense",18,"defense",60));
		helmets.add(new Inventory("speed","health",2700,"pdefense",7,"speed",7,"pattack",16,"attack",72));
		helmets.add(new Inventory("critical","health",2700,"phealth",12,"eff",5,"speed",9,"pcrit",8));
		helmets.add(new Inventory("hit","health",2700,"speed",10,"pattack",10,"eff",14,"res",4));
		helmets.add(new Inventory("speed","health",2700,"dcrit",10,"pattack",16,"pcrit",10,"res",7));
		helmets.add(new Inventory("speed","health",2700,"phealth",16,"pattack",15,"speed",3,"pcrit",3));
		helmets.add(new Inventory("speed","health",2700,"res",14,"pdefense",16,"speed",7,"attack",68));
		helmets.add(new Inventory("speed","health",2700,"speed",7,"pattack",10,"eff",18,"attack",36));
		helmets.add(new Inventory("speed","health",2360,"pattack",4,"pcrit",8,"dcrit",19,"defense",28));
		helmets.add(new Inventory("speed","health",1295,"pattack",14,"pcrit",6,"eff",10,"attack",19));
		helmets.add(new Inventory("unity","health",2700,"pcrit",4,"attack",110,"speed",7,"pattack",14));
		helmets.add(new Inventory("immunity","health",2700,"res",10,"speed",5,"pattack",11,"defense",63));
		helmets.add(new Inventory("unity","health",1760,"eff",6,"speed",6,"phealth",7,"pattack",3));
		helmets.add(new Inventory("health","health",2700,"eff",4,"speed",6,"pdefense",23,"phealth",4));
		helmets.add(new Inventory("resist","health",2700,"eff",8,"phealth",21,"speed",8,"pcrit",8));
		helmets.add(new Inventory("destruction","health",2700,"phealth",28,"speed",3,"pattack",7,"eff",13));
		helmets.add(new Inventory("destruction","health",2700,"pattack",4,"phealth",19,"dcrit",14,"pcrit",9));
		helmets.add(new Inventory("counter","health",2700,"pcrit",4,"defense",113,"pattack",4,"attack",80));
		helmets.add(new Inventory("speed","health",2360,"speed",4,"pattack",11,"defense",47,"pcrit",2));
		return helmets;
	}
	
	{
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public static ArrayList<Inventory> getArmors(){
		ArrayList<Inventory> armors = new ArrayList<Inventory>();
		armors.add(new Inventory("resist","defense",285,"phealth",21,"pdefense",11,"speed",12,"res",7));
		armors.add(new Inventory("destruction","defense",285,"phealth",15,"speed",4,"pcrit",14,"eff",14));
		armors.add(new Inventory("immunity","defense",260,"phealth",11,"speed",5,"pcrit",11,"eff",12));
		armors.add(new Inventory("lifesteal","defense",310,"phealth",14,"speed",12,"pcrit",9,"eff",17));
		armors.add(new Inventory("lifesteal","defense",300,"phealth",5,"speed",13,"pcrit",13,"eff",7));
		armors.add(new Inventory("lifesteal","defense",260,"phealth",7,"speed",8,"pcrit",4,"eff",20));
		armors.add(new Inventory("lifesteal","defense",190,"phealth",15,"speed",4,"pcrit",8,"eff",3));
		armors.add(new Inventory("destruction","defense",285,"pcrit",10,"dcrit",23,"phealth",6,"speed",7));
		armors.add(new Inventory("counter","defense",300,"phealth",18,"speed",8,"pcrit",4,"eff",12));
		armors.add(new Inventory("critical","defense",235,"health",410,"phealth",11,"speed",2,"pcrit",10));
		armors.add(new Inventory("attack","defense",260,"phealth",15,"speed",9,"pcrit",4,"dcrit",11));
		armors.add(new Inventory("destruction","defense",190,"phealth",16,"speed",5,"pcrit",12,"eff",6));
		armors.add(new Inventory("attack","defense",260,"phealth",25,"speed",6,"pcrit",8,"dcrit",6));
		armors.add(new Inventory("destruction","defense",260,"phealth",7,"speed",6,"pcrit",11,"dcrit",12));
		armors.add(new Inventory("speed","defense",260,"phealth",12,"pdefense",17,"speed",3,"res",14));
		armors.add(new Inventory("health","defense",275,"phealth",22,"pdefense",20,"speed",7,"res",7));
		armors.add(new Inventory("health","defense",275,"phealth",11,"pdefense",17,"speed",7,"res",11));
		armors.add(new Inventory("attack","defense",275,"phealth",7,"speed",8,"pcrit",9,"dcrit",19));
		armors.add(new Inventory("attack","defense",275,"phealth",12,"speed",8,"pcrit",12,"dcrit",11));
		armors.add(new Inventory("critical","defense",285,"phealth",14,"pdefense",24,"pcrit",4,"dcrit",13));
		armors.add(new Inventory("speed","defense",260,"phealth",6,"speed",5,"pcrit",10,"eff",12));
		armors.add(new Inventory("attack","defense",310,"health",807,"pcrit",6,"dcrit",14,"speed",4));
		armors.add(new Inventory("attack","defense",310,"res",12,"dcrit",23,"pcrit",15,"health",215,"Judge Kise"));
		armors.add(new Inventory("attack","defense",310,"phealth",5,"pcrit",11,"speed",7,"res",22));
		armors.add(new Inventory("resist","defense",310,"pdefense",25,"pcrit",9,"dcrit",10,"eff",9));
		armors.add(new Inventory("counter","defense",310,"phealth",14,"eff",11,"speed",16,"health",212,"Elena"));
		armors.add(new Inventory("counter","defense",310,"dcrit",11,"res",12,"pcrit",10,"phealth",20));
		armors.add(new Inventory("counter","defense",310,"res",16,"dcrit",13,"phealth",30,"health",199));
		armors.add(new Inventory("counter","defense",310,"dcrit",7,"res",23,"pcrit",4,"pdefense",24));
		armors.add(new Inventory("counter","defense",310,"pcrit",8,"dcrit",12,"speed",7,"phealth",18));
		armors.add(new Inventory("counter","defense",310,"eff",11,"pcrit",17,"dcrit",20,"speed",4));
		armors.add(new Inventory("counter","defense",310,"health",209,"phealth",35,"pdefense",5,"speed",6));
		armors.add(new Inventory("rage","defense",250,"dcrit",11,"phealth",4,"speed",4,"health",481));
		armors.add(new Inventory("health","defense",250,"phealth",24,"res",14,"speed",4,"health",137));
		armors.add(new Inventory("health","defense",250,"eff",13,"health",337,"speed",5,"phealth",15));
		armors.add(new Inventory("speed","defense",310,"eff",26,"dcrit",28,"pcrit",6,"speed",4));
		armors.add(new Inventory("speed","defense",310,"pdefense",31,"health",214,"speed",7,"phealth",18));
		armors.add(new Inventory("speed","defense",310,"speed",3,"pdefense",30,"res",15,"phealth",15));
		armors.add(new Inventory("speed","defense",310,"pcrit",6,"speed",14,"phealth",25,"eff",5,"Lilias"));
		armors.add(new Inventory("critical","defense",300,"pcrit",9,"phealth",18,"dcrit",16,"health",175));
		armors.add(new Inventory("critical","defense",300,"health",362,"dcrit",19,"res",7,"pcrit",8));
		armors.add(new Inventory("speed","defense",300,"speed",3,"dcrit",23,"pdefense",19,"phealth",6));
		armors.add(new Inventory("critical","defense",300,"phealth",7,"speed",2,"dcrit",16,"pdefense",24));
		armors.add(new Inventory("critical","defense",300,"dcrit",12,"pcrit",11,"health",510,"phealth",4));
		armors.add(new Inventory("hit","defense",300,"dcrit",4,"pcrit",11,"speed",11,"pdefense",8));
		armors.add(new Inventory("speed","defense",300,"speed",6,"phealth",13,"health",527,"res",18));
		armors.add(new Inventory("speed","defense",260,"dcrit",17,"health",162,"pdefense",16,"speed",3));
		armors.add(new Inventory("speed","defense",260,"health",445,"phealth",4,"speed",6,"eff",16));
		armors.add(new Inventory("rage","defense",310,"dcrit",32,"speed",3,"pcrit",9,"res",9));
		armors.add(new Inventory("unity","defense",310,"eff",6,"dcrit",29,"phealth",6,"speed",12,"Specter Tenebria"));
		armors.add(new Inventory("immunity","defense",310,"dcrit",26,"phealth",21,"health",251,"pcrit",6));
		armors.add(new Inventory("unity","defense",310,"speed",12,"pdefense",5,"pcrit",9,"dcrit",20));
		armors.add(new Inventory("unity","defense",310,"pdefense",19,"pcrit",6,"dcrit",6,"speed",16,"Auxiliary Lots"));
		armors.add(new Inventory("rage","defense",300,"phealth",11,"health",352,"dcrit",17,"pcrit",7));
		armors.add(new Inventory("rage","defense",300,"dcrit",5,"speed",6,"pcrit",9,"phealth",19));
		armors.add(new Inventory("defense","defense",300,"pdefense",22,"health",167,"speed",2,"phealth",17));
		armors.add(new Inventory("counter","defense",300,"eff",11,"pdefense",27,"dcrit",11,"pcrit",3));
		armors.add(new Inventory("speed","defense",310,"pdefense",9,"phealth",8,"dcrit",37,"pcrit",8,"Challenger Dominiel"));
		armors.add(new Inventory("speed","defense",300,"health",362,"res",22,"speed",5,"phealth",15));
		armors.add(new Inventory("counter","defense",300,"speed",6,"health",541,"res",13,"dcrit",9));
		armors.add(new Inventory("speed","defense",300,"phealth",15,"pcrit",8,"pdefense",14,"dcrit",16));
		armors.add(new Inventory("lifesteal","defense",300,"phealth",22,"health",186,"dcrit",21,"eff",5));
		armors.add(new Inventory("speed","defense",300,"pdefense",12,"speed",9,"res",12,"pcrit",6,"Sinful Angelica"));
		armors.add(new Inventory("destruction","defense",300,"speed",3,"dcrit",15,"phealth",13,"pdefense",17));
		armors.add(new Inventory("speed","defense",300,"phealth",8,"pcrit",11,"speed",3,"eff",27));
		armors.add(new Inventory("hit","defense",310,"pdefense",23,"speed",4,"res",16,"eff",6));
		armors.add(new Inventory("speed","defense",310,"phealth",10,"speed",8,"pcrit",8,"res",14));
		armors.add(new Inventory("attack","defense",310,"phealth",11,"pdefense",15,"pcrit",9,"res",12));
		armors.add(new Inventory("health","defense",250,"phealth",12,"pdefense",15,"res",6,"eff",16));
		armors.add(new Inventory("counter","defense",310,"phealth",14,"pdefense",6,"speed",12,"dcrit",15));
		armors.add(new Inventory("immunity","defense",310,"phealth",16,"speed",4,"res",17,"eff",11));
		armors.add(new Inventory("destruction","defense",310,"phealth",19,"speed",7,"pcrit",14,"res",6));
		armors.add(new Inventory("destruction","defense",285,"phealth",13,"pdefense",15,"pcrit",12,"dcrit",12));
		armors.add(new Inventory("immunity","defense",285,"phealth",15,"pdefense",21,"eff",19,"speed",4));
		armors.add(new Inventory("attack","defense",260,"speed",5,"pcrit",13,"dcrit",4,"health",155));
		armors.add(new Inventory("rage","defense",260,"phealth",12,"speed",8,"pcrit",5,"health",148));
		armors.add(new Inventory("attack","defense",235,"phealth",11,"speed",8,"pcrit",7,"dcrit",4));
		armors.add(new Inventory("destruction","defense",225,"pcrit",9,"phealth",10,"speed",5,"health",132));
		armors.add(new Inventory("speed","defense",165,"speed",8,"pdefense",3,"eff",6,"phealth",3));
		armors.add(new Inventory("speed","defense",310,"pcrit",6,"speed",7,"dcrit",29,"phealth",9));
		armors.add(new Inventory("speed","defense",310,"dcrit",5,"pdefense",7,"speed",14,"pcrit",9,"Arbiter Vildred"));
		armors.add(new Inventory("speed","defense",310,"eff",22,"phealth",5,"speed",10,"res",6,"Cerise"));
		armors.add(new Inventory("speed","defense",310,"speed",4,"pcrit",16,"dcrit",13,"res",15,"Kayron"));
		armors.add(new Inventory("speed","defense",310,"speed",5,"dcrit",12,"pcrit",15,"phealth",6));
		armors.add(new Inventory("speed","defense",310,"speed",4,"pcrit",17,"dcrit",11,"pdefense",9));
		armors.add(new Inventory("speed","defense",300,"speed",10,"pdefense",21,"phealth",7,"pcrit",4));
		armors.add(new Inventory("speed","defense",300,"dcrit",17,"speed",10,"health",155,"res",4));
		armors.add(new Inventory("speed","defense",300,"res",8,"speed",5,"pdefense",19,"phealth",11));
		armors.add(new Inventory("speed","defense",300,"phealth",10,"health",482,"speed",7,"dcrit",4));
		armors.add(new Inventory("speed","defense",300,"speed",7,"pcrit",13,"eff",15,"phealth",7,"Iseria"));
		armors.add(new Inventory("critical","defense",300,"dcrit",14,"pcrit",8,"speed",6,"eff",11));
		armors.add(new Inventory("speed","defense",300,"pcrit",12,"speed",2,"phealth",23,"res",7));
		armors.add(new Inventory("critical","defense",300,"speed",7,"health",156,"dcrit",19,"phealth",12));
		armors.add(new Inventory("speed","defense",300,"speed",3,"pdefense",21,"phealth",11,"res",10));
		armors.add(new Inventory("speed","defense",300,"speed",4,"pdefense",12,"dcrit",19,"res",16));
		armors.add(new Inventory("critical","defense",300,"dcrit",4,"phealth",5,"pcrit",19,"res",4));
		armors.add(new Inventory("speed","defense",300,"speed",6,"dcrit",11,"pcrit",8,"res",14));
		armors.add(new Inventory("speed","defense",140,"health",304,"speed",2,"phealth",4,"pcrit",3));
		armors.add(new Inventory("rage","defense",300,"pcrit",12,"res",14,"dcrit",7,"pdefense",12));
		armors.add(new Inventory("unity","defense",300,"dcrit",14,"speed",3,"pcrit",16,"health",157));
		armors.add(new Inventory("unity","defense",190,"speed",4,"pdefense",12,"eff",13,"dcrit",3));
		armors.add(new Inventory("health","defense",95,"speed",3,"dcrit",2,"res",9,"eff",3));
		armors.add(new Inventory("speed","defense",310,"speed",18,"health",235,"dcrit",6,"eff",5,"Faithless Lidica"));
		armors.add(new Inventory("speed","defense",300,"health",172,"speed",9,"pdefense",11,"eff",5,"Falconer Kluri"));
		armors.add(new Inventory("speed","defense",300,"pcrit",11,"pdefense",8,"res",7,"speed",2));
		armors.add(new Inventory("immunity","defense",300,"pdefense",10,"phealth",12,"health",157,"pcrit",7));
		return armors;
	}	

	{	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
	
	
	
	
	}
	
	public static ArrayList<Inventory> getNecklaces(){
		ArrayList<Inventory> necklaces = new ArrayList<Inventory>();
		necklaces.add(new Inventory("attack","dcrit",65,"phealth",14,"pattack",7,"pdefense",19,"pcrit",11));
		necklaces.add(new Inventory("health","phealth",60,"pdefense",12,"pcrit",14,"speed",8,"res",6));
		necklaces.add(new Inventory("critical","dcrit",55,"phealth",10,"pattack",10,"pcrit",7,"eff",15));
		necklaces.add(new Inventory("lifesteal","pattack",65,"phealth",18,"speed",9,"pcrit",20,"eff",9));
		necklaces.add(new Inventory("lifesteal","pattack",60,"phealth",12,"speed",8,"pcrit",4,"eff",21));
		necklaces.add(new Inventory("critical","dcrit",65,"pcrit",13,"pattack",13,"phealth",6,"eff",22));
		necklaces.add(new Inventory("attack","pcrit",35,"phealth",14,"pattack",8,"pdefense",13,"dcrit",3));
		necklaces.add(new Inventory("critical","dcrit",55,"phealth",11,"pattack",21,"pcrit",4,"eff",17));
		necklaces.add(new Inventory("destruction","dcrit",55,"phealth",12,"pattack",19,"speed",7,"pcrit",6));
		necklaces.add(new Inventory("attack","dcrit",55,"phealth",7,"pattack",18,"speed",6,"pcrit",9));
		necklaces.add(new Inventory("critical","dcrit",65,"pattack",11,"speed",10,"pcrit",9,"phealth",11));
		necklaces.add(new Inventory("speed","pcrit",55,"pattack",20,"speed",4,"phealth",12,"eff",14,"Specter Tenebria"));
		necklaces.add(new Inventory("health","phealth",60,"pdefense",7,"speed",13,"pcrit",8,"res",11,"Sinful Angelica"));
		necklaces.add(new Inventory("health","phealth",60,"pdefense",23,"speed",8,"pcrit",9,"res",7));
		necklaces.add(new Inventory("attack","dcrit",65,"phealth",7,"pattack",18,"speed",11,"pcrit",9,"Arbiter Vildred"));
		necklaces.add(new Inventory("attack","dcrit",65,"phealth",22,"pattack",11,"speed",11,"pcrit",4));
		necklaces.add(new Inventory("counter","pattack",60,"pdefense",7,"eff",13,"attack",168,"speed",8));
		necklaces.add(new Inventory("counter","pattack",60,"phealth",4,"speed",9,"dcrit",12,"pdefense",15));
		necklaces.add(new Inventory("counter","phealth",50,"pdefense",5,"speed",8,"dcrit",10,"pcrit",9));
		necklaces.add(new Inventory("immunity","pdefense",60,"phealth",7,"pcrit",12,"speed",7,"res",17));
		necklaces.add(new Inventory("critical","dcrit",55,"phealth",21,"pattack",18,"speed",3,"pcrit",3));
		necklaces.add(new Inventory("immunity","phealth",65,"pattack",8,"pdefense",30,"speed",5,"eff",12));
		necklaces.add(new Inventory("resist","phealth",65,"defense",104,"speed",3,"res",14,"pdefense",17));
		necklaces.add(new Inventory("resist","phealth",65,"defense",72,"pattack",17,"speed",7,"eff",12));
		necklaces.add(new Inventory("lifesteal","phealth",65,"dcrit",7,"pcrit",10,"eff",27,"health",379));
		necklaces.add(new Inventory("critical","pcrit",45,"pattack",7,"pdefense",13,"speed",11,"eff",12));
		necklaces.add(new Inventory("unity","pattack",50,"phealth",7,"speed",4,"pcrit",10,"eff",24));
		necklaces.add(new Inventory("speed","phealth",50,"pdefense",12,"speed",5,"res",18,"defense",53));
		necklaces.add(new Inventory("speed","phealth",40,"pcrit",10,"speed",2,"pdefense",14,"defense",39));
		necklaces.add(new Inventory("speed","dcrit",70,"pcrit",20,"attack",150,"speed",3,"health",216,"Kayron"));
		necklaces.add(new Inventory("speed","pdefense",65,"pcrit",4,"speed",14,"pattack",7,"phealth",22,"Falconer Kluri"));
		necklaces.add(new Inventory("speed","pattack",65,"eff",29,"pdefense",7,"speed",9,"attack",97,"Cerise"));
		necklaces.add(new Inventory("speed","pdefense",60,"defense",89,"phealth",8,"dcrit",17,"speed",4));
		necklaces.add(new Inventory("speed","phealth",60,"dcrit",11,"pcrit",12,"speed",5,"res",16));
		necklaces.add(new Inventory("critical","attack",500,"pattack",16,"speed",7,"eff",7,"res",15));
		necklaces.add(new Inventory("speed","phealth",60,"pdefense",12,"defense",62,"speed",6,"res",16));
		necklaces.add(new Inventory("speed","phealth",50,"pdefense",7,"speed",4,"pcrit",16,"eff",12));
		necklaces.add(new Inventory("speed","phealth",50,"pdefense",7,"speed",9,"pcrit",8,"eff",17));
		necklaces.add(new Inventory("unity","pcrit",55,"dcrit",12,"attack",187,"health",172,"speed",3));
		necklaces.add(new Inventory("immunity","dcrit",65,"speed",5,"pcrit",11,"defense",60,"pattack",14));
		necklaces.add(new Inventory("immunity","pcrit",55,"dcrit",14,"health",529,"phealth",12,"attack",77));
		necklaces.add(new Inventory("unity","pcrit",55,"health",349,"eff",23,"pdefense",13,"dcrit",7));
		necklaces.add(new Inventory("health","phealth",65,"res",5,"eff",17,"speed",13,"pdefense",25));
		necklaces.add(new Inventory("destruction","dcrit",65,"health",186,"speed",3,"pattack",19,"attack",159));
		necklaces.add(new Inventory("lifesteal","dcrit",65,"speed",7,"res",13,"pdefense",4,"pattack",13));
		necklaces.add(new Inventory("attack","pcrit",35,"pdefense",13,"dcrit",15,"pattack",6,"eff",6));
		necklaces.add(new Inventory("health","phealth",30,"pattack",11,"res",6,"health",158,"defense",28));
		necklaces.add(new Inventory("speed","phealth",50,"pdefense",21,"dcrit",10,"speed",6,"res",4,"Iseria"));
		necklaces.add(new Inventory("immunity","pcrit",60,"dcrit",24,"eff",5,"phealth",8,"speed",16,"Faithless Lidica"));
		necklaces.add(new Inventory("immunity","pcrit",60,"phealth",6,"pattack",17,"defense",42,"dcrit",34));
		necklaces.add(new Inventory("immunity","pcrit",55,"res",5,"dcrit",9,"attack",114,"pattack",19));
		necklaces.add(new Inventory("critical","dcrit",65,"pdefense",24,"speed",4,"pcrit",9,"attack",85));
		necklaces.add(new Inventory("immunity","pcrit",55,"defense",67,"dcrit",19,"res",11,"speed",6));
		necklaces.add(new Inventory("immunity","pcrit",55,"res",11,"speed",4,"attack",153,"dcrit",10));
		necklaces.add(new Inventory("hit","dcrit",70,"pattack",11,"speed",4,"pcrit",20,"res",12));
		necklaces.add(new Inventory("speed","phealth",65,"speed",4,"pcrit",16,"res",10,"eff",10));
		necklaces.add(new Inventory("attack","pcrit",60,"phealth",5,"speed",6,"dcrit",5,"res",33));
		necklaces.add(new Inventory("counter","dcrit",70,"pcrit",10,"speed",6,"phealth",17,"res",10));
		necklaces.add(new Inventory("immunity","dcrit",70,"pattack",19,"pcrit",9,"res",13,"phealth",14,"Judge Kise"));
		necklaces.add(new Inventory("destruction","dcrit",70,"phealth",6,"pattack",13,"pcrit",5,"res",31));
		necklaces.add(new Inventory("destruction","phealth",50,"speed",5,"pcrit",7,"eff",9,"pdefense",10));
		necklaces.add(new Inventory("speed","pattack",40,"speed",2,"pcrit",8,"phealth",15,"dcrit",9));
		necklaces.add(new Inventory("attack","pcrit",55,"defense",31,"pdefense",10,"speed",8,"eff",12));
		necklaces.add(new Inventory("health","phealth",50,"pdefense",14,"eff",5,"pcrit",12,"res",5));
		necklaces.add(new Inventory("speed","pdefense",65,"speed",17,"phealth",8,"health",229,"pattack",17,"Auxiliary Lots"));
		necklaces.add(new Inventory("critical","pcrit",60,"dcrit",27,"speed",1,"pattack",14,"phealth",6));
		necklaces.add(new Inventory("critical","pattack",60,"dcrit",13,"speed",10,"pdefense",10,"eff",8));
		necklaces.add(new Inventory("speed","pcrit",55,"attack",121,"pattack",15,"res",12,"defense",32));
		necklaces.add(new Inventory("hit","phealth",60,"speed",2,"health",658,"pcrit",8,"dcrit",7));
		necklaces.add(new Inventory("critical","phealth",60,"res",20,"pcrit",9,"speed",7,"attack",41));
		necklaces.add(new Inventory("critical","pcrit",55,"pattack",16,"res",23,"speed",3,"dcrit",7));
		necklaces.add(new Inventory("critical","dcrit",65,"pattack",21,"health",332,"pcrit",4,"res",9));
		necklaces.add(new Inventory("immunity","pcrit",55,"pdefense",11,"dcrit",21,"attack",76,"defense",29));
		necklaces.add(new Inventory("immunity","pcrit",55,"health",522,"dcrit",17,"pattack",6,"defense",29));
		necklaces.add(new Inventory("unity","pcrit",55,"pdefense",19,"attack",78,"speed",5,"defense",26));
		necklaces.add(new Inventory("rage","dcrit",65,"res",8,"speed",9,"pattack",17,"pcrit",3));
		necklaces.add(new Inventory("rage","pcrit",55,"phealth",17,"pdefense",6,"pattack",12,"eff",6));
		necklaces.add(new Inventory("immunity","dcrit",65,"speed",10,"pcrit",4,"phealth",16,"pdefense",8));
		necklaces.add(new Inventory("immunity","pcrit",55,"health",342,"phealth",13,"speed",5,"res",12));
		necklaces.add(new Inventory("health","dcrit",70,"pattack",24,"phealth",5,"pcrit",10,"pdefense",16));
		necklaces.add(new Inventory("destruction","pattack",65,"dcrit",30,"phealth",5,"attack",103,"pdefense",5,"Challenger Dominiel"));
		necklaces.add(new Inventory("destruction","pattack",65,"eff",15,"speed",14,"health",239,"dcrit",6));
		necklaces.add(new Inventory("critical","pcrit",55,"speed",9,"phealth",6,"eff",6,"health",335,"Lilias"));
		necklaces.add(new Inventory("rage","pattack",60,"speed",4,"phealth",18,"health",181,"eff",4));
		necklaces.add(new Inventory("immunity","dcrit",65,"health",333,"pattack",19,"res",5,"attack",41));
		necklaces.add(new Inventory("counter","pcrit",55,"speed",2,"pattack",22,"attack",40,"eff",5));
		necklaces.add(new Inventory("critical","pcrit",55,"health",145,"pattack",5,"dcrit",7,"attack",32));
		necklaces.add(new Inventory("speed","pcrit",55,"health",149,"res",6,"attack",62,"defense",24));
		return necklaces;
	}

	{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	}
	
	public static ArrayList<Inventory> getRings(){
		ArrayList<Inventory> rings = new ArrayList<Inventory>();
		rings.add(new Inventory("resist","phealth",60,"eff",11,"speed",6,"pcrit",11,"res",11));
		rings.add(new Inventory("destruction","pattack",60,"phealth",17,"pcrit",5,"dcrit",13,"eff",16));
		rings.add(new Inventory("defense","pdefense",50,"phealth",17,"speed",5,"pcrit",4,"res",12));
		rings.add(new Inventory("lifesteal","pattack",65,"phealth",9,"speed",5,"pcrit",14,"eff",26));
		rings.add(new Inventory("lifesteal","pattack",60,"phealth",11,"speed",5,"pcrit",10,"eff",11));
		rings.add(new Inventory("lifesteal","pattack",40,"phealth",4,"speed",6,"pcrit",5,"eff",14));
		rings.add(new Inventory("critical","pattack",60,"pcrit",9,"dcrit",17,"phealth",18,"speed",4));
		rings.add(new Inventory("critical","pattack",40,"attack",97,"pcrit",5,"dcrit",4,"eff",10));
		rings.add(new Inventory("critical","pattack",50,"phealth",29,"pdefense",7,"speed",4,"pcrit",7));
		rings.add(new Inventory("destruction","pattack",50,"phealth",13,"speed",7,"pcrit",7,"eff",21));
		rings.add(new Inventory("attack","pattack",50,"phealth",14,"speed",6,"pcrit",11,"dcrit",10));
		rings.add(new Inventory("critical","pattack",60,"pdefense",14,"pcrit",13,"dcrit",15,"speed",4));
		rings.add(new Inventory("hit","pattack",60,"phealth",12,"speed",8,"pcrit",17,"eff",7));
		rings.add(new Inventory("immunity","pattack",60,"phealth",12,"pdefense",23,"pcrit",10,"dcrit",6));
		rings.add(new Inventory("health","phealth",60,"pdefense",11,"speed",8,"pcrit",8,"res",18));
		rings.add(new Inventory("health","phealth",60,"pdefense",11,"speed",11,"pcrit",11,"res",7));
		rings.add(new Inventory("attack","pattack",60,"phealth",15,"speed",8,"pcrit",9,"dcrit",19,"Arbiter Vildred"));
		rings.add(new Inventory("attack","pattack",60,"phealth",7,"speed",9,"pcrit",8,"dcrit",16));
		rings.add(new Inventory("attack","pattack",60,"health",546,"res",4,"speed",12,"phealth",4));
		rings.add(new Inventory("attack","pattack",60,"phealth",13,"dcrit",18,"res",11,"speed",7));
		rings.add(new Inventory("counter","phealth",50,"speed",6,"dcrit",12,"eff",6,"pattack",14));
		rings.add(new Inventory("critical","pattack",50,"phealth",12,"speed",9,"pcrit",8,"dcrit",12));
		rings.add(new Inventory("immunity","pattack",60,"pdefense",12,"speed",4,"pcrit",10,"eff",18));
		rings.add(new Inventory("critical","pattack",50,"phealth",10,"speed",3,"pcrit",5,"eff",24));
		rings.add(new Inventory("destruction","pattack",65,"pdefense",15,"pcrit",20,"dcrit",7,"eff",12));
		rings.add(new Inventory("defense","res",65,"eff",14,"phealth",25,"health",207,"speed",11,"Sinful Angelica"));
		rings.add(new Inventory("defense","pattack",65,"dcrit",16,"pcrit",4,"speed",6,"attack",133,"Challenger Dominiel"));
		rings.add(new Inventory("hit","eff",65,"pcrit",17,"dcrit",15,"speed",3,"pdefense",12));
		rings.add(new Inventory("unity","pattack",50,"phealth",12,"speed",7,"dcrit",16,"eff",14));
		rings.add(new Inventory("health","phealth",50,"pdefense",5,"defense",82,"pcrit",9,"speed",5));
		rings.add(new Inventory("immunity","phealth",50,"eff",6,"dcrit",6,"pcrit",15,"speed",3));
		rings.add(new Inventory("lifesteal","res",60,"attack",78,"pattack",13,"speed",6,"phealth",24,"Elena"));
		rings.add(new Inventory("attack","eff",60,"speed",14,"res",8,"pattack",14,"phealth",13,"Iseria"));
		rings.add(new Inventory("speed","phealth",50,"health",480,"defense",29,"res",11,"pcrit",11));
		rings.add(new Inventory("critical","pattack",65,"phealth",12,"dcrit",20,"health",242,"pcrit",15,"Judge Kise"));
		rings.add(new Inventory("speed","pattack",65,"res",16,"dcrit",28,"speed",7,"health",241,"Kayron"));
		rings.add(new Inventory("speed","pattack",65,"pcrit",16,"attack",53,"dcrit",7,"defense",163));
		rings.add(new Inventory("hit","eff",60,"pcrit",6,"phealth",19,"defense",89,"speed",4));
		rings.add(new Inventory("immunity","pattack",60,"eff",8,"attack",190,"health",342,"speed",3));
		rings.add(new Inventory("speed","pattack",60,"eff",23,"dcrit",4,"res",12,"health",355));
		rings.add(new Inventory("speed","phealth",65,"dcrit",14,"pcrit",13,"speed",13,"health",237,"Lilias"));
		rings.add(new Inventory("immunity","pattack",60,"pcrit",13,"pdefense",11,"dcrit",9,"defense",62));
		rings.add(new Inventory("immunity","phealth",60,"pattack",28,"dcrit",5,"eff",14,"defense",60));
		rings.add(new Inventory("unity","eff",60,"phealth",4,"dcrit",11,"health",344,"defense",127));
		rings.add(new Inventory("hit","phealth",65,"pattack",6,"pdefense",23,"speed",7,"res",12));
		rings.add(new Inventory("speed","eff",65,"phealth",6,"pattack",12,"speed",19,"pcrit",5,"Faithless Lidica"));
		rings.add(new Inventory("attack","pattack",65,"pcrit",11,"dcrit",12,"res",13,"eff",13));
		rings.add(new Inventory("health","pattack",50,"phealth",7,"pdefense",11,"pcrit",11,"res",17));
		rings.add(new Inventory("counter","phealth",65,"res",17,"speed",9,"eff",11,"pcrit",5));
		rings.add(new Inventory("immunity","phealth",65,"speed",8,"res",13,"pdefense",20,"pcrit",9));
		rings.add(new Inventory("destruction","pattack",65,"pdefense",17,"speed",7,"pcrit",5,"res",20));
		rings.add(new Inventory("hit","eff",50,"phealth",5,"speed",8,"pcrit",6,"pattack",7));
		rings.add(new Inventory("hit","pdefense",65,"pattack",5,"speed",15,"health",487,"defense",41,"Falconer Kluri"));
		rings.add(new Inventory("speed","defense",310,"speed",14,"pcrit",5,"res",7,"phealth",12,"Auxiliary Lots"));
		rings.add(new Inventory("critical","eff",65,"dcrit",6,"speed",16,"defense",41,"attack",101,"Cerise"));
		rings.add(new Inventory("speed","phealth",50,"health",143,"speed",4,"pdefense",20,"dcrit",6));
		rings.add(new Inventory("unity","eff",60,"speed",8,"pcrit",8,"pattack",15,"pdefense",4));
		rings.add(new Inventory("immunity","pattack",60,"speed",5,"defense",60,"attack",108,"dcrit",6));
		rings.add(new Inventory("unity","pattack",60,"res",14,"eff",7,"dcrit",20,"attack",33));
		rings.add(new Inventory("rage","pattack",60,"defense",90,"eff",4,"dcrit",16,"res",4));
		rings.add(new Inventory("unity","eff",40,"speed",4,"pdefense",14,"pattack",5,"health",107));
		rings.add(new Inventory("destruction","phealth",60,"pattack",16,"pcrit",4,"dcrit",17,"res",7));
		rings.add(new Inventory("destruction","eff",60,"speed",10,"res",23,"phealth",4,"health",150));
		rings.add(new Inventory("hit","pattack",65,"pcrit",5,"speed",15,"phealth",8,"dcrit",7,"Specter Tenebria"));
		return rings;
	}

	{
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public static ArrayList<Inventory> getBoots(){
		ArrayList<Inventory> boots = new ArrayList<Inventory>();
		boots.add(new Inventory("attack","pattack",60,"phealth",15,"speed",8,"pcrit",8,"eff",15));
		boots.add(new Inventory("health","speed",40,"phealth",13,"pdefense",16,"pcrit",5,"eff",18));
		boots.add(new Inventory("lifesteal","pattack",65,"phealth",19,"speed",8,"pcrit",14,"eff",9));
		boots.add(new Inventory("lifesteal","pattack",60,"phealth",10,"speed",6,"pcrit",7,"eff",15));
		boots.add(new Inventory("lifesteal","pattack",50,"phealth",14,"speed",6,"pcrit",5,"eff",14));
		boots.add(new Inventory("destruction","pattack",60,"pcrit",8,"dcrit",13,"phealth",16,"eff",12));
		boots.add(new Inventory("counter","pattack",40,"speed",4,"pcrit",6,"res",9,"eff",11));
		boots.add(new Inventory("critical","speed",35,"health",126,"phealth",16,"pattack",18,"pcrit",5));
		boots.add(new Inventory("attack","pattack",50,"phealth",12,"pdefense",20,"pcrit",7,"dcrit",12));
		boots.add(new Inventory("destruction","pattack",40,"phealth",9,"pdefense",10,"pcrit",6,"eff",15));
		boots.add(new Inventory("attack","pattack",50,"phealth",12,"speed",9,"pcrit",7,"dcrit",9));
		boots.add(new Inventory("destruction","pattack",50,"phealth",13,"speed",6,"pcrit",4,"dcrit",21));
		boots.add(new Inventory("critical","pattack",60,"phealth",19,"pcrit",6,"dcrit",6,"eff",18));
		boots.add(new Inventory("speed","speed",35,"phealth",12,"pattack",18,"pdefense",12,"pcrit",7));
		boots.add(new Inventory("health","phealth",60,"pdefense",12,"speed",7,"pcrit",11,"res",11));
		boots.add(new Inventory("health","phealth",60,"pdefense",7,"speed",7,"pcrit",17,"res",15));
		boots.add(new Inventory("attack","pattack",60,"phealth",12,"speed",9,"pcrit",14,"dcrit",6));
		boots.add(new Inventory("attack","pattack",60,"phealth",12,"speed",7,"pcrit",4,"dcrit",23));
		boots.add(new Inventory("speed","pattack",50,"phealth",6,"speed",10,"pcrit",10,"eff",6));
		boots.add(new Inventory("defense","pdefense",65,"phealth",13,"speed",8,"res",24,"eff",8));
		boots.add(new Inventory("unity","pattack",65,"pdefense",19,"speed",7,"res",5,"dcrit",17));
		boots.add(new Inventory("health","phealth",50,"pdefense",14,"pcrit",11,"res",7,"eff",18));
		boots.add(new Inventory("speed","speed",35,"defense",86,"pdefense",4,"health",325,"res",20));
		boots.add(new Inventory("speed","speed",35,"attack",66,"dcrit",15,"pcrit",4,"pdefense",11));
		boots.add(new Inventory("health","phealth",60,"pdefense",21,"res",20,"pcrit",4,"speed",6));
		boots.add(new Inventory("speed","speed",45,"pattack",18,"pcrit",19,"health",219,"dcrit",13,"Arbiter Vildred"));
		boots.add(new Inventory("speed","speed",45,"defense",126,"phealth",13,"pdefense",14,"pcrit",9,"Iseria"));
		boots.add(new Inventory("speed","speed",45,"phealth",29,"res",13,"health",482,"defense",43,"Auxiliary Lots"));
		boots.add(new Inventory("speed","speed",40,"health",191,"phealth",6,"res",16,"pcrit",15));
		boots.add(new Inventory("critical","speed",40,"defense",60,"pcrit",17,"dcrit",13,"attack",39));
		boots.add(new Inventory("critical","pattack",60,"pcrit",15,"eff",6,"res",12,"dcrit",11));
		boots.add(new Inventory("speed","pattack",60,"dcrit",28,"pdefense",6,"pcrit",9,"res",6));
		boots.add(new Inventory("hit","pattack",60,"pcrit",10,"speed",6,"dcrit",14,"pdefense",10));
		boots.add(new Inventory("hit","speed",40,"pcrit",6,"pdefense",17,"pattack",12,"dcrit",13));
		boots.add(new Inventory("critical","pattack",60,"pcrit",8,"dcrit",17,"health",363,"defense",66));
		boots.add(new Inventory("hit","speed",40,"pdefense",17,"phealth",15,"eff",14,"dcrit",12));
		boots.add(new Inventory("hit","speed",40,"pattack",6,"pcrit",4,"eff",31,"pdefense",15));
		boots.add(new Inventory("speed","speed",40,"pcrit",5,"defense",133,"health",185,"res",21));
		boots.add(new Inventory("critical","attack",500,"pattack",7,"dcrit",21,"pcrit",5,"speed",10));
		boots.add(new Inventory("speed","speed",35,"defense",27,"dcrit",24,"health",311,"pdefense",7));
		boots.add(new Inventory("unity","speed",40,"dcrit",6,"pcrit",6,"pattack",20,"phealth",17));
		boots.add(new Inventory("unity","phealth",60,"pdefense",27,"pcrit",4,"dcrit",12,"speed",6));
		boots.add(new Inventory("unity","speed",40,"pattack",17,"dcrit",15,"phealth",6,"defense",67));
		boots.add(new Inventory("counter","phealth",60,"pcrit",14,"health",553,"pattack",13,"eff",8));
		boots.add(new Inventory("counter","pattack",60,"phealth",6,"res",22,"defense",66,"pcrit",7));
		boots.add(new Inventory("speed","speed",45,"pcrit",9,"pattack",18,"defense",120,"dcrit",16,"Specter Tenebria"));
		boots.add(new Inventory("speed","speed",45,"res",5,"pattack",28,"health",220,"dcrit",17,"Challenger Dominiel"));
		boots.add(new Inventory("destruction","pattack",65,"dcrit",26,"attack",46,"eff",14,"pdefense",19));
		boots.add(new Inventory("speed","speed",45,"phealth",6,"pdefense",17,"eff",15,"pattack",26,"Falconer Kluri"));
		boots.add(new Inventory("counter","speed",40,"res",19,"attack",34,"pcrit",15,"health",189));
		boots.add(new Inventory("speed","speed",40,"pattack",5,"phealth",14,"health",361,"attack",148));
		boots.add(new Inventory("destruction","pattack",60,"pcrit",8,"speed",12,"defense",58,"dcrit",5));
		boots.add(new Inventory("counter","speed",40,"pcrit",3,"dcrit",25,"eff",11,"res",12));
		boots.add(new Inventory("speed","speed",40,"eff",11,"dcrit",15,"phealth",14,"pattack",9));
		boots.add(new Inventory("counter","pattack",60,"health",758,"dcrit",4,"speed",11,"defense",34));
		boots.add(new Inventory("speed","speed",40,"defense",63,"dcrit",10,"pattack",15,"phealth",11));
		boots.add(new Inventory("speed","speed",40,"attack",76,"pattack",15,"eff",11,"pcrit",10));
		boots.add(new Inventory("speed","speed",40,"pattack",12,"res",15,"pcrit",12,"eff",10));
		boots.add(new Inventory("hit","pattack",65,"pcrit",9,"dcrit",19,"res",20,"eff",6));
		boots.add(new Inventory("speed","pattack",65,"speed",7,"pcrit",5,"dcrit",16,"res",19));
		boots.add(new Inventory("attack","pattack",65,"phealth",5,"pcrit",9,"dcrit",23,"res",12));
		boots.add(new Inventory("counter","pattack",65,"res",12,"speed",4,"pcrit",15,"dcrit",12));
		boots.add(new Inventory("immunity","speed",45,"phealth",6,"res",10,"eff",24,"pattack",12));
		boots.add(new Inventory("destruction","pattack",65,"phealth",24,"speed",10,"pcrit",5,"res",6));
		boots.add(new Inventory("destruction","pattack",60,"phealth",13,"pdefense",15,"pcrit",13,"eff",15));
		boots.add(new Inventory("immunity","pattack",60,"phealth",24,"pdefense",7,"pcrit",9,"dcrit",13,"Judge Kise"));
		boots.add(new Inventory("lifesteal","speed",35,"phealth",25,"pattack",10,"pcrit",3,"attack",35));
		boots.add(new Inventory("critical","speed",35,"phealth",9,"pattack",18,"pcrit",8,"dcrit",3));
		boots.add(new Inventory("attack","pattack",30,"pdefense",13,"pcrit",2,"eff",11,"attack",18));
		boots.add(new Inventory("immunity","pattack",50,"dcrit",19,"pcrit",3,"health",301,"attack",28));
		boots.add(new Inventory("unity","pattack",50,"health",715,"phealth",6,"res",4,"dcrit",4));
		boots.add(new Inventory("speed","speed",25,"defense",20,"pattack",11,"res",17,"phealth",5));
		boots.add(new Inventory("speed","speed",45,"eff",7,"pdefense",16,"phealth",19,"res",14));
		boots.add(new Inventory("speed","speed",45,"health",649,"phealth",6,"eff",24,"pdefense",6,"Cerise"));
		boots.add(new Inventory("critical","speed",45,"dcrit",22,"pcrit",9,"pdefense",18,"phealth",9,"Faithless Lidica"));
		boots.add(new Inventory("speed","speed",45,"dcrit",12,"phealth",13,"pcrit",14,"pattack",5,"Lilias"));
		boots.add(new Inventory("speed","speed",45,"phealth",16,"health",670,"defense",41,"pcrit",6));
		boots.add(new Inventory("speed","pattack",60,"phealth",18,"dcrit",4,"pcrit",13,"defense",29));
		boots.add(new Inventory("speed","speed",40,"phealth",15,"res",21,"pcrit",9,"eff",5));
		boots.add(new Inventory("speed","speed",40,"dcrit",16,"pcrit",5,"defense",55,"pdefense",13));
		boots.add(new Inventory("speed","speed",40,"pdefense",11,"phealth",5,"defense",118,"pcrit",4));
		boots.add(new Inventory("speed","speed",40,"phealth",9,"res",10,"pdefense",17,"dcrit",4));
		boots.add(new Inventory("speed","speed",40,"dcrit",12,"phealth",7,"pdefense",21,"pattack",5));
		boots.add(new Inventory("speed","speed",40,"dcrit",11,"pdefense",9,"pcrit",14,"attack",42));
		boots.add(new Inventory("speed","speed",40,"phealth",8,"eff",15,"pattack",16,"defense",30));
		boots.add(new Inventory("speed","phealth",50,"pcrit",7,"res",12,"defense",71,"attack",33));
		boots.add(new Inventory("critical","speed",35,"health",291,"pcrit",7,"pattack",6,"eff",11));
		boots.add(new Inventory("critical","speed",35,"phealth",9,"eff",12,"dcrit",12,"res",4));
		boots.add(new Inventory("speed","speed",30,"pattack",14,"pcrit",6,"dcrit",10,"defense",20));
		boots.add(new Inventory("speed","pattack",40,"attack",75,"speed",2,"health",231,"defense",34));
		boots.add(new Inventory("speed","pdefense",30,"pattack",13,"speed",1,"phealth",10,"pcrit",4));
		boots.add(new Inventory("speed","phealth",30,"speed",3,"res",10,"pdefense",10,"attack",14));
		boots.add(new Inventory("immunity","speed",45,"pattack",16,"attack",42,"pcrit",19,"defense",37,"Kayron"));
		boots.add(new Inventory("rage","pattack",60,"dcrit",7,"attack",111,"pcrit",13,"eff",8));
		boots.add(new Inventory("unity","pattack",60,"dcrit",9,"pcrit",12,"phealth",14,"pdefense",4));
		boots.add(new Inventory("immunity","speed",40,"attack",41,"pdefense",20,"pattack",18,"phealth",8));
		boots.add(new Inventory("immunity","pattack",60,"attack",39,"phealth",23,"pcrit",9,"res",6));
		boots.add(new Inventory("counter","speed",45,"pdefense",23,"pattack",22,"dcrit",5,"pcrit",6,"Elena"));
		boots.add(new Inventory("resist","speed",45,"phealth",14,"health",458,"pdefense",20,"pcrit",4));
		boots.add(new Inventory("counter","speed",40,"pattack",10,"dcrit",15,"pdefense",12,"attack",43));
		boots.add(new Inventory("counter","pattack",60,"dcrit",7,"attack",144,"pcrit",9,"health",186));
		boots.add(new Inventory("resist","pattack",60,"dcrit",22,"speed",3,"defense",30,"phealth",15));
		boots.add(new Inventory("lifesteal","speed",40,"dcrit",7,"phealth",20,"pdefense",14,"health",157));
		boots.add(new Inventory("speed","speed",45,"res",20,"phealth",8,"eff",14,"attack",48,"Sinful Angelica"));
		boots.add(new Inventory("speed","speed",40,"phealth",4,"res",19,"eff",7,"pdefense",12));
		boots.add(new Inventory("speed","speed",40,"dcrit",18,"attack",37,"defense",28,"pattack",7));
		boots.add(new Inventory("hit","speed",40,"dcrit",12,"eff",12,"phealth",9,"pdefense",5));
		boots.add(new Inventory("immunity","speed",40,"attack",108,"res",14,"phealth",5,"pattack",5));
		boots.add(new Inventory("defense","speed",40,"pdefense",5,"phealth",16,"dcrit",5,"health",327));
		boots.add(new Inventory("attack","pattack",60,"speed",6,"pcrit",11,"defense",28,"eff",6));
		boots.add(new Inventory("speed","speed",40,"eff",6,"dcrit",11,"phealth",6,"defense",26));
		return boots;
	}

}