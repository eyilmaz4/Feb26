package practice26;

public class cah {
    public static void main(String[] args) {
        CharacterPass();
        PassCharVoid(6);
        pass(6);
    }
    public static String CharacterPass(){
        String character="";
        for(int i=0; i<6; i++){
            character=character+(char)((int)(97+(Math.random()*26)));;

        }System.out.println(character);
        return character;

    }

    public static void PassCharVoid(int passlength){
        for(int i=0; i<passlength; i++){
            System.out.print((char)(97+(int)(Math.random()*26)));
        }
        System.out.println();
    }
    public static String pass(int passlength){
        String result=" ";
        for(int i=0; i<passlength; i++){
            result=result+(char)(((int)(97+(Math.random()*26))));;

        }
        System.out.println(result);
        return result;

    }
}
