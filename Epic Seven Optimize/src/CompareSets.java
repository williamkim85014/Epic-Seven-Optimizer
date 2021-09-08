import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

class CompareSets extends Thread{
	Equipment weapon;
	String build = "";
	boolean specific = true;
	int requiredSpeed = 0;
	int requiredCrit = 0;
	int requiredEff = 0;
	int indexWeapon = 0;
	int baseattack = 0;
	int basepattack = 0;
	int basedefense = 0;
	int basepdefense = 0;
	int basehealth = 0;
	int basephealth = 0;
	int basespeed = 0;
	int basepcrit = 0;
	int basedcrit = 0;
	int baseeff = 0;
	int baseres = 0;	
	int artifactAttack = 0;
	int artifactHealth = 0;
	private CountDownLatch limit;
	private CountDownLatch total;
	int loadingIndex;
	int loadingTotal;
	CompareSets(boolean specific, int requiredSpeed, int requiredCrit, int requiredEff, Hero hero, int artifactAttack, int artifactHealth, String build, Equipment weapon, int indexWeapon, CountDownLatch limit, CountDownLatch total, int loadingTotal, int loadingIndex){
		this.weapon = weapon;
		this.build = build;
		this.specific = specific;
		this.indexWeapon = indexWeapon;
		this.limit = limit;
		this.total = total;
		this.baseattack = hero.getAttack();
		this.basepattack = hero.getPattack();
		this.basedefense = hero.getDefense();
		this.basepdefense = hero.getPdefense();
		this.basehealth = hero.getHealth();
		this.basephealth = hero.getPhealth();
		this.basespeed = hero.getSpeed();
		this.basepcrit = hero.getPcrit();
		this.basedcrit = hero.getDcrit();
		this.baseeff = hero.getEff();
		this.baseres = hero.getRes();
		this.attack = weapon.getAttack();
		this.pattack = weapon.getPattack();
		this.defense = weapon.getDefense();
		this.pdefense = weapon.getPdefense();
		this.health = weapon.getHealth();
		this.phealth = weapon.getPhealth();
		this.speed = weapon.getSpeed();
		this.pcrit = weapon.getPcrit();
		this.dcrit = weapon.getDcrit();
		this.eff = weapon.getEff();
		this.res = weapon.getRes();
		this.artifactAttack = artifactAttack;
		this.artifactHealth = artifactHealth;
		this.requiredSpeed = requiredSpeed;
		this.requiredCrit = requiredCrit;
		this.requiredEff = requiredEff;
		this.loadingIndex = loadingIndex;
		this.loadingTotal = loadingTotal;
	}

	int attack = 0;
	double pattack = 0;
	int defense = 0;
	double pdefense = 0;
	int health = 0;
	double phealth = 0;
	int speed = 0;
	double pcrit = 0;
	double dcrit = 0;
	int eff = 0;
	int res = 0;

	int tfattack = 0;
	double tfpattack = 0;
	int tfdefense = 0;
	double tfpdefense = 0;
	int tfhealth = 0;
	double tfphealth = 0;
	int tfspeed = 0;
	double tfpcrit = 0;
	double tfdcrit = 0;
	int tfeff = 0;
	int tfres = 0;

	int finalattack = 0;
	double finalpattack = 0;
	int finaldefense = 0;
	double finalpdefense = 0;
	int finalhealth = 0;
	double finalphealth = 0;
	int finalspeed = 0;
	double finalpcrit = 0;
	double finaldcrit = 0;
	int finaleff = 0;
	int finalres = 0;

	int setCritical = 0;
	int setHit = 0;
	int setSpeed = 0;
	int setAttack = 0;
	int setHealth = 0;
	int setDefense = 0;
	int setResist = 0;
	int setDestruction = 0;
	int setLifeSteal = 0;
	int setCounter = 0;
	int setUnity = 0;
	int setImmunity = 0;
	int setRage = 0;

	int indexHelmet = 0;
	int indexArmor = 0;
	int indexNecklace = 0;
	int indexRing = 0;
	int indexBoot = 0;

	String indexText = "";
	int indexCycle = 1;

	double score = -1;
	double tscore;

	double critValue = 1;
	double speedValue = 0;
	double attackValue = 0;
	double healthValue = 0;
	double defenseValue = 0;
	double effValue = 0;
	double resValue = 0;
	double fastValue = 0;

