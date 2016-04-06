package com.itheima.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 * @创建时间 2016-3-7 下午7:07:54
 * @描述
 * 
 * @版本	    $Rev$
 * @更新者   $Author$
 * @更新时间 $Date$
 * @更新描述	TODO
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
}