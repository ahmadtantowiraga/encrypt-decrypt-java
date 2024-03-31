public class Prima {
    public static void main(String[] args) {
        System.out.println(checkPrima(11));
    }
    public static String checkPrima(int number){
        if (number < 2){
            return "Bukan Prima";
        }else{
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    return "Bukan Prima";
                }
            }
            return "Prima";
        }
    }
}
