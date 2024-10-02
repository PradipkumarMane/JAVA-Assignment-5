package Assignment1;

public class Student {
	private String name;
	private int age;
	private String address;

	public Student() {
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("Alice", 20);
		students[1].setInfo("Bob", 22, "123 Main St");
		students[2].setInfo("Charlie", 19);
		students[3].setInfo("David", 21, "456 Oak St");
		students[4].setInfo("Eva", 23);
		students[5].setInfo("Frank", 24, "789 Pine St");
		students[6].setInfo("Grace", 25);
		students[7].setInfo("Hank", 18, "321 Birch St");
		students[8].setInfo("Ivy", 20);
		students[9].setInfo("Jack", 22, "987 Cedar St");

		for (Student student : students) {
			student.displayInfo();
		}
	}
}
