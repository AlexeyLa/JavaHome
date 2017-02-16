
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] studentIds = new int[]{1000,1001,1002};
		
		Student student1 = new Student(studentIds[0],"joan");
		student1.gender = "male";
		
		Student student2 = new Student(studentIds[1],"raj");
		student2.gender = "male";
		
		Student student3 = new Student(studentIds[2],"anita");
		student3.gender = "female";
		
		System.out.println(" Name of student 1 : " + student1.name);
		System.out.println(" Name of student 2 : " + student2.name);
		System.out.println(" Name of student 3 : " + student3.name);
		
		student1.updateProfile("john");
		
		System.out.println(" Name of student 1 : " + student1.name);
		
	}

}
