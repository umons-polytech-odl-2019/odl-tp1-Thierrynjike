package exercise1;
import java.util.*;

public class Exercise1 {
	
	static Person createPerson(String name, int age) {
		Person p=new Person(name,age);
		return p;
	}

	public static void main(String[] args) {
		String nom=args[0];
		String ag=args[1];
		int age=Integer.parseInt(ag);
		Person P;
		P=createPerson(nom,age);
		P.afficher();
		
	}
}
