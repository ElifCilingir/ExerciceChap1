package Exercice3;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class Calculchaine {
    public static double moy(String []tab) {
        double moy = 0;
        int erreur = 0;
        for(int i = 0; i < tab.length; i++){
            try{
                moy = test(tab, i, moy);
               // System.out.println(moy);
            }catch(CalculException c){
                erreur ++;
               // c.printStackTrace();
            }
        }
        moy = moy / (tab.length - erreur);
        return moy;
    }

    public static double test(String []tab, int j,double moy) throws CalculException{
        try{
            moy = Double.parseDouble(tab[j]) + moy;
            return moy;
        }catch (NumberFormatException nbf){
            throw new CalculException();
        }

    }
    public static void main(String[]args){
        String []str = {"a1", "2", "3"};

        System.out.println(moy(str));


    }
}