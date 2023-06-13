//package lession_3.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Market<T> implements I_QueueBehaviour<T>, I_MarketBehaviour<T>, I_free_cash{
private Queue<T> queue; // Очередь покупателей
private ArrayList<T> orders; // Список заказов
private Random random; // Генератор случайных чисел

// Конструктор
public Market() {
	this.queue = new LinkedList<>();
	this.orders = new ArrayList<>();
	this.random = new Random();
}

// Реализация методов интерфейса I_QueueBehaviour
@Override
public boolean add(T element) {
	return queue.add(element);
}

@Override
public boolean offer(T element) {
	return queue.offer(element);
}

@Override
public T remove() {
	return queue.remove();
}

@Override
public T poll() {
	return queue.poll();
}

@Override
public T element() {
	return queue.element();
}

@Override
public T peek() {
	return queue.peek();
}

// Реализация методов интерфейса I_MarketBehaviour
@Override
public void acceptOrder(T order) {
	orders.add(order);
}

@Override
public T deliverOrder() {
	if (orders.isEmpty()) {
		return null; // Пока заказов нет, ничего не доставляем
	} else {
		// Удаляем случайный заказ из списка и доставляем его
		int index = random.nextInt(orders.size());
		T order = orders.get(index);
		orders.remove(index);
		return order;
	}
}

// Метод добавления покупателя в очередь
public void addBuyer(T buyer) {
	if (offer(buyer)) {
		System.out.println("Покупатель добавлен в очередь");
	} else {
		System.out.println("Ошибка при добавлении покупателя в очередь");
	}
}

// Метод обновления состояния магазина (принимаем и отдаём заказы)
public void update() {
	T order = deliverOrder();
	if (order != null) {
		System.out.println("Заказ " + order + " доставлен покупателю");
	} else {
		System.out.println("Нет заказов для доставки");
	}
	T buyer = poll();
	if (buyer != null) {
		acceptOrder(buyer);
		System.out.println("Покупатель " + buyer + " обслужен");
	} else {
		System.out.println("Очередь пуста");
	}
}

@Override   //Новый метод, свободная касса
public void free() {
	System.out.println("Свободная касса!");
}
}