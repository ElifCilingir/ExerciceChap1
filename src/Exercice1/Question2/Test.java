package Exercice1.Question2;

/*
* Ce programme nous affiche iabde
* car test fais appel à f()
 */
public class Test {
    String string = "i";

    /*
    * Cette fonction ajoute a et fais appel à g()
    * la fonction g() ayant une exception nous rentrons dans le catch qui ajoute e
     */
    void f() {
        try {
            string += "a";
            g();
        } catch (Exception e) {
            string += "e";
        }
    }
    /*
    * cette fonction ajoute b et appel h() puis également ajoute d
    * La fonction h() ayant une exception on rentre dans le catch après
     */
    void g() throws Exception {
        try {
            string += "b";
            h();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            string += "d";
        }
        string += "3";
    }

    /*
    * Cette fonction retourne une exception
    *
     */
    void h() throws Exception {
        throw new Exception();
    }
    void display() {
        System.out.println(string);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.f();
        test.display();
    }
}