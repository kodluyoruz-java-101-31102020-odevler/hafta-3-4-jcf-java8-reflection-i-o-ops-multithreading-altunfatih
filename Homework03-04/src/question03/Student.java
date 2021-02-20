package question03;

import java.io.Serializable;

class Student implements Serializable{
	private static int studentNo;
	private static String name;
	private static String surname;
	private static int age;
	
	public Student() {
		
	}
	
	public Student(int studentNo, String name, String surname, int age) {
		this.studentNo = studentNo;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public static int getStudentNo() {
		return studentNo;
	}

	public static void setStudentNo(int studentNo) {
		Student.studentNo = studentNo;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public static String getSurname() {
		return surname;
	}

	public static void setSurname(String surname) {
		Student.surname = surname;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Student.age = age;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getStudentNo());
		builder.append("-");
		builder.append(this.getName());
		builder.append("-");
		builder.append(this.getSurname());
		builder.append("-");
		builder.append(this.getAge());
		builder.append("]");
		return builder.toString();
	}
}