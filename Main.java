import java.util.Scanner;

public class Cole {


    /**
     * 1. Escriu “Hola món!” per pantalla.
     *
     * @return saludo
     */
    public static void holaMon() {
        System.out.println("Hola món!");
    }

    //   2.

    /**
     * Llegeix dos nombres reals i escriu la seva suma, resta, producte i quocient.
     *
     * @param numero1 dividendo
     * @param numero2 divisor
     * @return print
     */
    public static void conjuntoDeOperaciones(int numero1, int numero2) {
        System.out.println("suma:" + (numero1 + numero2) + "\nresta: " + (numero1 - numero2) + "\nproducto:" + (numero1 / numero2) + "\ncoeciente: " + (numero1 % numero2));
    }

    /**
     * 3. Llegeix el radi d’un cercle i escriu el seu perímetre i àrea.
     *
     * @param radio
     */
    public static void perimetreYArea(double radio) {

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * (Math.pow(radio, 2));

        System.out.println("perimetro: " + perimetro + " || Area: " + area);
    }

    /**
     * 4. Llegeix tres nombres reals i troba la seva mitja aritmètica.
     *
     * @param aritmetica1
     * @param aritmetica2
     * @param aritmetica3
     * @return mitja
     */

    public static int mediaAritmetica(int aritmetica1, int aritmetica2, int aritmetica3) {
        return (aritmetica1 + aritmetica2 + aritmetica3) / 3;
    }

    /**
     * 5. Llegeix la base i l'altura d'un triangle i escriu la seva àrea.
     *
     * @param base
     * @param altura
     * @return area del triangle
     */
    public static int alturaTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }


    /**
     *
     * 6. Llegeix el preu d'un producte, l'IVA (en %) i el descompte (en %) a aplicar. Escriu el
     * preu final del producte.
     *
     * @param precioProducto
     * @param iva
     * @param descuento
     * @return preu final
     */
    public static double precioMasIvaMasDescuento(double precioProducto, int iva, int descuento) {

        return ((precioProducto * (((double) descuento) / 100.0)) * ((((double) iva) / 100.0) + 1));
    }

    /**
     * Calcula l'àrea lateral i el volum d'un cilindre recte, introduint per teclat els valors del
     * radi i l'altura.
     *V =PI⋅r²⋅h AL=2⋅PI⋅r⋅h
     *
     * @param r radio
     * @param h height
     */
    public static void areaLateralYvolumenCilindro(int r, int h) {
        double volumen = Math.PI * Math.pow(r, 2) * h;
        double areaLateral = 2 * Math.PI * r * h;

        System.out.println("volumen: " + volumen + " || " + "area lateral: " + areaLateral);
    }


    /**
     * 8. Llegeix un nombre enter d’hores, minuts i segons i escriu el nombre de segons equivalents
     *
     * @param horas
     * @param minutos
     * @param segundos
     * @return segons
     */
    public static int segonsDeHorasMinutosSegundo(int horas, int minutos, int segundos) {
        return segundos + (minutos * 60) + (horas * 3600);


    }

    /**
     * 9. Llegeix un nombre enter de segons i escriu el nombre d’hores, minuts i segons
     * equivalents en format h:m:s.
     * @param segundos
     */
    public static void horasMinutosSegundosDesegundos(int segundos) {

        int segundosRestantes = segundos;
        int horasTotales = segundos / 3600;

        segundosRestantes = segundosRestantes % 3600;

        int minutosTotales = segundosRestantes / 60;
        segundosRestantes = segundos % 60;

        System.out.println("horas: " + horasTotales + "\n" + "minutos: " + minutosTotales + "\n" + "segundos: " + segundosRestantes);
    }

    /**
     *10. Llegeix un nombre enter que designa un període de temps expressats en segons,
     * escriu l'equivalent en dies, hores, minuts i segons.
     * @param segundos
     */
    public static void  diasHorasMinutosSegundosDeSegundos(int segundos){
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        int dias = horas / 24;
        int horasRestantes = horas % 24;

        System.out.println("stats del dia" + "\ndias: " + dias + "\nhoras: " + horasRestantes + "\nminutos: " + minutosRestantes + "\nsegundos: " + segundosRestantes);
    }

    /**13. Llegeix una temperatura en graus Fahrenheit i escriu el valor equivalent en graus
     *Celsius. Dedueix la fórmula adient a partir de la fórmula de l'exercici anterior.
     * Llegeix la distància entre dos aeroports en km i la velocitat mitjana de l’avió en km/h,
     * i escriu el temps estimat de vol en format h:m.
     * @param km
     * @param horasKm
     * @return
     */
    public static String distanciaEntreAeropuertos(float km, float horasKm){
        int totalMinutos = Math.round((km / horasKm) * 60);

        int horasFinal = totalMinutos / 60;
        int minutosFinal = totalMinutos % 60;

        return String.format("%d:%d", horasFinal, minutosFinal);
    }

    public static float celsiusAFahrenheit(float celsius){
        return ((float) 9 /5 * celsius) + 32;
    }
    public static void main(String[] args) {

        System.out.println(celsiusAFahrenheit(20));
        
    }


}
