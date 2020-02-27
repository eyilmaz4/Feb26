package practice26;

public class Random {
    public static void main(String[] args) {
pass();
    }

    public static void pass(){
       for(int i=0; i<6; i++){
           System.out.print((int)(Math.random()*10));
       }

    }
}
