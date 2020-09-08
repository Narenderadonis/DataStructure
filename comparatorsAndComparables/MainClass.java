package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(23,"Ram"));
		students.add(new Student(24,"shyam"));
		students.add(new Student(25,"aman"));
		students.add(new Student(26,"anuj"));
		students.add(new Student(27,"naren"));
		Collections.sort(students);
		students.forEach(System.out::println);

	}

}
