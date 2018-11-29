package Exercice4;

public class Chaine
{
    public static int appartientAlphabet(StringBuilder ch1, StringBuilder ch2, char[] alphabet, StringBuilder chf){
        int appartien = 0;
        for(int i = 0; i < chf.length(); i++){
            for(int j = 0; j < alphabet.length; j++) {
                if (chf.charAt(i) == alphabet[j]) {
                    appartien++;
                    break;
                }else if(chf.charAt(i) == alphabet[j]+32{
                    appartien++;
                    break;
                }
            }
        }
        return appartien;

    }
    public static void main(String[] args){
        char []alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder ch1 = new StringBuilder("test");
        StringBuilder ch2 = new StringBuilder("ok");
        StringBuilder ch3 = new StringBuilder("chaine");

        appartientAlphabet(ch1,ch2,alphabet,ch3);
    }
}
