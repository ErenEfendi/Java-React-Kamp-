
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# kursu", "Engin Demiroð", "2 Ay");
		
		
		Course course2 = new Course(2, "Java + React kursu", "Engin Demiroð", "2 Ay");
		
		Course[] courses = {course1,course2};
		System.out.println("___KURSLAR___");
		
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println(course.instructer);
			System.out.println(course.time);
			
			System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		}
		
		
		
		Student student1 = new Student(1,"Erencan Bilge","Yaþ : 18");
		Student student2 = new Student(2,"Mertcan Eken","Yaþ : 18");
		
		Student[] students = {student1,student2};
		System.out.println("___ÖÐRENCÝLER___");
		
		for (Student student : students) {
			System.out.println(student.name);
			System.out.println(student.age);
			
			
			CourseManagement coursemanagement = new CourseManagement();
					coursemanagement.addToCourse(course1);
					
					coursemanagement.addToCourse(course2);
					System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
			
			
			
		}
		
		

	}

}
