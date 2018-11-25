package Exercice1.Question4;

/*
* En exécutant à la main sans l'IDE j'ai trouvé NullPointerException car l'array est à null
*  Et j'ai confirmer à l'aide de l'IDE
 */

/*
* Pour résoudre l'erreur je déclare et initialise le tableau dans le main et envoie tout sa
* à la fonction f et cela fonctionne
 */
public class Test {

    /*
    * Prend un tableau et ajoute 1 a toutes les valeurs
     */
    static void f(int [] array, int nb) {
        //array = new int[nb];
        for(int value: array)
            System.out.println(++value + " ");
    }
    public static void main(String[] args) {
        int size = 3;
        //int[] array = null;
        int array[];
        array = new int[size];
        f(array, size);
        for (int value : array)
            System.out.println(value + " "); // affiche toute les valeurs du tableau ici 0 0 0 0
    }
}
