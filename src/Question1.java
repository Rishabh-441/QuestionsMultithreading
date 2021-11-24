public class Question1 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Question1());
        t1.setName("Scooby");
        Thread t2 = new Thread(new Question1());
        t2.setName("Shaggy");
        t1.start();
        t2.start();
    }
}
