/*************************************
 Tekijä: Nikolai Markalainen
 Jakson numero: AVE1017-3009 Java ohjelmointi
 Jakson tehtävänumero: Jakso 2 Tehtävät 3.1 - 3.4
 Päiväys: 28.05.2022
 *************************************/


package tehtavatViikko3NikolaiMarkalainen;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        //3.1
        Scanner sc = new Scanner(System.in);
        System.out.println("Syota vuosi: ");
        int vuosi = sc.nextInt();

        if(vuosi % 4 == 0){
            System.out.println("On karkausvuosi");
        }
        else{
            System.out.println("Ei ole karkausvuosi");
        }
        //3.2
        System.out.println("Syota luku: ");
        int luku = sc.nextInt();
        if(luku % 2 == 0){
            System.out.println("Luku on parillinen");
        }
        else{
            System.out.println("Luku on pariton");
        }
        //3.3
        System.out.println("Syota 5 lukua");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        if (a > b && a > c && a > d && a > e){
            System.out.println("Ensimmainen luku oli suurin");
        }
        if(b > a && b > c && b > d && b > e){
            System.out.println("Toinen luku oli suurin");
        }
        if(c > a && c > b && c > d && c > e){
            System.out.println("Kolmas luku oli suurin");
        }
        if(d > a && d > b && d > c && d > e){
            System.out.println("Neljas luku oli suurin");
        }
        if (e > a && e > b && e > c && e > d){
            System.out.println("Viimeinen luku oli suurin");
        }
        //3.4
        System.out.println("Syota luku 1 - 20 valilta ");
        int arvo = sc.nextInt();
        if(arvo < 1 || arvo > 20){
            System.out.println("Arvo ei ole 1 - 20 valilta");
        }
        else{
            System.out.println("Arvo oli 1 - 20 valilta");
        }
    }

}