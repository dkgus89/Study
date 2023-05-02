package staticex;

public class Student2 {

	public static void main(String[] args) {
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.getSerialNum());	//serialNum 변수의 초깃값 출력
		System.out.println(studentLee.studentName+" 학번: "+studentLee.studentID);
		
		Student1 studentSon=new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.getSerialNum());
		System.out.println(studentSon.studentName+" 학번: "+studentSon.studentID);
		
		
		

	}

}
