//package lession_3.task2;

interface I_QueueBehaviour<T> {
	boolean add(T element);
	boolean offer(T element);
	void remove();
	T poll();
	T element();
	T peek();
}