public class Question2 implements Runnable{
    public void run(){
        for (int i = 1; i <= 10 ; i++){
            try {
                if (i == 5) {
                    Thread.sleep(5000);
                    System.out.println(i);
                }
                else System.out.println(i);
            }
            catch (InterruptedException e){
                System.out.println("kya karr sakte hai abb");
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Question2());
        t.start();
    }
}
