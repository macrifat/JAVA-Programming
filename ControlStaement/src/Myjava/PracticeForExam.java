package Myjava;

public class PracticeForExam extends Student {
	
	String examForStudent = "math";

//	public class Student{
//		
//		int studentId;
//		String studentName;
//	
//		}
	
	public static void main(String[] args) {
		
		PracticeForExam ex =new PracticeForExam();
		ex.examForStudent="Mathematics";
		ex.salary=1000;
		System.out.println(ex.examForStudent+","+ex.salary);

	}

}

