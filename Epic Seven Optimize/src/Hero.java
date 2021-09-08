import java.util.ArrayList;

class Hero{
	
	String name = "";
	int attack = 0;
	int pattack = 0;
	int health = 0;
	int phealth = 0;
	int defense = 0;
	int pdefense = 0;
	int speed = 0;
	int pcrit = 0;
	int dcrit = 0;
	int eff = 0;
	int res = 0;
	static ArrayList<Hero> heros = new ArrayList<Hero>();
	
	public Hero(String name, int attack, int pattack, int health, int phealth, int defense, int pdefense, int speed,
			int pcrit, int dcrit, int eff, int res) {
		super();
		this.name = name;
		this.attack = attack;
		this.pattack = pattack;
		this.health = health;
		this.phealth = phealth;
		this.defense = defense;
		this.pdefense = pdefense;
		this.speed = speed;
		this.pcrit = pcrit;
		this.dcrit = dcrit;
		this.eff = eff;
		this.res = res;
	}
	
	public static Hero getHero(String name) {
		Hero selected = new Hero("",0,0,0,0,0,0,0,0,0,0,0);
		if (heros.isEmpty()) {
			heros = getHeros();			
		}
		for (Hero hero : heros) {
			if (hero.getName() == name) {
				selected = hero;
			}
		}
		return selected;
	}
	
