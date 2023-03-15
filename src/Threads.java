//atomic volatile
//wait notify
//


class MyThread implements Runnable {

	public void run(){

		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("after sleep");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
public class Threads {
    public static void main(String args[]) throws InterruptedException {
        MyThread runnable = new MyThread();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t1.join();
        t2.start();

    }
}
// thread by using runnable interface
//class MyThread implements Runnable{
//    public void run(){
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+" "+i);
//        }
//
//    }
//}
//public class Threads{
//    public static void main(String args[]) throws InterruptedException {
//        MyThread runnable = new MyThread();
//
//		Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t1.join();//first thread execute after that second execute and in join function second thread goes into thread pool and it will be execute after first thread will completely run
//        t2.start();
//
//    }
//}



// thread by using extend thread



//class MyThread extends Thread {
//
//	public void run() {
//
//		for (int i = 0; i < 10; i++) {
//
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//	}
//}
//public class Threads {
//    public static void main(String args[])
//    {
//        MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//        t1.setName("thread1");
//        t2.setName("thread2");
//        t1.start();
//        t2.start();
//
//
//
//    }
//}
