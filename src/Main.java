import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.person();
        Game.game();
        person.setRub(0);
        System.out.println("========End========");
    }
}

class Person{
    Scanner in = new Scanner(System.in);
    static String name;
    static int age;
    static int rub = 1000;
    public void person(){
        setName();
        setAge();
        setRub(0);
    }

    public void setName() {
        System.out.println("Введите имя");
        name = in.next();
    }

    public void setAge() {
        System.out.println("Введите возраст");
        age = in.nextInt();
    }

    public void setRub(int r) {
        System.out.print("Ваш счёт ");
        System.out.print(rub-=r);
        System.out.println(" руб.");
    }

    public int getAge() {
        return age;
    }

    public static int getRub() {
        return rub;
    }
}
class Game{
    public static void game(){
        int a = 0;
        System.out.println("===================");
        System.out.println("Вы идёте в магазин\n"+"В какой магазин вы пойдете?");
        System.out.println("1.Продуктовый \n"+"2.Мясной \n"+"3.!@#$%^&");
        a = Situation.a(a);
        Scene.scene1(a);
        System.out.println("===================");
        Scene.scene3();
    }
}

class Scene{
    public static void scene1(int x) {
        switch (x) {
            case (1):
                System.out.println("===================");
                System.out.println("Вы идёте в Продуктовый\n" + "Какой товар вы купите?");
                System.out.println("1.Яблоки"+"\n" + "2.Апельсины"+"\n" + "3.Бананы");
                break;
            case (2):
                System.out.println("===================");
                System.out.println("Вы идёте в Мясной \n" + "Какой товар вы купите?");
                System.out.println("1.Рыба"+"\n" + "2.Мясной фарш"+"\n" + "3.Куриный шашлык");
                break;
            case (3):
                System.out.println("===================");
                System.out.println("Вы идёте в пространственный разлом\n" + "Какой товар вы купите?");
                System.out.println("1.1"+"\n" + "2.2"+"\n" + "3.3");
                break;
        }
        Situation.situation1(x);

    }
    public static void scene2(String x,int y){
        Person person = new Person();
        System.out.println("===================");
        System.out.println("Вы покупаете"+x+" -"+y+" руб."+"\n");
        person.setRub(y);
    }

    public static void scene3(){
        System.out.println("Куда вы пойдёте дальше?");
        System.out.println("1.Домой\n"+"2.Куда-то\n"+"3.За кудыкину гору");
        Situation.situation2();
    }

}
class Situation{
    public static void situation1(int x){
        int a = 0;
        Products products = new Products();
        int j = Situation.a(a);
        a = 3*x-(3-j)-1;
        String[] g = products.getB();
        int[] k = products.getC();
        String w = g[a];
        int l = k[a];
        Scene.scene2(w,l);
    }
    public static void situation2(){
        Person person = new Person();
        int a = 0;
        int j = Situation.a(a);
        System.out.println("===================");
        switch (j){
            case (1):
                break;
            case (2):
                System.out.println("Вы пошли в кругосветное путешествие +5 лет жизни");
                System.out.println("Ваш возраст "+(person.getAge()+5));
                break;
            case (3):
                if (Person.getRub()-100 < 0){
                    System.out.println("У вас нет денг, вы пошли домой");
                }else {
                    System.out.println("Вы купили помидоры -100 руб.");
                    person.setRub(100);
                }
                break;
        }
    }
    public static int a(int f){
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        if(f < 1){
            f = 1;
        } else if (f > 3) {
            f = 3;
        }

        return f;
    }


}
class Products{
    String[] b = new String[9];
    int[] c = new int[9];
    public Products() {
        b[0] = " Яблоки";
        c[0] = 800;
        b[1] = " Апельсины";
        c[1] = 1000;
        b[2] = " Бананы";
        c[2] = 900;

        b[3] = " Рыба";
        c[3] = 700;
        b[4] = " Мясной фарш";
        c[4] = 900;
        b[5] = " Куриный шашлык";
        c[5] = 1000;

        b[6] = " Время";
        c[6] = 1;
        b[7] = " Пространство";
        c[7] = 12;
        b[8] = " Тёмная материя";
        c[8] = 123;
    }

    public String[] getB() {
        return b;
    }

    public int[] getC() {
        return c;
    }
}