	@Override
	public void run() {
		ArrayList<Equipment> helmets = Equipment.getHelmets(build, specific);
		ArrayList<Equipment> armors = Equipment.getArmors(build, specific);
		ArrayList<Equipment> necklaces = Equipment.getNecklaces(build, specific);
		ArrayList<Equipment> rings = Equipment.getRings(build, specific);
		ArrayList<Equipment> boots = Equipment.getBoots(build, specific);
		int totalCycles = (helmets.size());
		for (Equipment helmet : helmets) {
			indexHelmet = helmet.getId();
			System.out.println("Loading..."+loadingIndex+"/" + loadingTotal + " " + indexCycle++ + "/" + totalCycles);
			for (Equipment armor : armors) {
				indexArmor = armor.getId();
				for (Equipment necklace : necklaces) {
					indexNecklace = necklace.getId();
					for (Equipment ring : rings) {
						indexRing = ring.getId();
						for (Equipment boot : boots) {
							tfattack = baseattack + artifactAttack + attack + helmet.getAttack() + armor.getAttack() + necklace.getAttack() + ring.getAttack() + boot.getAttack();
							tfpattack = basepattack + pattack + helmet.getPattack() + armor.getPattack() + necklace.getPattack() + ring.getPattack() + boot.getPattack();
							tfdefense = basedefense + defense + helmet.getDefense() + armor.getDefense() + necklace.getDefense() + ring.getDefense() + boot.getDefense();
							tfpdefense = basepdefense + pdefense + helmet.getPdefense() + armor.getPdefense() + necklace.getPdefense() + ring.getPdefense() + boot.getPdefense();
							tfhealth = basehealth + artifactHealth + health + helmet.getHealth() + armor.getHealth() + necklace.getHealth() + ring.getHealth() + boot.getHealth();
							tfphealth = phealth + helmet.getPhealth() + armor.getPhealth() + necklace.getPhealth() + ring.getPhealth() + boot.getPhealth();
							tfspeed = basespeed + speed + helmet.getSpeed() + armor.getSpeed() + necklace.getSpeed() + ring.getSpeed() + boot.getSpeed();
							tfpcrit = basepcrit + pcrit + helmet.getPcrit() + armor.getPcrit() + necklace.getPcrit() + ring.getPcrit() + boot.getPcrit();
							tfdcrit = basedcrit + dcrit + helmet.getDcrit() + armor.getDcrit() + necklace.getDcrit() + ring.getDcrit() + boot.getDcrit();
							tfeff = baseeff + eff + helmet.getEff() + armor.getEff() + necklace.getEff() + ring.getEff() + boot.getEff();
							tfres = baseres + res + helmet.getRes() + armor.getRes() + necklace.getRes() + ring.getRes() + boot.getRes();
							indexBoot = boot.getId();
							useBuild(build, weapon, helmet, armor, necklace, ring, boot);
						}
					}
				}
			}
		}
		String finalValue = "";
		int finaltotalattack = (int)(finalattack+(finalpattack*(baseattack/100)));
		int finaltotaldefense = (int)(finaldefense+(finalpdefense*(basedefense/100)));
		int finaltotalhealth = (int)(finalhealth+(finalphealth*(basehealth/100)));
		finalValue += ".......................\n";
		finalValue += indexText+"\n";
		finalValue += "Attack "+ ((int)finaltotalattack)+"\n";
		finalValue += "Critical Chance = "+ (int)finalpcrit+"\n";
		finalValue += "Critical Damage = "+ (int)finaldcrit+"\n";
		finalValue += "Speed = "+ finalspeed+"\n";
		finalValue += "Defense "+(int)(finaltotaldefense)+"\n";
		finalValue += "Health "+(int)(finaltotalhealth)+"\n";
		finalValue += "EFF "+finaleff+"%"+"\n";
		finalValue += "ER "+finalres+"%"+"\n";
		finalValue += "Score "+(int)score+"\n.......................";
		Main.addListSet(score,finalValue);
		limit.countDown();
		total.countDown();
	}

