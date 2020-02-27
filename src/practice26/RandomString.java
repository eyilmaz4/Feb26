package practice26;

public class RandomString {
    public static void main(String[] args) {
Pass();
    }
    public static String Pass(){
        String random=" ";
        for(int i=0; i<6; i++){
            random=random +((int) (Math.random()*10));
        }
        System.out.println(random);
        return random;
    }
}
