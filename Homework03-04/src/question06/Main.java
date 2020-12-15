package question06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static int studentNo;
	public static String name;
	public static String surname;
	public static int age;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("No giriniz: ");
		studentNo = Integer.parseInt(scanner.nextLine());

		System.out.println("İsim giriniz: ");
		name = scanner.nextLine();

		System.out.println("Soyisim giriniz: ");
		surname = scanner.nextLine();

		System.out.println("Yaş giriniz: ");
		age = Integer.parseInt(scanner.nextLine());

		try {
			writer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void writer() throws IOException {

		File file = new File("text.txt");

		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file))) {
			bWriter.write(studentNo);
			bWriter.newLine();
			bWriter.write(name);
			bWriter.newLine();
			bWriter.write(surname);
			bWriter.newLine();
			bWriter.write(age);
			bWriter.newLine();
			bWriter.close();
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

	public static void reader() throws FileNotFoundException {

		String filename = "text.txt";
		File textFile = new File(filename);
		Scanner in = new Scanner(textFile);
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		in.nextLine();
		int count = 2;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + " " + line);
			count++;
		}
		in.close();
	}
}
