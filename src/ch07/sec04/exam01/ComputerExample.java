package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator ca = new Calculator();
		System.out.println("원 면적: " + ca.areaCircle(r));
		System.out.println();
		
		Computer co = new Computer();
		System.out.println("원 면적: " + co.areaCircle(r));
	}
}
