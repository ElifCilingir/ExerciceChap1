package Exercice1.Question3;

public class Test {
    /*
    * ajout de "rajout" dans un string (en variable local)
     */
    public static void f(String s) {
        s += "rajout";
    }

    /*
    * Rajout d'un texte au string passer en paramètre et retourne ce texte
     */
    public static String g(String s) {
        s += " texte a concatener en string";
        return s;
    }

    /*
    * Rajout d'un texte à la variable passer en paramètre
     */
    public static void g(StringBuffer sb) {
        sb.append(" texte a concatener en sbuffer");
    }

    public static StringBuffer h(StringBuffer sb) {
        return (sb = new StringBuffer("simple construction"));
    }

    public static void main(String[] args) {
        String string = "un premier texte";
        f(string);
        System.out.println(string); // cela nous affiche "un premier texte", car nous retournons rien
        string = "un deuxieme texte";
        g(string);
        System.out.println(string); // cela nous affiche "un deuxieme texte", car il ayant un type de retour string
        // il faut le mettre dans une variable
        string = g(string);
        System.out.println(string); // ceci étant stocket dans une variable nous avons
        // "un deuxieme texte texte a concatener en string
        StringBuffer stringBuffer = new StringBuffer("construction sbuffer");
        g(stringBuffer);
        System.out.println(stringBuffer); // ceci nous affiche "construction sbuffer texte a concater en sbuffer"
        // car nous ajoutons direct au stringBuffer passer en parametre pas besoin de retourne ayant un append
        stringBuffer = new StringBuffer("construction sbuffer 2");
        h(stringBuffer);
        System.out.println(stringBuffer); // ceci nous affiche "construction sbuffer 2"
        // Ayant une valeur de retour, il faut le stocker dans une variable pour changer le texte
        stringBuffer = h(stringBuffer);
        System.out.println(stringBuffer);// ceci nous affiche "simple construction"
        // Etant stocker dans une variable et on créer un nouveau string buffer donc ça change le texte.
    }
}