	public static ArrayList<Hero> getHeros() {
		heros.add(new Hero("Achates",603,0,4945,14,662,0,101,15,150,0,18));//14%HP
		heros.add(new Hero("Adlay",1039,0,3925,0,606,0,110,27,150,0,0));
		heros.add(new Hero("Adventurer Ras",758,0,5826,0,672,0,101,15,150,0,12));
		heros.add(new Hero("Ains",951,0,5517,0,583,0,104,15,150,0,0));
		heros.add(new Hero("Aither",705,0,4248,0,672,0,92,15,150,0,0));
		heros.add(new Hero("Alencia",975,0,7054,0,652,0,106,15,150,0,0));
		heros.add(new Hero("Alexa",1081,0,4572,0,494,0,111,23,150,0,0));
		heros.add(new Hero("All-Rounder Wanda",1005,0,4693,0,532,0,109,15,150,18,0));
		heros.add(new Hero("Ambitious Tywin",894,0,6840,0,694,0,104,15,150,0,0));
		heros.add(new Hero("Angelic Montmorancy",540,0,4900,0,729,0,94,15,150,0,0));
		heros.add(new Hero("Angelica",576,0,5700,0,743,0,88,15,150,0,0));
		heros.add(new Hero("Apocalypse Ravi",975,0,7054,0,652,0,106,45,150,0,0));
		heros.add(new Hero("Aramintha",1197,0,4572,0,683,0,106,15,150,30,0));
		heros.add(new Hero("Arbiter Vildred",1283,0,5138,0,522,0,116,23,150,0,0));
		heros.add(new Hero("Armin",721,0,6189,0,785,0,91,15,150,0,12));//10Speed
		heros.add(new Hero("Arowell",758,0,5826,0,672,0,95,15,150,0,12));
		heros.add(new Hero("Assassin Cartuja",1119,0,6091,0,594,0,100,15,150,0,0));
		heros.add(new Hero("Assassin Cidd",930,0,4774,0,497,0,128,49,150,0,0));
		heros.add(new Hero("Assassin Coli",1027,0,5299,0,469,0,126,15,150,0,0));
		heros.add(new Hero("Auxiliary Lots",1021,0,4855,0,610,0,112,35,150,0,0));
		heros.add(new Hero("Azalea",1019,0,5738,0,571,0,98,15,150,0,0));
		heros.add(new Hero("Baal and Sezan",1197,0,4572,0,683,0,106,15,150,30,0));
		heros.add(new Hero("Baiken",1228,0,6266,0,473,0,113,39,150,0,0));
		heros.add(new Hero("Basar",1316,0,4777,0,715,0,108,15,150,18,0));
		heros.add(new Hero("Bask",842,0,6463,0,617,0,90,15,150,0,0));
		heros.add(new Hero("Batisse",1039,0,5097,0,518,0,104,23,166,0,0));
		heros.add(new Hero("Bellona",1003,0,5704,0,585,0,115,15,150,46,0));//16%Eff
		heros.add(new Hero("Benevolent Romann",957,0,5016,0,645,0,112,15,150,18,18));
		heros.add(new Hero("Blaze Dingo",859,0,4167,0,859,14,106,15,150,0,0));//14%Def
		heros.add(new Hero("Blood Blade Karin",1138,0,5871,0,462,0,111,23,150,0,0));
		heros.add(new Hero("Blood Moon Haste",621,0,5474,0,798,0,98,15,150,0,0));
		heros.add(new Hero("Briar Witch Iseria",1182,0,5299,0,571,0,114,15,150,18,0));
		heros.add(new Hero("Captain Rikoris",951,0,5517,0,583,0,104,15,150,0,0));
		heros.add(new Hero("Carmainerose",1168,0,3877,0,666,0,101,15,150,18,0));
		heros.add(new Hero("Cartuja",903,0,6635,0,630,0,103,15,150,0,0));
		heros.add(new Hero("Cecilia",821,0,6751,0,648,0,110,15,150,34,0));//16%Eff
		heros.add(new Hero("Celeste",929,0,4733,0,494,0,128,15,150,0,0));
		heros.add(new Hero("Celestial Mercedes",1187,0,4491,0,627,0,101,27,160,0,0));
		heros.add(new Hero("Celine",1228,0,6266,0,473,0,113,23,150,0,0));
		heros.add(new Hero("Cerise",970,0,5299,0,603,0,122,35,150,0,0));//12%Crit
		heros.add(new Hero("Cermia",1359,14,5542,0,585,0,105,23,150,0,0));//14%Atk
		heros.add(new Hero("Challenger Dominiel",1187,0,4491,0,627,0,101,77,160,0,0));
		heros.add(new Hero("Campion Zerato",1159,0,4733,0,627,0,104,27,150,18,0));
		heros.add(new Hero("Chaos Inquisitor",963,0,5138,0,606,0,95,23,150,0,0));
		heros.add(new Hero("Chaos Sect Axe",1144,0,4895,0,543,0,101,23,150,0,0));
		heros.add(new Hero("Charles",957,14,6148,0,634,0,109,27,150,0,0));//14%Atk
		heros.add(new Hero("Charlotte",1134,0,5825,0,662,0,99,23,150,0,0));
		heros.add(new Hero("Chloe",1177,14,5542,0,553,0,119,27,150,0,0));//14%Atk
		heros.add(new Hero("Choux",966,0,7323,0,657,0,102,15,150,0,0));
		heros.add(new Hero("Cidd",1029,0,5097,0,473,0,126,23,150,0,0));
		heros.add(new Hero("Clarissa",1252,0,5219,0,564,0,103,23,150,0,0));
		heros.add(new Hero("Coli",1138,0,5871,0,462,0,111,23,150,0,0));
		heros.add(new Hero("Commander Lorina",1144,0,4895,0,543,0,101,23,150,0,0));
		heros.add(new Hero("Corvus",903,0,6635,0,630,0,103,15,150,0,0));
		heros.add(new Hero("Crescent Moon Rin",1027,0,5299,0,469,0,126,15,150,0,0));
		heros.add(new Hero("Crimson Armin",821,0,6266,0,703,0,97,15,150,0,12));
		heros.add(new Hero("Crozet",739,0,6868,0,733,0,93,15,150,0,0));
		heros.add(new Hero("Dark Corvus",966,0,7323,0,657,0,102,15,150,0,0));
		heros.add(new Hero("Desert Jewel Basar",932,0,4370,0,652,0,108,15,150,0,0));
		heros.add(new Hero("Destina",621,0,6034,0,775,0,89,15,150,0,16));//16%ER
		heros.add(new Hero("Diene",649,0,5254,0,694,0,103,15,150,0,18));
		heros.add(new Hero("Dingo",957,0,5057,0,592,0,112,23,150,18,0));
		heros.add(new Hero("Dizzy",1039,0,5299,0,673,0,115,15,150,18,18));
		heros.add(new Hero("Doll Maker Pearlhorizon",921,0,4855,0,631,0,112,15,150,6,18));
		heros.add(new Hero("Dominiel",957,0,5016,0,645,0,112,15,150,18,18));
		heros.add(new Hero("Doris",540,0,5319,0,705,0,86,15,150,0,0));
		heros.add(new Hero("Eaton",685,0,7043,0,703,0,91,15,150,0,0));
		heros.add(new Hero("Elena",649,0,5254,0,694,0,103,15,150,0,18));
		heros.add(new Hero("Elphelt Valentine",1003,0,5704,0,585,0,115,15,150,30,0));
		heros.add(new Hero("Elson",540,0,4900,0,729,0,94,15,150,0,0));
		heros.add(new Hero("Enott",1019,0,5738,0,571,0,98,15,150,0,0));
		heros.add(new Hero("Ervalen",1228,0,6266,0,473,0,113,23,150,0,0));
		heros.add(new Hero("Faithless Lidica",1182,0,5299,0,571,0,114,15,150,18,0));
		heros.add(new Hero("Falconer Kluri",703,0,5914,0,596,0,114,15,150,18,0));
		heros.add(new Hero("Fallen Cecilia",894,0,6840,0,694,0,104,15,150,0,0));
		heros.add(new Hero("Fighter Maya",821,0,6266,0,703,0,97,15,150,0,12));
		heros.add(new Hero("Free Spirit Tieria",957,0,5057,0,592,0,112,23,150,18,0));
		heros.add(new Hero("Furious",1068,0,5650,0,536,0,110,23,150,0,0));
		heros.add(new Hero("General Purrgis",903,0,6635,14,630,0,103,15,150,0,0));//14%HP
		heros.add(new Hero("Gloomyrain",1199,0,4491,0,613,0,107,23,150,0,0));
		heros.add(new Hero("Guider Aither",1252,14,4612,0,627,0,107,15,150,0,0));//14%Atk
		heros.add(new Hero("Gunther",951,0,5517,0,583,0,104,15,150,0,0));
		heros.add(new Hero("Hataan",1081,0,4572,0,494,0,111,23,150,0,0));
		heros.add(new Hero("Haste",1089,0,5380,0,511,0,120,27,150,12,0));
		heros.add(new Hero("Holiday Yufine",1119,0,6266,0,627,0,109,15,150,0,0));
		heros.add(new Hero("Hurado",930,0,4572,0,585,0,111,35,150,0,0));
		heros.add(new Hero("Iseria",1158,0,6002,0,553,0,112,23,150,0,0));
		heros.add(new Hero("Jecht",796,0,3925,0,599,0,106,15,150,0,0));
		heros.add(new Hero("Jena",1063,0,4491,0,599,0,101,19,150,18,0));
		heros.add(new Hero("Judge Kise",1039,0,5340,0,617,0,115,27,150,18,0));
		heros.add(new Hero("Judith",848,0,4289,0,494,0,117,27,150,18,0));
		heros.add(new Hero("Karin",1188,0,4855,0,508,0,113,23,150,0,0));
		heros.add(new Hero("Kawerik",1305,0,4248,0,652,0,119,35,150,0,0));//12%Crit
		heros.add(new Hero("Kayron",1119,0,5340,0,483,0,129,35,150,0,0));//12%Crit
		heros.add(new Hero("Ken",966,0,7323,0,657,0,102,15,150,0,0));
		heros.add(new Hero("Khawazu",1119,0,6091,0,594,0,100,15,150,0,0));
		heros.add(new Hero("Khawana",957,0,4653,0,515,0,123,27,150,18,0));
		heros.add(new Hero("Kikirat V2",667,0,5704,0,749,0,90,15,150,0,18));
		heros.add(new Hero("Kiris",857,0,5057,0,543,0,110,15,150,30,0));
		heros.add(new Hero("Kise",1283,0,5138,0,522,0,116,23,150,0,0));
		heros.add(new Hero("Kitty Clarissa",957,0,5057,0,592,0,112,23,150,18,0));
		heros.add(new Hero("Kizuna Ai",576,0,5700,0,743,0,88,15,150,0,0));
		heros.add(new Hero("Krau",839,0,6405,0,752,0,100,15,150,0,18));
		heros.add(new Hero("Landy",1158,0,6002,0,553,0,112,23,150,0,0));
		heros.add(new Hero("Last Rider Krau",839,0,6405,0,752,0,100,15,150,0,18));
		heros.add(new Hero("Lena",951,0,5517,0,583,0,104,65,150,0,0));
		heros.add(new Hero("Leo",930,0,5380,0,564,0,112,15,150,30,0));
		heros.add(new Hero("Lidica",1283,0,4976,0,536,0,124,15,150,16,0));//16%Eff
		heros.add(new Hero("Lilias",821,0,6751,0,648,0,110,15,150,18,0));
		heros.add(new Hero("Lilibet",1119,0,6266,0,627,0,109,27,150,0,0));//12%Crit
		heros.add(new Hero("Little Queen Charlotte",1119,0,6266,0,627,0,109,15,150,0,0));
		heros.add(new Hero("Lots",603,0,4945,0,662,0,101,15,150,0,18));
		heros.add(new Hero("Ludwig",1412,0,4248,0,645,0,112,15,150,0,0));
		heros.add(new Hero("Luluca",1316,0,4777,0,715,0,108,15,150,34,0));//16%Eff
		heros.add(new Hero("Luna",1119,14,6266,0,627,0,109,45,150,0,0));//14%Atk
		heros.add(new Hero("Maid Chloe",640,0,5297,0,680,0,104,15,150,12,0));
		heros.add(new Hero("Martial Artist Ken",1359,0,5542,0,585,0,105,23,150,0,0));
		heros.add(new Hero("Mascot Hazel",762,0,4417,0,661,0,101,15,150,0,0));
		heros.add(new Hero("Maya",821,0,6796,0,648,0,112,15,150,18,0));
		heros.add(new Hero("Melissa",1412,0,4248,0,645,0,112,15,150,0,0));
		heros.add(new Hero("Mercedes",1187,0,4491,0,627,0,101,27,160,0,0));
		heros.add(new Hero("Mercenary Helga",1000,0,4895,0,518,0,114,23,150,0,0));
		heros.add(new Hero("Mirsa",885,0,4410,0,501,0,120,27,150,18,0));
		heros.add(new Hero("Mistychain",1244,0,3925,0,606,0,109,15,150,0,0));
		heros.add(new Hero("Mucacha",1000,0,4895,0,518,0,114,23,150,0,0));
		heros.add(new Hero("Mui",1039,0,5340,0,617,0,115,27,150,18,0));
		heros.add(new Hero("Nemunas",920,0,4855,0,525,0,110,27,150,0,0));
		heros.add(new Hero("Otillie",885,0,4693,0,617,0,110,15,150,18,18));
		heros.add(new Hero("Pavel",1283,0,4976,0,536,0,124,15,150,0,0));
		heros.add(new Hero("Purrgis",1119,0,6091,0,594,0,100,15,150,0,0));
		heros.add(new Hero("Pyllis",685,0,6463,0,703,0,91,15,150,0,0));
		heros.add(new Hero("Ravi",966,14,7323,0,657,0,102,15,150,0,0));//14%Atk
		heros.add(new Hero("Ray",694,0,4450,0,655,0,110,15,150,0,30));
		heros.add(new Hero("Remnant Violet",1283,0,5138,0,522,0,116,23,150,0,0));
		heros.add(new Hero("Requiemroar",827,0,4046,0,613,0,106,15,150,0,0));
		heros.add(new Hero("Researcher Carrot",1039,0,3925,0,606,0,110,27,150,0,0));
		heros.add(new Hero("Righteous Thief Roozid",812,0,4370,0,462,0,114,27,150,12,0));
		heros.add(new Hero("Rima",822,0,4693,0,561,0,117,27,150,0,0));
		heros.add(new Hero("Rin",594,0,4989,0,652,0,102,15,150,34,0));//16%Eff
		heros.add(new Hero("Roaming Warrior Leo",1088,0,5016,0,553,0,111,15,150,18,0));
		heros.add(new Hero("Roana",621,0,5474,0,798,0,98,15,150,0,0));
		heros.add(new Hero("Romann",1109,0,4329,0,655,0,105,15,150,30,0));//10Speed
		heros.add(new Hero("Rose",821,0,6266,0,703,0,97,15,150,0,12));//10Speed
		heros.add(new Hero("Ruele of Light",621,0,5474,0,798,0,98,15,150,0,0));
		heros.add(new Hero("Sage Baal and Sezan",1039,0,5299,0,673,0,115,15,150,18,18));
		heros.add(new Hero("Schuri",1068,0,5650,0,536,0,110,23,150,0,0));
		heros.add(new Hero("Seaside Bellona",1182,0,5299,0,571,0,114,15,150,18,0));
		heros.add(new Hero("Serila",1218,14,4521,0,683,0,106,15,150,18,0));//14%Atk
		heros.add(new Hero("Sez",1228,0,6266,0,473,0,113,23,150,0,0));
		heros.add(new Hero("Shadow Rose",889,0,5784,0,610,0,107,23,150,16,0));//16%Eff
		heros.add(new Hero("Shooting Star Achates",576,0,5700,0,743,0,88,15,150,0,0));
		heros.add(new Hero("Sigret",1228,14,5784,0,553,0,109,23,166,0,0));//14%Atk
		heros.add(new Hero("Silk",1188,0,4693,0,518,0,121,15,150,0,0));
		heros.add(new Hero("Silver Blade Aramintha",1197,0,4572,0,683,0,106,15,150,30,0));
		heros.add(new Hero("Sinful Angelica",649,0,4248,0,631,0,108,15,150,0,30));
		heros.add(new Hero("Sol Badguy",1177,0,5542,0,553,0,119,27,150,0,0));
		heros.add(new Hero("Specimen Sez",1228,0,6266,0,473,0,113,23,150,0,0));
		heros.add(new Hero("Specter Tenebria",1197,0,4572,0,683,0,106,15,150,30,0));
		heros.add(new Hero("Surin",1010,0,5097,0,497,0,117,23,150,12,0));
		heros.add(new Hero("Sven",1039,0,5517,0,452,0,108,23,150,0,0));
		heros.add(new Hero("Tamarinne",932,0,4370,0,652,0,108,15,150,0,0));
		heros.add(new Hero("Taranor Guard",951,0,5517,0,583,0,104,65,150,0,0));
		heros.add(new Hero("Taranor Royal Guard",682,0,6463,0,617,0,90,15,150,0,0));
		heros.add(new Hero("Tempest Surin",1010,0,5097,0,497,0,117,23,150,12,0));
		heros.add(new Hero("Tenebria",1359,0,4895,0,652,0,110,23,150,0,0));
		heros.add(new Hero("Tieria",839,0,5517,0,591,0,100,15,150,0,0));
		heros.add(new Hero("Top Model Luluca",1228,0,4370,0,662,0,115,27,150,0,0));
		heros.add(new Hero("Troublemaker Crozet",776,0,6021,14,718,0,98,15,150,0,18));//14%HP
		heros.add(new Hero("Tywin",821,0,6751,14,648,0,110,15,150,18,0));//14%HP
		heros.add(new Hero("Vildred",1283,0,5138,0,522,0,116,23,150,0,0));
		heros.add(new Hero("Violet",1228,0,6266,0,473,0,113,23,150,0,0));
		heros.add(new Hero("Vivian",1228,0,4370,14,662,0,115,27,150,0,0));//14%HP
		heros.add(new Hero("Wanderer Silk",930,0,5380,0,564,0,112,15,150,30,0));//10Speed
		heros.add(new Hero("Watcher Schuri",970,0,5935,0,557,0,106,27,150,0,0));
		heros.add(new Hero("Yufine",1228,0,5784,0,553,0,109,23,166,16,0));//16%Eff
		heros.add(new Hero("Yuna",1158,0,6002,0,553,0,112,23,150,0,0));//10Speed
		heros.add(new Hero("Zeno",1039,0,5299,0,673,0,115,15,150,18,18));
		heros.add(new Hero("Zerato",1159,0,4733,0,627,0,104,27,150,18,0));
		return heros;
	}

	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getPattack() {
		return pattack;
	}

	public int getHealth() {
		return health;
	}

	public int getPhealth() {
		return phealth;
	}

	public int getDefense() {
		return defense;
	}

	public int getPdefense() {
		return pdefense;
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
	
}