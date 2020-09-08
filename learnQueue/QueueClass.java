package learnQueue;


public class QueueClass {

	public static void main(String[] args) {
		MyQueue<Integer> mq=new MyQueue<>();
		mq.Enqueue(12);
		mq.Enqueue(23);
		mq.Enqueue(24);
		System.out.println(mq.Dequeue()+"  "+mq.Dequeue()+"  "+mq.Dequeue());
	}

}
