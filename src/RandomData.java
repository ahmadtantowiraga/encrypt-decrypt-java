import java.util.Arrays;
import java.util.Random;

public class RandomData {
    public static void main(String[] args) {
        String data="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomData=generateRandom(data);
        String chipertext=enkripsi("AKU", randomData);
        System.out.println("key Sort   : "+ data);
        System.out.println("key Random : " + randomData);
        System.out.println("Plaintext  : " + "AKU");
        System.out.println("chipertext : " + chipertext);
        System.out.println("PlainDeskrip: " + deskripsi(chipertext, randomData));
    }
    public static String generateRandom(String data){
        Random random=new Random();
        char[] charData=data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            int randomIndex= random.nextInt(charData.length);
            char tem=charData[i];
            charData[i]=charData[randomIndex];
            charData[randomIndex]=tem;
        }
        return new String(charData);
    }
    public static String enkripsi(String data, String key){
        char[] keySort=key.toCharArray();
        Arrays.sort(keySort);
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                if (data.charAt(i)==key.charAt(j)) {
                    builder.append(keySort[j]);
                }
            }
        }
        return builder.toString();
    }

    public static String deskripsi(String chipertext, String key){
        char[] keySort=key.toCharArray();
        Arrays.sort(keySort);
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < chipertext.length(); i++) {
            for (int j = 0; j < key.length(); j++) {
                if (chipertext.charAt(i)==keySort[j]) {
                    builder.append(key.charAt(j));
                }
            }
        }
        return builder.toString();
    }

}
