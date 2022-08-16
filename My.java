// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class My extends Exception{
    public My(){
        System.out.println("Hello, World!"); 
    }
}
class HelloWorld{
    void meth(){
        try{
            if(n>0){
            throw new My();}
            System.out.println("RU RURRU RU RURRU"); 
        }
    }
    public static void main(String[] args) {
        int num=5;
        catch(My e){
             System.out.println(e);
           }
    }
}