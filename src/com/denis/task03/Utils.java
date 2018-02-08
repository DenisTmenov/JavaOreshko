package com.denis.task03;

import java.util.Scanner;

public class Utils {
	public static Integer getStudentMark(Scanner scanner) {
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

			return nextInt;
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
		System.out.print("Введите оценку от 0 до 100) (отрицательное значение -> выход из программы) ");
	}

}
