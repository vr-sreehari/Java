package OOP;

enum Level {
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");

	private String abbr;

	Level(String ab) {
		abbr = ab;
	}

	public String getAbr() {
		return abbr;
	}
}

public class Enumeration {

	public static void main(String[] args) {
		Level l1 = Level.BEGINNER;
		System.out.println(l1.getAbr());
		System.out.println(l1);

	}

}
