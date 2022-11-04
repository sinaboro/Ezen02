package com.ezen.ex06;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class StackQueueEx {
	public static void main(String[] args) {
	
		Stack st = new Stack();
		Queue q = new LinkedList<>();
		
		
		st.push("00");
		st.push("11");
		st.push("22");
		st.add("33");
		st.remove(0);

		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.add("3");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
