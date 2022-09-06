package classes;

public class Print extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Child - " + Thread.currentThread().getName() + " : " + i);
                this.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }


}
