import java.util.Scanner;
class QueueImplementation{
    int n=6;
    int[] queue = new int[n];
    int front=-1;
    int rear=-1;
    void enQueue(Scanner in){
        if((rear+1)%n==front){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter the value: ");
            queue[(++rear)%n] = in.nextInt();
        }
    //r  //0==>70
    //f    //1==>20
    //    //2==>30
    //    //3==>40
    //    //4==>50
    //    //5==>60
        
    }
    
    void deQueue(){
        if(front==-1){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println("Deleted data is: "+queue[front]);
            front++;
            if(front>rear){
                front=-1;
                rear=-1;
            }
        }
    }
    
    void displayQueue(){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=(n+rear)%n;i++){
                System.out.println(queue[i%n]);
            }
        }
    }
    
    
}


public class Main
{
	public static void main(String[] args) {
		QueueImplementation qi = new QueueImplementation();
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println("1)EnQueue\n 2)DeQueue\n 3)DisplayQueue\n");
		    switch(in.nextInt()){
		        case 1:{
		            qi.enQueue(in);
		            break;
		        }
		        case 2:{
		            qi.deQueue();
		            break;
		        }
		        case 3:{
		            qi.displayQueue();
		            break;
		        }
		    }
		}
	}
}
