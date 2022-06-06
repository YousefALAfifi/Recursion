package pkgfinal;


public class Queue{
    int size=4 ;
    int []Q = new int[size];
    int numitem=0;
    int front=0;
    int  rear=0;
   
    public  void enqu(int val){
       if(isfull()){
           System.out.println("Queue is Full.");
       }
       else{
           Q[rear]=val;
           rear=(rear+1)%size;
          numitem++;
           System.out.println("The value is pushed in Queue = "+val);
       }
    }
    public  int dequ(){
          
	    if(isempty()){
           	System.out.println("Queue is Empty!!");
                return 00;
            }else{
                 int x=Q[front];
                 front = (front +1)%size;
                 numitem--;
                 return x;
                  }
    }
    
    public  boolean isempty(){
        if(numitem==0){
            return true;
        }else 
            return false;
    }
    
    public  boolean isfull(){
        if(numitem==size){
            return true;
        }else 
            return false;
    }

    
    
    public static void Queue() {
        Queue q=new Queue();
         int i=6;
        while(!q.isfull()){
            q.enqu(i);
            i++;
        }
       
        while(!q.isempty()){
            int x= q.dequ();
            System.out.print((x*x)+" ");

        }
        
}
}
