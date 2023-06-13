//package lession_3.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task3 {

public class SortObjects {
	public static <T> List<T> sortObjects(List<T> objects, Comparator<? super T> comparator) {
		Collections.sort(objects, comparator);
		return objects;
	}
}

public static void main(String[] args) {
	// Создаем список для сортировки
	List<String> strings = new ArrayList<>();
	strings.add("a");
	strings.add("c");
	strings.add("b");
	strings.add("e");
	strings.add("d");
	strings.add("f");
	
	Comparator<String> comparator = Comparator.reverseOrder();
	List<String> sortedStrings = SortObjects.sortObjects(strings, comparator);
	System.out.println(sortedStrings);
}
}
