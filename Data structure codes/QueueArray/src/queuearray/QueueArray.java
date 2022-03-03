package queuearray;

public class QueueArray {

    public static void main(String[] args) {
        // Quere temel amacı ilk giren ilk çıkan
        // eğer aşağıdaki queue 5 ten fazla eleman eklenirse Queue is Full yazacak ve son eleman eklenmeyecek 
        Queue<String> queue = new Queue<String>(5);
        queue.queue("A");
        queue.queue("B");
        queue.queue("C");
        queue.queue("D");
        queue.queue("E");
        queue.queue("F");
        //Queue içindeki elemanlar silmek
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        

    }

}
