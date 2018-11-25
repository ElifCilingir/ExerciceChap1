package Exercice2;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
    public static void main(String[] args) throws Exception {
      //  float resultat = 0;
        ArrayList<String> moy = new ArrayList<String>();
        String line = null;
        try {
            BufferedReader reader= new BufferedReader(new FileReader("fichier.txt"));
            while ((line = reader.readLine()) != null) {
             //   System.out.println(line);
                moy.add(line);
            }
            float moyenne = moyenne(moy);
         ///   System.out.print(moyenne);
            int point = point("elif.cilingir@gmail.com", moy);
            System.out.println(point);
        } catch(Exception e) {
            e.printStackTrace();
        }


    }

    static float moyenne(ArrayList<String> moy){
        float resultat = 0;
        float val;
        for(int i = 0; i < moy.size(); i++){
            val = Float.parseFloat(moy.get(i).substring(moy.get(i).indexOf(":")+1));
            resultat = resultat + val;
        }
        resultat = resultat / moy.size();
        return resultat;
    }

    static int point(String mail, ArrayList<String> list){
        int nbPoint = 0;
        for(int i = 0; i < list.size(); i++){
            if(mail.equals(list.get(i).substring(0,list.get(i).indexOf(":")))){
                nbPoint = Integer.parseInt(list.get(i).substring(list.get(i).indexOf(":")+1));
            }
        }
        return nbPoint;
    }

}
