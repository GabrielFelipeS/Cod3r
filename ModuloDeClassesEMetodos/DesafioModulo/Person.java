package ModuloDeClassesEMetodos.DesafioModulo;

public class Person {
	String name;
	double weight;
	
	
	public Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}


	void eat(Food food) {
		if(food != null) {
			this.weight += food.weight;
		}
	}
}
