import java.util.HashMap;
public class Classbucket {
    public static void main(String[] args){
        HashMap<String,Integer> mailbox=new HashMap<>();
        mailbox.put("madhu",1);
        mailbox.put("chitti",2);
        mailbox.put("potti",3);
        mailbox.put("chinnu",4);
        mailbox.put("nanni",5);
        mailbox.put("laddu",6);
    System.out.println(mailbox);
         for(HashMap.Entry<String,Integer> entry:mailbox.entrySet()){
             System.out.println(entry.getKey());
           }
         }
     }
