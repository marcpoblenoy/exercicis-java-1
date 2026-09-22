import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        Activitats Seqüencials
//        1. Escriu “Hola món!” per pantalla.

        System.out.println("Hola món!");
//        2. Llegeix dos nombres reals i escriu la seva suma, resta, producte i quocient.

        int numero1 = sc.nextInt();
        System.out.println("introduce el primer numero");

        int numero2 = sc.nextInt();
        System.out.println("introduce el segundo numero");

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 % numero2);

//        3. Llegeix el radi d’un cercle i escriu el seu perímetre i àrea.

        System.out.println("introduce el radio");
        double radioInp = sc.nextFloat();

        double perimetro = 2 * Math.PI * radioInp;
        double area = Math.PI * (Math.pow(radioInp, 2));
        // P = π ⋅ r2

        System.out.print("perimetro: " + perimetro + "\n" + "area: " + area);

//        4. Llegeix tres nombres reals i troba la seva mitja aritmètica.

        int aritmetica1 = sc.nextInt();

//        5. Llegeix la base i l'altura d'un triangle i escriu la seva àrea.
//        6. Llegeix el preu d'un producte, l'IVA (en %) i el descompte (en %) a aplicar. Escriu el
//        preu final del producte.
//        7. Calcula l'àrea lateral i el volum d'un cilindre recte, introduint per teclat els valors del
//        radi i l'altura. V =PI⋅r²⋅h AL=2⋅PI⋅r⋅h
//        8. Llegeix un nombre enter d’hores, minuts i segons i escriu el nombre de segons
//        equivalents.
//        9. Llegeix un nombre enter de segons i escriu el nombre d’hores, minuts i segons
//        equivalents en format h:m:s.
//        10. Llegeix un nombre enter que designa un període de temps expressats en segons,
//                escriu l'equivalent en dies, hores, minuts i segons.
//        11. Llegeix la distància entre dos aeroports en km i la velocitat mitjana de l’avió en km/h,
//                i escriu el temps estimat de vol en format h:m.
//        12. Llegeix una temperatura en graus Celsius i escriu el valor equivalent en graus
//        Fahrenheit. L'escala Celsius assigna al punt de fusió del gel el valor 0 i al punt
//        d'ebullició de l'aigua el valor 100, mentre que l'escala Fahrenheit assigna a aquest
//        punts els valors 32 i 212. D'aquí es dedueix la fórmula:
//        t
//                f = 9/5*tc + 32
//        13. Llegeix una temperatura en graus Fahrenheit i escriu el valor equivalent en graus
//        Celsius. Dedueix la fórmula adient a partir de la fórmula de l'exercici anterior.
//        14. Llegeix la distància del satèl·lit a la superfície terrestre en km, calcula el període de
//        rotació del satèl·lit en torn del planeta i l’escriu en hores i minuts. El període de
//        rotació del satèl·lit es calcula per la fórmula: t= 2π(R+h)
//        3/2
//                /R √g segons on h és la
//        distància del satèl·lit a la superfície terrestre en metres, R=6371000 el radi terrestre
//        en metres i g=9.81 l’acceleració de la gravetat a la superfície del planeta.
//        15. Llegeix la velocitat inicial del projectil en m/s i l’angle de tir en graus sexagesimals i
//        escriu el temps de vol en segons i el punt d’impacte en metres. El temps de vol en
//        segons i la distància d’impacte en metres es calculen amb les fórmules: t=
//                2⋅v⋅sin(a)/g , d= v
//        2 ⋅sin(2a)/g on v és la velocitat inicial del projectil en m/s, g=9.81
//        m/s
//        2
//        l’acceleració de la gravetat a la superfície del planeta Terra i a és l’angle de tir
//        en graus sexagesimals.
//        16. Llegeix les coordenades de dos punts per trobar les coordenades del seu punt mig,
//        segons la següent fórmula: Siguin els punts a=(ax
//                ,ay
//) i b=(bx
//                ,by
//) llavors el seu punt
//        mig és:
//        m= (ax+bx
//        )/2 , (ay
//                +by
//        )/2
//        17. Llegeix un nombre enter no negatiu i un altre nombre enter no negatiu que indica la
//        posició de les seves xifres i escriu la xifra que ocupa aquesta posició. Les unitats
//        estan a la posició 1, les desenes a la posició 2, etc.
//        18. Llegeix dos nombres reals, posa'ls en dues variables, intercanvia el contingut de les
//        dues variables i escriu el seu valor .
//        19. Codifica un programa que calculi l'àrea d'un trapezi, introduint per teclat els valors de
//        les bases i la seva altura.
//        A= (B+b)⋅a/ 2
//        20. Codifica un programa que llegeixi el valor corresponent a una distància en milles
//        marines i les escrigui expressades en metros. 1milla marina = 1852 metros.
//        21. Codifica un programa que calculi i mostri per pantalla el percentatge descomptat en
//        una compra a partir del preu de la tarifa i del preu pagat (suposarem que no s'aplica
//        IVA).
//        22. Codifica un programa que calculi la velocitat d'un tren en km/hora, coneixent la
//        distància recorreguda en metros i el temps emprat en segons per recórrer aquesta
//        distància.
//        23. Codifica un programa que donats tres enters que representen hores, minuts i
//        segons, doni l'equivalent en segons.
//        24. Codifica un programa que donats tres enters que representen hores, minuts i
//        segons, sumi un segon i doni el resultat en el mateix format.
    }
}
