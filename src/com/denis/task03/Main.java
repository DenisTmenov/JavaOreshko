package com.denis.task03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {
		printTask03();
		printResult(getTransformationMarks(getMarks()));
	}

	private static String getStringMarksFromList(List<Integer> marks) {
		StringJoiner sj = new StringJoiner(", ");
		for (Integer elem : marks) {
			sj.add(elem.toString());
		}
		return sj.toString();
	}

	private static void printResult(Map<Integer, List<Integer>> marks) {
		for (Entry<Integer, List<Integer>> element : marks.entrySet()) {
			System.out.println(element.getKey() + " - " + element.getValue().size() + " [ "
					+ getStringMarksFromList(element.getValue()) + " ]");
		}
	}

	private static Map<Integer, List<Integer>> getTransformationMarks(List<Integer> marks) {
		Map<Integer, List<Integer>> result = new HashMap<>();

		List<Integer> one = new ArrayList<>();
		List<Integer> two = new ArrayList<>();
		List<Integer> three = new ArrayList<>();
		List<Integer> four = new ArrayList<>();
		List<Integer> five = new ArrayList<>();

		for (Integer elem : marks) {
			switch (getFiveMark(elem)) {
			case 1:
				one.add(elem);
				break;
			case 2:
				two.add(elem);
				break;
			case 3:
				three.add(elem);
				break;
			case 4:
				four.add(elem);
				break;
			case 5:
				five.add(elem);
				break;
			default:
				break;
			}
		}

		result.put(1, one);
		result.put(2, two);
		result.put(3, three);
		result.put(4, four);
		result.put(5, five);

		return result;
	}

	private static List<Integer> getMarks() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> marks = new ArrayList<>();
		int mark = 0;
		do {
			mark = Utils.getStudentMark(scanner);
			if (mark >= 0) {
				marks.add(mark);
			}
		} while (mark >= 0);

		return marks;
	}

	private static void printTask03() {
		System.out.println("Задача 3. Анализ итоговой успеваемости студентов.");
		System.out.println("Постановка задачи");
		System.out.println("В учебном заведении группа студентов в течение семестра оценивается по рейтинговой");
		System.out.println("системе. Рейтинговая оценка выставляется по 100-балльной шкале и обозначается целым");
		System.out.println("числом в диапазоне от 0 до 100.");
		System.out.println();
		System.out.println("Задача. Написать консольное приложение для вывода результатов итоговой аттестации");
		System.out.println("студентов с переводом рейтинговой оценки в 5-балльную систему. Перевод");
		System.out.println("осуществляется по следующим правилам:");
		System.out.println("5-балльная оценка 100-балльная оценка");
		System.out.println("1 менее 60");
		System.out.println("2 от 60 до 69");
		System.out.println("3 от 70 до 79");
		System.out.println("4 от 80 до 89");
		System.out.println("5 от 90 до 100");
		System.out.println("Вывести сводку результатов по каждому виду оценок в 5-балльной шкале.");
		System.out.println("Так как количество студентов в группе не определено, предусмотреть в программе");
		System.out.println("признак завершения ввода результатов (например, отрицательное значение).");
		System.out.println("Предусмотреть ситуацию, когда ни одной рейтинговой оценки не введено, вывести");
		System.out.println("соответствующее сообщение.");
	}

	private static int getFiveMark(int handredMark) {
		if (handredMark <= 100 && handredMark >= 90) {
			return 5;
		}
		if (handredMark < 90 && handredMark >= 80) {
			return 4;
		}
		if (handredMark < 80 && handredMark >= 70) {
			return 3;
		}
		if (handredMark < 70 && handredMark >= 60) {
			return 2;
		}
		if (handredMark < 60) {
			return 1;
		}
		return 0;
	}
}
