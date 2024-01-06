public class Main {
    public static void main(String[] args) {

        checkIfInRange(4,3,8);
    }

    public static Boolean checkIfInRange(int num, int min, int max) {
        Boolean operazione = (num <= max && num >= min);
        if (operazione == true){
            System.out.println("Il numero è in range");
        } else throw new ArithmeticException("Il numero non è in range");
        return operazione;
    }

}
