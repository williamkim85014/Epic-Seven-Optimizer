import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Main {
	static int CPULimit = 8;
	static String heroName = "Briar Witch Iseria";
	static String build = "";
	static int artifactAttack = 0;
	static int artifactHealth = 0;
	static int requiredSpeed = 100;
	static int requiredCrit = 100;
	static int requiredEff = 0;
	static int indexWeapon = 0;
	static boolean specific = true;
	static String finalValue = "";
	static Hero hero;
	static ArrayList<Equipment> weapons;
	static ArrayList<Equipment> helmets;
	static ArrayList<Equipment> armors;
	static ArrayList<Equipment> necklaces;
	static ArrayList<Equipment> rings;
	static ArrayList<Equipment> boots;
	static int totalAmount;
	static int cycleCounter;
	static double score;
	static ArrayList<FinalSet> finalSets = new ArrayList<FinalSet>();
	static int loadingIndex = 1;
	static int loadingTotal;

	public static void main(String[] args) throws InterruptedException {
		int i = 1;
		System.out.println("START");
		for (Equipment weapon : weapons) {
			for (Equipment weapon2 : helmets) {
				for (Equipment weapon3 : armors) {
					for (Equipment weapon4 : necklaces) {
						for (Equipment weapon5 : rings) {
							for (Equipment weapon6 : boots) {
		weapons = Equipment.getWeapons(build, specific);
		helmets= Equipment.getHelmets(build, specific);
		armors = Equipment.getArmors(build, specific);
		necklaces = Equipment.getNecklaces(build, specific);
		rings = Equipment.getRings(build, specific);
		boots = Equipment.getBoots(build, specific);

								
							}
							
						}
						
					}
					
				}
				
			}
		}
			System.out.println(i++);
			
	}



	public static void addListSet(double score, String value) {
		finalSets.add(new FinalSet(score, value));
	}
}
