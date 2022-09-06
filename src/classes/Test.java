package classes;

public class Test {

    public static void main(String[] args) {


try {

    Print print=new Print();
    print.setName("Child Thread");
    print.start();
    print.join(5000);
    print.yield();



       for (int i=0;i<=5;i++){

            System.out.println("Main - "+Thread.currentThread().getName()+" : "+i);
        }

}catch (Exception e){
    e.printStackTrace();
}

    }

}
