package com.itheima.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 * @����ʱ�� 2016-3-7 ����7:07:54
 * @����
 * 
 * @�汾	    $Rev$
 * @������   $Author$
 * @����ʱ�� $Date$
 * @��������	TODO
 */
public class ThreadPoolDemo {
	private static MyThread	task;

	public static void main(String[] args) {
		// ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newFixedThreadPool(2);
		//ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService es = Executors.newScheduledThreadPool(2);
		for (int i = 0; i < 10; i++) {
			task = new MyThread();
			es.execute(task);
		}
	}
}

class MyThread implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread-task==="+Thread.currentThread());
	}

	//�������ܡ�
	class 
	{
		system.out.println("  v����   ��");
	}
}