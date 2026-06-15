class Message {

    public synchronized void send(String name) {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " Sending Message " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class MessageSender extends Thread {
    Message msg;

    MessageSender(Message msg, String name) {
        super(name);
        this.msg = msg;
    }

    public void run() {
        msg.send(getName());
    }
}

public class MessageApp{
    public static void main(String[] args) {

        Message m = new Message();

        MessageSender t1 = new MessageSender(m, "Madhu");
        MessageSender t2 = new MessageSender(m, " madhuMathi");

        t1.start();
        t2.start();
    }
}