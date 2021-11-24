public class Test extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try
        {
            System.out.println(Thread.interrupted());
            System.out.println(Thread.currentThread().isInterrupted());
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        t.interrupt();
    }
}
