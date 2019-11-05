package exercise1;

class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getage() {
		return age;
	}
	
	public void afficher() {
		System.out.println(this.name +" est agé de "+this.age+" ans");
	}
}
