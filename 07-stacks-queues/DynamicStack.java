public class DynamicStack extends CustomStack {
   public DynamicStack(){
       super(); // Creates a stack with sample size 10
   } 

   public DynamicStack(int size){
       super(size); // Creates a stack with sample size - "size"
   }

   @Override
   public boolean push(int item){
       // this takes care of stack being full
       if(this.isFull()){
           // double the array size
           int[] temp = new int[data.length * 2];

           // copy all previous items in new data
           for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
           }

           data = temp; // Over-writing data
       }

       // at this point we know that array is not full
       // insert item
       return super.push(item); // it is a boolean function
   }
}
