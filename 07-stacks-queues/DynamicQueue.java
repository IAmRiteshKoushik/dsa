public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    } 

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        // With dynamic queue, when the queue is full, then something has to be done
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            // copy all previous items in to new data
            for (int i = 0; i < max; i++) {
               temp[i] = data[(front + i) % data.length];
            }
            // As array is full
            front = 0;
            end = data.length;
            data = temp;
        }

        // When the array is not full
        return super.insert(item)
    }

}
