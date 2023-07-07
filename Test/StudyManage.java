package Test;

public class StudyManage {
	
	public static void main(String[] args) {
		
		System.out.println("<학습관리-학생>");
		
		System.out.println("");
		ManageForSt stud1 = new ManageForSt(6, "Yoo JaeWon", "OOP HW(2023/04/07)", "Data Structure Test(2023/04/24)", 4.29);
		stud1.stuinfo();
		stud1.stutodolist();
		
		System.out.println("---------------------------");
		ManageForSt stud2 = new ManageForSt(7, "Im Changkyun", "Deep Learning HW(2023/04/07)", "OOP Test(2023/04/24)", 3.78);
		stud2.stuinfo();
		stud2.stutodolist();
		
		System.out.println("");
		System.out.println("<학습관리-교수님>");
		
		System.out.println("");
		ManageForProf prof1 = new ManageForProf("Artificial Intelligence", "YYI", "Object Oriented Programming");
		prof1.profinfo();
		
		System.out.println("---------------------------");
		ManageForProf prof2 = new ManageForProf("Mechanical System", "CEJ", "Machine Learning Theory");
		prof2.profinfo();
	}
}