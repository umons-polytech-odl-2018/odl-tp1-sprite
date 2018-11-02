package exercise2;

class Person {
	public static int getPopulationSize;
	private static int populationsize= 0;
	private static long totalAge= 0;
	public int age;


	public Person(int age) {
		this.age = age;
		populationsize++;
		totalAge += age;
	}
	public static int getPopulation(){
		return populationsize;
	}

	public static float computePopulationAverage(){
		return (float) totalAge/populationsize;
	}

	public static void resetPopulation()  {
		populationsize = 0;
	}
}
