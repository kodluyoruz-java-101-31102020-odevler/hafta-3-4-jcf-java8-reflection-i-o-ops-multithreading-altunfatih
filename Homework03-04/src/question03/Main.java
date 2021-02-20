package question03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("No giriniz: ");
		int studentNo = Integer.parseInt(scanner.nextLine());

		System.out.println("İsim giriniz: ");
		String name = scanner.nextLine();

		System.out.println("Soyisim giriniz: ");
		String surname = scanner.nextLine();

		System.out.println("Yaş giriniz: ");
		int age = Integer.parseInt(scanner.nextLine());
		
		Student student1 = new Student(studentNo, name, surname, age);
		
		System.out.println(student1.toString());
		
		Map<Student, Integer> studentMap = new HashMap<Student, Integer>();		
		studentMap.put(new Student(100, "Ahmet", "Kiraz", 24), studentNo);		
	}

}
