//package lession_3.task1;

interface I_MarketBehaviour<T> {
void acceptOrder(T order);

T deliverOrder();
}