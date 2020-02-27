package practice26;

public class invoices {
    public static void main(String[] args) {
bill( 1000);
internet(350);
    }

    public static String bill(int consumption) {
        String word = " ";
        if(consumption>=500 && consumption <1000) {
            word="Good job";
            System.out.println(word);
        }
        else if (consumption <= 1500 && consumption >= 1000) {
            word="not bad";
            System.out.println(word);

        } else if (consumption >= 1500) {
            word="start save energy";
            System.out.println(word);
        } else {
            System.out.println(" not valid");
        }
        return word;
    }
    public static String internet(int speed){
        String comment=" ";
        if(speed>=100 && speed<300) {
            comment = "Good Speed ";
            System.out.println(comment);
        }
            else if( speed>=300) {
            comment = "Super Speed ";
            System.out.println(comment);
        }
                    else {
                        System.out.println("not valid");
                    }
                    return comment;
                }

            }





