package Exercice3;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class Calculchaine {
    public static double moy(String []tab) {
        double moy = 0;
        for(int i = 0; i < tab.length; i++){
            try{
                moy = test(tab, i, moy);
            }catch(CalculException c){
                c.printStackTrace();
            }
        }
        moy = moy / tab.length;
        return moy;
    }

    public static double test(String []tab, int j,double moy) throws CalculException{
        if(Pattern.matches("[0-9]", tab[j]) == true ){
            moy = Double.parseDouble(tab[j]) + moy;
        }else{
            throw new CalculException();
        }
        return moy;
    }
    public static void main(String[]args){
        String []str = {"1", "2a", "3"};

        System.out.println(moy(str));


    }
}