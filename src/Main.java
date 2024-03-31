public class Main {
    public static void main(String[] args) {
        System.out.println("chippertext : " + enkripsi("rahman coll 123 @#$", "hafidng%^&%ising"));
        System.out.println("Plaintext : "+ deskripsi(";*16*7H,855HYZ[HhKL","hafidng%^&%ising"));
    }
    public static String enkripsi(String kata, String key){
        int keyNumber=0;
        for (int i = 0; i < key.length(); i++) {
            keyNumber+=(int)key.charAt(i);
        }
        StringBuilder chipertext=new StringBuilder();
        for (int i = 0; i < kata.length(); i++) {
           char charChiper= (char)((((int) kata.charAt(i) - 32 + keyNumber) % 95)+32);
           chipertext.append(charChiper);
        }
        return chipertext.toString();
    }
    public static String deskripsi(String chipertext , String key){
        int keyNumber = 0;
        for (int i = 0; i < key.length(); i++) {
            keyNumber += (int) key.charAt(i);
        }
        StringBuilder plaintext=new StringBuilder();
        char charPlaint;
        for (int i = 0; i < chipertext.length(); i++) {
            if ((int) chipertext.charAt(i)-32-(keyNumber % 95) < 0){
               charPlaint=(char) ((95 + (int) chipertext.charAt(i)-32-(keyNumber % 95)) + 32);
            }else {
                charPlaint=(char) ((int) chipertext.charAt(i)-32-(keyNumber % 95) + 32);
            }
            plaintext.append(charPlaint);
        }
        return plaintext.toString();
    }
}