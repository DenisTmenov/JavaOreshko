package com.denis.task02;

public class Main {

	public static void main(String[] args) {
		printTask02();
		for (int i = 0; i < 10; i++) {
			System.out.printf(i + 1 + "год а = %5.4f \n", getA(1000, 0.05, i + 1));
		}
	}

	private static double getA(double p, double r, int n) {
		return p * Math.pow(1 + r, n);
	}

	private static void printTask02() {
		System.out.println("Задача 2. Вычисление сложных процентов.");
		System.out.println("Постановка задачи");
		System.out.println("	Клиент кладет 1000 BYN на накопительный счет в банке под 5% годовых, с ежегодным");
		System.out.println("	начислением процентов. Предполагается, что вся сумма процентов остается на счете.");
		System.out.println("Задача. Написать консольное приложение для вычисления и вывода суммы на счете в");
		System.out.println("конце каждого года за 10-летний период. В расчетах используйте формулу:");
		System.out.println("	a = p(1 + r) в степени n");
		System.out.println("	где");
		System.out.println("	p – исходная внесенная сумма,");
		System.out.println("	r – годовая процентная ставка (в нашем случае 0.05),");
		System.out.println("	n – число лет,");
		System.out.println("	a – сумма депозита на конец n-го года.");
	}

}
