package ch06.sec06.exam04;

import ch06.lecture.p03Method.MyClass07;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalcu = new Calculator();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이: " + result1);
		System.out.println("직사각형의 넓이: " + result2);
	}
}
