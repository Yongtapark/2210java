package java221112;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> q = new LinkedList<Message>();
		
		q.offer(new Message("sendMail","홍길동"));
		q.offer(new Message("sendSMS","홍길순"));
		q.offer(new Message("sendKakaotalk","홍길박"));
		
		while(!q.isEmpty()) {
			Message w=q.poll();
			switch(w.command) {
			case "sendMail" : System.out.println(w.to+"님에게 메일을 보냅니다");break;
			case "sendSMS" : System.out.println(w.to+"님에게 SMS을 보냅니다"); break;
			case "sendKakaotalk" : System.out.println(w.to+"님에게 카톡을 보냅니다");break; 
			}
		}

	}

}
