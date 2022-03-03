package queuearray;

public class Queue<T> {

    Object[] ArrayQueue;
    int Rear; //Last added item
    int Front; //First added item
    int Size;

    public Queue(int Size) {
        this.Size = Size;
        ArrayQueue = new Object[this.Size];
        Rear = -1;
        Front = -1;
    }

    public boolean IsFull() {
        return (Rear == Size - 1);
    }

    public boolean IsEmpty() {
        return (Rear == -1 || Front > Rear);//
    }

    public void queue(Object newItem) {
        if (IsFull()) {
            System.out.println("Queue Is Full");
            return;
        }
        Rear = Rear + 1;
        ArrayQueue[Rear] = newItem;
        if (Front == -1) {
            Front = 0;
        }

    }

    public T Dequeue() {
        if (IsEmpty()) {
            System.out.println("Queue Is Empty");
            return null;
        }

        T ObjectOut = (T) ArrayQueue[Front];
        Front = Front + 1;
        return ObjectOut;
    }
}
