package Vjezbe;

public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

		public Course(String courseName) {
			this.courseName = courseName;
			}

		public void addStudent(String student) {
			students[numberOfStudents] = student;
			numberOfStudents++;
			}
			
		public String[] getStudents() {
			return students;
			}

		public int getNumberOfStudents() {
			return numberOfStudents;
			}
		
		public String getCourseName() {
			return courseName;
			}
		
		@Override
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
		//	Course courseClone = (Course) super.clone();
		//	courseClone.students = students.clone();
		//	return courseClone;
		//}
		
		public void dropStudent(String student) {
			for(int i = 0; i < getNumberOfStudents(); i++){
				if(students[i] == student){
					students[i] = students[i + 1];
					i++;
					numberOfStudents--;
					}
				}
			}
		}
