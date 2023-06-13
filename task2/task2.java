//package lession_3.task2;

public class task2 {
	public static void main (String[] args){
		Market<String> market; // Создаем экземпляр класса Market
		market = new Market<String>();

		// Добавляем несколько покупателей в очередь
		market.addBuyer("Покупатель 1");
		market.addBuyer("Покупатель 2");
		market.addBuyer("Покупатель 3");

		System.out.println("Выводим всех покупателей"); //Используем итератор
		for (Market<String> it = market; it.hasNext(); ) {
			System.out.println(it.next());
		}
		
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
	}
}
