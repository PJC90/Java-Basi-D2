package es1;

public class esercizio1 {
    public static void main(String[] args) {

        String a = "Filippoa";
        boolean isLength = lunghezza(a);
        System.out.println("La lunghezza è pari:" + isLength);

        int year = 2012;
        boolean isLeap = annoBisestile(year);
        System.out.println(year + " è bisestile? " + isLeap);
    }
    public static boolean lunghezza(String input){
        int lun = input.length();
        if ((lun % 2) == 0){
            return  true;
        }else {
            return false;
        }
    }
    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0){
            return true;
        } else if (anno % 100 == 0 | anno % 400 == 0){
            return true;
        } else {
            return false;
        }

    }
}
