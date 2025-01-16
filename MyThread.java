class FirstThreadTest implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        FirstThreadTest FT=new FirstThreadTest();
        Thread T1=new Thread(FT);
        T1.start();
    }
}