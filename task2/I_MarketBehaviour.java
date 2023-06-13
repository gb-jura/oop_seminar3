//package lession_3.task2;

interface I_MarketBehaviour<T> {
	void acceptOrder(T order);
	T deliverOrder();
}