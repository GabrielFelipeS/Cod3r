package ModuloDeClassesEMetodos.DesafioModulo;

public class Jantar {
	public static void main(String[] args) {
		Person person = new Person("Gabriel", 49.0);
		Food food = new Food("Banana", 0.08);
		
		System.out.println("Person's weight after eat: " + person.weight);
		person.eat(food);
		System.out.println("Person's weight before eat: " + person.weight);
	}
}
