package Test;

public class ManageForSt {
	
	int semester;
	String name;
	String assignment;
	String test;
	double score;
	
	public ManageForSt(int sem, String n, String a, String t, double s) {
		semester = sem;
		name = n;
		assignment = a;
		test = t;
		score = s;
	}
	
	public void stuinfo() {
		System.out.println("학생 정보");
		System.out.println("1. 이름: "+name);
		System.out.println("2. 학기: "+semester+"학기");
		System.out.println("3. 학점: "+score+"/4.3");
	}
	
	public void stutodolist() {
		System.out.println("과제 및 시험 일정");
		System.out.println("1. 과제 일정: "+assignment);
		System.out.println("2. 시험 일정: "+test);
	}
}
