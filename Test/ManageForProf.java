package Test;

public class ManageForProf {
	
	String faculty;
	String name;
	String lecture;
	
	public ManageForProf(String f, String n, String l) {
		faculty = f;
		name = n;
		lecture = l;
	}
	
	public void profinfo() {
		System.out.println("1. 학부: "+faculty);
		System.out.println("2. 성함: "+name);
		System.out.println("3. 진행 강의: "+lecture);
	}
}

