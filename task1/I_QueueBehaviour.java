//package lession_3.task1;

interface I_QueueBehaviour<T> {
boolean add(T element);

boolean offer(T element);

T remove();

T poll();

T element();

T peek();
}