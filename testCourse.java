package Vjezbe;

public class testCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course math = new Course("Math");
		Course engl = new Course("Engl");
		math.addStudent("Mark");
		math.addStudent("Aki");
		math.addStudent("Cuni");
		math.addStudent("Happy");
		math.addStudent("Osman");
		System.out.println(math.getNumberOfStudents());
		System.out.println(math.getCourseName());
		
		String[] list = math.getStudents();
		for(int i = 0; i < math.getNumberOfStudents(); i++){
			System.out.print(list[i] + ", ");
		}
		System.out.println();
		String[] cloneStudent = math.getStudents().clone();
		for(int i = 0; i < math.getNumberOfStudents(); i++){
			System.out.print(cloneStudent[i] + ", ");
		}
		System.out.println();
		System.out.println(list.equals(cloneStudent));
		System.out.println(list == cloneStudent);
		
		math.dropStudent("Osman");
		for(int i = 0; i < math.getNumberOfStudents(); i++){
			System.out.print(list[i] + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < cloneStudent.length; i++){
			if(cloneStudent[i] == null)
				break;
			System.out.print(cloneStudent[i] + ", ");
		}
		
		String[] engCourse = cloneStudent;
		
	}
}
