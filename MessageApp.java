class MessageSender extends Thread {

    public MessageSender(String name) {
        super(name);
    }

    @Override
    public void run() {  
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " Sending Message " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class MessageApp {
    public static void main(String[] args) {

        MessageSender t1 = new MessageSender("Madhu");
        MessageSender t2 = new MessageSender("Mathi");

        t1.start();
        t2.start();
    }
}