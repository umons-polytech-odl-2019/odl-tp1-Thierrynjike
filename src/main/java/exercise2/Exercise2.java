package exercise2;

//import exercise1.Person;

public class Exercise2 {
	static int i=0,ageaver=0;
	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.
	static Person createPerson(int age) {
		Person p=new Person(age);
		i++;
		ageaver+=age;
		return p;
	}


	static int computePopulationSize() {
		// TODO remove comment when implemented
		// return Person.computePopulationSize();
		return i;
	}

	static float computeAveragePopulationAge() {
		// TODO remove comment when implemented
		// return Person.computeAveragePopulationAge()
		float a=ageaver/i;
		int tmp=ageaver*100;
		float outp=tmp/100f;
		return outp;
	}

	static void resetPopulation() {
		// TODO remove comment when implemented
		// Person.resetPopulation();
		i=0;ageaver=0;
	}
}
