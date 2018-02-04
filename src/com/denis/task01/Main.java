package com.denis.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> marks = new ArrayList<>();

		printTask01();
		fillMarks(marks, scanner);
		Integer passExam = getCount(1, marks);
		Integer notPassExam = getCount(0, marks);

		printReport(marks, passExam, notPassExam);
	}

	private static void printReport(List<Integer> marks, Integer passExam, Integer notPassExam) {
		System.out.println("==========");
		System.out.println(marks.size() + " студентов, участвало в зачете");
		System.out.println("успешно сдали зачет " + passExam + " студентов");
		System.out.println("зачет провалило " + notPassExam + " студентов");
		System.out.println(marks.size() + " студентов, участвало в зачете");
		if (passExam > 7) {
			System.out.println("за хорошо проделанную работу - премировать преподавателя");
		}
		System.out.println("==========");
	}

	private static int getCount(Integer numMark, List<Integer> marks) {
		int count = 0;
		for (Integer mark : marks) {
			if (mark.equals(numMark)) {
				count++;
			}
		}
		return count;
	}

	private static void fillMarks(List<Integer> marks, Scanner scanner) {
		for (int i = 0; i < 10; i++) {
			marks.add(getStudentMark(scanner));
		}
	}

	private static Integer getStudentMark(Scanner scanner) {
		Integer mark = null;
		do {
			printEnterMark();
			mark = getMark(scanner);
		} while (mark == null);
		return mark;
	}

	private static Integer getMark(Scanner scanner) {
		String str = scanner.nextLine();
		if (isInteger(str)) {
			int nextInt = Integer.valueOf(str);
			if (0 <= nextInt && nextInt <= 1) {
				return nextInt;
			}
		}
		return null;
	}

	private static boolean isInteger(String str) {
		try {
			Integer.valueOf(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private static void printEnterMark() {
		System.out.print("Введите оценку (1- зачет сдан, 0 – провален) ");
	}

	private static void printTask01() {
		System.out.println("Задача 1. Анализ результатов зачета.");
		System.out.println("Постановка задачи");
		System.out.println("	10 студентов учебного заведения сдавали итоговый зачет по одной из дисциплин. Оценки,");
		System.out.println("	полученные на зачете, обозначаются следующим образом: 1- зачет сдан, 0 – провален.");
		System.out.println("Задача. Написать консольное приложение для обобщения результатов итогового зачета,");
		System.out.println("реализующее следующие функции:");
		System.out.println("	Ввести каждый результат. При вводе должно отображаться сообщение: «Введите оценку»;");
		System.out.println(
				"	Подсчитать количество результатов каждого типа (сколько успешно сдано и сколько провалено);");
		System.out.println("	Вывести сводку результатов: количество студентов, участвовавших в зачете,");
		System.out.println("		количество, студентов, получивших оценку «зачтено» и количество, студентов,");
		System.out.println("		получивших оценку «не зачтено»;");
		System.out.println("	Если количество студентов, успешно сдавших итоговый зачет, более 7 человек,");
		System.out.println("	вывести сообщение «премировать преподавателя».");
	}

}
