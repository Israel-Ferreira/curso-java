package cap1.aulas;

import java.util.Arrays;

public class NotacaoPonto {
    public static void main(String[] args) {
        String strQualquer = "Isso é uma string";
        strQualquer = strQualquer
                    .toUpperCase()
                    .replace("STRING", "VÁRIAVEL");


        byte[] bytesString =  strQualquer.getBytes();

        System.out.println(Arrays.toString(bytesString));
    }
}
