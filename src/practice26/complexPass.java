package practice26;

public class complexPass {
    public static void main(String[] args) {
PassComplex();
    }
    public static void PassComplex(){

            for(int j=0; j<3; j++){
                System.out.print((char)((int)(97+Math.random()*26)));
            }
        for(int i=0; i<3; i++){
            System.out.print((int)(Math.random()*10));
        }
    }
}
