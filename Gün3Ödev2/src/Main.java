
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.userName = "Erencan Bilge";
		student1.userNumber = "2003777";
		Student student2 = new Student();
		student2.userName = "Mertcan Eken";
		student2.userNumber = "3002777";
		Instructer instructer1 = new Instructer();
		instructer1.userName = "Engin Demiroğ";
		instructer1.userNumber = "5008888";
		
		
		InstructerManager instructerManager = new InstructerManager();
		StudentManager studentManager = new StudentManager();
		

studentManager.add(student1);
studentManager.add(student2);
instructerManager.add(instructer1);

				
				
		

	}

}
