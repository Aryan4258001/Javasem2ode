import java.util.Scanner ;

class Stack{

    public int arr[];
    public int size;
    public int top ;

    Stack(int x){
        arr=new int [x];
        size=x ;
        top=-1 ;
    }

   void push(int x) throws ArrayIndexOutOfBoundsException{
        if (top>arr.length){
            throw new ArrayIndexOutOfBoundsException("Stack overflow");
        }
        else{
            top++;
            System.out.println("Inserting "+ x+" at " + top);
            arr[top]=x;
        }
    }

   void pop() throws ArrayIndexOutOfBoundsException{
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException("Stack me kuch nhi hai Underflow ho gaya");
        }
        else{
            System.out.println( "popped the element :  "+arr[top]);
            top--;
        }
    }

}
public class Doctor {
    void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Stack : ");
        int a = sc.nextInt();
        Stack b1 = new Stack(a);
System.out.println("Enter 1 for
        try{
            for(int i=0 ; i<a+1 ; i++){
                b1.push(sc.nextInt());
            }
            b1.pop();
            b1.pop();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception found: " +e);
        }

    }
}