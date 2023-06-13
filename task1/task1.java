//package lession_3.task1;

public class task1 {
public static void main(String[] args) {
	Market<String> market = new Market<>(); // Создаем экземпляр класса Market
	
	// Добавляем несколько покупателей в очередь
	market.addBuyer("Покупатель 1");
	market.addBuyer("Покупатель 2");
	market.addBuyer("Покупатель 3");
	
	// Обновляем состояние магазина
	market.update();
	
	// Принимаем заказы от покупателей
	market.acceptOrder("Заказ 1");
	market.acceptOrder("Заказ 2");
	market.acceptOrder("Заказ 3");
	
	// Обновляем состояние магазина
	market.update();
	market.update();
	market.update();
	
	market.free();
}
}
