package condicionals;


import java.util.Scanner;

public class MatriculaPoblenou {

    static Scanner scanner = new Scanner(System.in);

    public static boolean inpb() {
        return scanner.nextBoolean();
    }

    public static int inpi() {
        return Integer.parseInt(scanner.nextLine());
    }


    public static void main(String[] args) {

        // porcentajes no -80 ni UF
        final double FAMILIA = getPorcentaje(50);
        final double NORMALMP = getPorcentaje(50);
        final double ESPECIALMP = getPorcentaje(20);
        final double MAYOR = getPorcentaje(10);

        final double UFS = 25.0;
        final double MATRICULAHONOR = 80;

        /*
            1. FAMILIA -> bolean
            2. MATRICULAHONOR -> boleano
            3. NORMALMP -> boleano
            4. ESPECIALMP -> entero
            5. MAYOR ->
            6. CURSO COMPLETO -> boleano
            7. UFS -> INT

         */



    }

    private static double getPorcentaje(int porcentaje) {
        return porcentaje / 100.0;
    }


}
