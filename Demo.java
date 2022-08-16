import java.util.Scanner;
class UnderAge extends Exception{
    private int a;
    UnderAge(int b){
        a=b;
    }
    public String toString(){
        return "Under Age [ "+a+" ] ";
    }
}
class Demo{
    void test(int age)throws UnderAge{
        if(age<=18)
        throw new UnderAge(age);
    }
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=sc.nextInt();
        try{test(age);
            System.out.println(" You are adult now. DO Party ");
        }
        catch(UnderAge k){
            System.out.println("Exception found " +k);
        }
    }
}