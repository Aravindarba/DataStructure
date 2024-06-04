package org.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueClass {


    public static void main( String[] args )
    {
                Queue<Integer> queue = new LinkedList<>();

                // Adding elements to the Queue
                queue.add(10);
                queue.add(20);
                queue.add(30);
                queue.add(40);
                queue.add(50);

                System.out.println("Elements in Queue: " + queue);

                // Removing elements from the Queue using remove()
                int removedElement = queue.remove();
                System.out.println("Removed Element: " + removedElement);

                System.out.println("Queue after remove operation: " + queue);

                // Accessing the head of the queue using element()
                int head = queue.element();
                System.out.println("Head of the Queue: " + head);

                // Rest all methods of collection interface like size and contains can be used with this implementation.
                int size = queue.size();
                System.out.println("Size of the Queue: " + size);


            Queue<String> priorityQueue = new PriorityQueue<String>();
            priorityQueue.add("Helloworld");

            }
        }

