package Exercice1;

public class Exercice1 {
    public static void main(String[]args){
        System.out.println(mystery(3,4));
    }

    /* fonction sans erreur
    * renvoie false car le resultat est égale à 10
    * Ce code nous affiche donc False et 10
    */
    static  void first(){
        int output = 10;
        boolean result = false;
        if((result) && ((output += 10) == 20))
            System.out.println("True " + output);
        else System.out.println("False " + output);
    }

    /* fonction sans erreur
    * Le 010 ayant pout valeur 8 (étant en octal) nous avons
    * donc comme résultat 28
     */
    static void second(){
        int counter = 0;
        for (int i = 1; i < 010; i++) {
            counter = counter + i;
        }
        System.out.println("Result : " + counter);

    }

    /*
    * Dans cette fonction il manquait une accolade à la fin de la fonction
    * Le resultat afficher est toujours ok que l'on passe true ou false en paramètre
    * car nous faisons = true au lieu de == dans le if
     */
    public static void check(boolean isOk) {
        if (isOk = true) System.out.println("OK");
        else System.out.println("KO");
    }

    /*
    * Cette fonction nous affiche une erreur : "java.lang.NullPointerException"
    * car la variable est à null
     */
    public static void four(){
        Boolean ignore = null;
        if (ignore == false) {
            System.out.println("Do not ignore!");
        }
    }
    /*
    * Cette fonction permet de calculer un nombre mystère
    * en fonction de si y est null pair ou impaire
    * Cette fonction nous affiche 12
     */
    static int mystery(int x, int y) { // x et y positifs
        if (y == 0) return 0;
        else if (y % 2==0) return 2 * mystery(x, y / 2);
        else return x + (2 * mystery(x, (y - 1) / 2));
    }

    


}
