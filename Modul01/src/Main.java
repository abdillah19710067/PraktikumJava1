import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Ab";
        String namaTengah = "dil";
        String namaBelakang = "lah";
        int usia = 18;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5,10));
        System.out.println(namaLengkap.replace("dil", "Bar"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split("");

        for (String nama : namaArray) {
            System.out.println(nama);

            System.out.println(uniskaString);

            System.out.println(namaDepan + namaTengah + namaBelakang);
        }
    }
}
