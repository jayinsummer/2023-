package Test;

public class PenUser3 {
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		Pen3 mypen1 = new Pen3();
		mypen1.write();
		mypen1.write(1000); // price
		mypen1.write(1000, "유재원"); //price, vender
		
		Pen3 mypen2 = new Pen3("영어영문학부"); //vender 지정
		mypen2.write();
		mypen2.write(20000); // price
		mypen2.write(2000, "SMU2"); //price, vender
		
		Pen3 mypen3 = new Pen3("영어영문학부", "노란색", 30000); //vender, 색상, 가격 지정
		mypen3.write();
		mypen3.write(20000); // price
		mypen3.write(3000, "SMU3"); //price, vender
		mypen3.write(3000, "SMU3","yellow"); //price, vender, color	
	}
}
