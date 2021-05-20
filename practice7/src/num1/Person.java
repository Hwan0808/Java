package num1;
import java.util.Objects;

public class Person {
	private String name = "";
	
	public Person (String name) {
		this.name = name;
	}
	
	public boolean equals(Person p) {
		
		if(this.name.equals(p.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Person p1 = new Person("È«±æµ¿");
		System.out.println(p1.equals(new Person("È«±æµ¿")));
		System.out.println(p1.equals(new Person("ÃÖ¿µÅÂ")));
	}

}