	/*
	public void useBuild(String build, Equipment weapon, Equipment helmet, Equipment armor, Equipment necklace, Equipment ring, Equipment boot) {
		critValue = 1;
		speedValue = 0;
		attackValue = 0;
		healthValue = 0;
		defenseValue = 0;
		effValue = 0;
		resValue = 0;
		fastValue = 0;
		if ((weapon.getSetCounter() + helmet.getSetCounter() + armor.getSetCounter() + necklace.getSetCounter() + ring.getSetCounter() + boot.getSetCounter()) < 4) return;
		if (tfspeed < requiredSpeed) return;
		if (tfpcrit < requiredCrit) return;
		if (tfpcrit >= 100) tfpcrit = 100;
		tfpcrit += ((int)((weapon.getSetCritical() + helmet.getSetCritical() + armor.getSetCritical() + necklace.getSetCritical() + ring.getSetCritical() + boot.getSetCritical() - 0.1)/2))*12;
		if (tfdcrit >= 350) tfdcrit = 350;
		critValue = (tfpcrit/100)*(tfdcrit/100);
		tfpdefense += ((int)((weapon.getSetDefense() + helmet.getSetDefense() + armor.getSetDefense() + necklace.getSetDefense() + ring.getSetDefense() + boot.getSetDefense()-0.1)/2))*15;
		tfphealth += ((int)((weapon.getSetHealth() + helmet.getSetHealth() + armor.getSetHealth() + necklace.getSetHealth() + ring.getSetHealth() + boot.getSetHealth()-0.1)/2))*15;
		healthValue += ((basehealth*(tfphealth/100))+tfhealth);
		defenseValue += ((basedefense*(tfpdefense/100))+tfdefense);
		
		tscore = ((healthValue*(defenseValue+600))/600)+((healthValue*critValue)*3);
		
		if (tscore > score){
			score = tscore;
			assignTemporalValues();
		}
		return;
	}
	*/
	
	
//	/*
	public void useBuild(String build, Equipment weapon, Equipment helmet, Equipment armor, Equipment necklace, Equipment ring, Equipment boot) {
		critValue = 1;
		speedValue = 0;
		attackValue = 0;
		healthValue = 0;
		defenseValue = 0;
		effValue = 0;
		resValue = 0;
		fastValue = 0;
		if (build.contains("Lifesteal")) {
			if ((weapon.getSetLifesteal() + helmet.getSetLifesteal() + armor.getSetLifesteal() + necklace.getSetLifesteal() + ring.getSetLifesteal() + boot.getSetLifesteal()) < 4) return;
		}
		if (build.contains("Counter")) {
			if ((weapon.getSetCounter() + helmet.getSetCounter() + armor.getSetCounter() + necklace.getSetCounter() + ring.getSetCounter() + boot.getSetCounter()) < 4) return;
		}
		if (build.contains("Immunity")) {
			if ((weapon.getSetImmunity() + helmet.getSetImmunity() + armor.getSetImmunity() + necklace.getSetImmunity() + ring.getSetImmunity() + boot.getSetImmunity()) < 2) return;
		}
		if (build.contains("Rage")) {
			if ((weapon.getSetRage() + helmet.getSetRage() + armor.getSetRage() + necklace.getSetRage() + ring.getSetRage() + boot.getSetRage()) < 4) return;
		}
		if (build.contains("Crit") || requiredCrit != 0) {
			tfpcrit += ((int)((weapon.getSetCritical() + helmet.getSetCritical() + armor.getSetCritical() + necklace.getSetCritical() + ring.getSetCritical() + boot.getSetCritical() - 0.1)/2))*12;
			tfdcrit += ((int)((weapon.getSetDestruction() + helmet.getSetDestruction() + armor.getSetDestruction() + necklace.getSetDestruction() + ring.getSetDestruction() + boot.getSetDestruction()-0.26)/4))*40;
			if (tfpcrit >= 100) tfpcrit = 100;
			if (tfpcrit < requiredCrit) return;
			if (tfdcrit >= 350) tfdcrit = 350;
			critValue = (tfpcrit/100)*(tfdcrit/100);
		}
		if (build.contains("Fast") || build.contains("Speed") || requiredSpeed != 0) {
			if ((weapon.getSetSpeed() + helmet.getSetSpeed() + armor.getSetSpeed() + necklace.getSetSpeed() + ring.getSetSpeed() + boot.getSetSpeed()) >= 4) {
				tfspeed += (basespeed*0.25);
			}
			if (tfspeed < requiredSpeed) return;
			speedValue = tfspeed*0.0025;
			if (build.contains("Fast")) {
				fastValue = tfspeed*65;
			}
		}
		if (build.contains("Attack")) {
			tfpattack += ((int)((weapon.getSetAttack() + helmet.getSetAttack() + armor.getSetAttack() + necklace.getSetAttack() + ring.getSetAttack() + boot.getSetAttack()-0.26)/4))*35;
			attackValue = ((baseattack*(tfpattack/100))+tfattack)*5.4;
		}
		if (build.contains("Health")) {
			tfphealth += ((int)((weapon.getSetHealth() + helmet.getSetHealth() + armor.getSetHealth() + necklace.getSetHealth() + ring.getSetHealth() + boot.getSetHealth()-0.1)/2))*15;
			healthValue = (basehealth*(tfphealth/100))+tfhealth;
		}
		if (build.contains("Defense")) {
			tfpdefense += ((int)((weapon.getSetDefense() + helmet.getSetDefense() + armor.getSetDefense() + necklace.getSetDefense() + ring.getSetDefense() + boot.getSetDefense()-0.1)/2))*15;
			defenseValue = ((basedefense*(tfpdefense/100))+tfdefense)*9;
		}
		if (build.contains("Eff") || requiredEff != 0) {
			tfeff += ((int)((weapon.getSetHit() + helmet.getSetHit() + armor.getSetHit() + necklace.getSetHit() + ring.getSetHit() + boot.getSetHit()-0.1)/2))*20;
			if (tfeff < requiredEff) return;
			if (build.contains("Eff")) {
				effValue = tfeff*0.0015;
			}
//			if (effValue < 0.3) return;
		}
		if (build.contains("Res")) {
			tfres += ((int)((weapon.getSetResist() + helmet.getSetResist() + armor.getSetResist() + necklace.getSetResist() + ring.getSetResist() + boot.getSetResist()-0.1)/2))*20;
			resValue = tfres*0.0015;
//			resValue = tfres*0.003;
//			if (tfres < 185) return;
		}
		if (build.contains("Bulky")) {
			if (!build.contains("Health")) healthValue += ((basehealth*(tfphealth/100))+tfhealth)/3;
			if (!build.contains("Defense"))  defenseValue += ((basedefense*(tfpdefense/100))+tfdefense)*3;
		}
//		critValue = 1;
		int damage = (int)Math.floor((((baseattack*(tfpattack/100))+tfattack) * 0.255) + (((((baseattack*(tfpattack/100))+tfattack))*(tfdcrit/100))*0.42636));
		if (damage < 4000) return;
//		SSB on eggs A13
//		int damage = (int)Math.floor((((baseattack*(tfpattack/100))+tfattack) * 0.35) + (((((baseattack*(tfpattack/100))+tfattack))*(tfdcrit/100))*0.4363));
//		if (damage < 6104) return;
//		tscore = (((basehealth*(tfphealth/100))+tfhealth) * (((basedefense*(tfpdefense/100))+tfdefense)+300))/300;
//		Attack
//		tscore = (baseattack*(tfpattack/100))+tfattack;
//		Daydream Joker on W13
//		tscore = (((baseattack*(tfpattack/100))+tfattack) + 3747)*(tfdcrit/100);
		//BASE
//		tscore = (((basehealth*(tfphealth/100))+tfhealth)*(tfdcrit/100));
		tscore = tfspeed;
//		tscore =((attackValue + healthValue + defenseValue + fastValue)*(critValue)*(1+speedValue)*(1+effValue+resValue));
		if (tscore > score){
			score = tscore;
			assignTemporalValues();
		}
		return;
	}
//	*/

	public void assignTemporalValues(){
		finalattack = tfattack;
		finalpattack = tfpattack;
		finaldefense = tfdefense;
		finalpdefense = tfpdefense;
		finalhealth = tfhealth;
		finalphealth = tfphealth;
		finalspeed = tfspeed;
		finalpcrit = tfpcrit;
		finaldcrit = tfdcrit;
		finaleff = tfeff;
		finalres = tfres;
//		indexText = ""+(indexWeapon)+","+(indexHelmet+1)+","+(indexArmor+1)+","+(indexNecklace+1)+","+(indexRing+1)+","+(indexBoot+1);
		indexText = ""+(indexWeapon)+","+(indexHelmet)+","+(indexArmor)+","+(indexNecklace)+","+(indexRing)+","+(indexBoot);
	}

}