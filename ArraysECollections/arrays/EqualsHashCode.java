package ArraysECollections.arrays;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Pedro Silva");
		Usuario u2 = new Usuario("Pedro Silva");
		System.out.println(u1 == u2);
		System.out.println(u1.hashCode() == u2.hashCode());
		System.out.println(u1.equals(u2));
	}
}
