package lab8;

public class ThreadDemo {

    // Task 1: Print numbers from 0 to 4
    static class PrintNumbersTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);  // Sleep for 100ms 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Task 2: Print numbers from 1 to 10 and sleep for 500ms
    static class PrintNumbersWithSleepTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);  // Sleep for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create and start the threads
        Thread thread1 = new Thread(new PrintNumbersTask());
        Thread thread2 = new Thread(new PrintNumbersWithSleepTask());

        thread1.start();
        thread2.start();

        try {       
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

