import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("PERHITUNGAN GAJI DAN LEMBUR KARYAWAN");
        System.out.println("=====================================");

        //Golongan Gaji
        System.out.print("Masukkan Golongan Karyawan (A/B/C) : ");
        char golongan = inputan.next().toUpperCase().charAt(0);

        //Jam Lembur
        System.out.print("Jumlah Jam Lembur : ");
        int jamLembur = inputan.nextInt();

        double gajiPokok = 0;
        double persentaseLembur = 0;
        boolean valid= true;

        // Statemen IF gaji pokok berdasarkan GOlongan

    if (golongan == 'A') {
    gajiPokok = 5000000;
    } else if (golongan == 'B'){
    gajiPokok = 6500000;
    } else if (golongan == 'C'){
    gajiPokok = 9500000;
    } else {
    System.out.println(" \n[Error] Golongan salah! Masukkan Golongan yang sesuai (A, B, C");
    valid = false; 
}

    // Statemen IF penentuan presentase Lembur sesuai jam lembur
    if (valid) {
        if (jamLembur == 0) {
            persentaseLembur = 0.0;
        } else if (jamLembur == 1 ) {
            persentaseLembur = 0.30;
        } else if (jamLembur == 2 ) {
            persentaseLembur = 0.32;
        } else if (jamLembur == 3 ) {
            persentaseLembur = 0.34;
        } else if (jamLembur == 4 ) {
            persentaseLembur = 0.36;
        } else if (jamLembur >= 5 ) {
            persentaseLembur = 0.38;
        } else {
            System.out.println("\n[Error] Jam Lembur tidak boleh bernilai negatif dan desimal");
            valid = false;
        }
    }

    // perhitungan dan output hasil
    if (valid) {
        double gajiLembur = gajiPokok * persentaseLembur;
        double totalPenghasilan = gajiPokok + gajiLembur;

        System.out.println("\n---------------------------------------------");
        System.out.println("              TOTAL PENGHASILAN              ");
        System.out.println("---------------------------------------------");
        System.out.printf("Golongan Karyawan : %c\n", golongan);
        System.out.printf("Gaji Pokok        : Rp %,.2f\n", gajiPokok);
        System.out.printf("Total Jam Lembur  : %d Jam\n", jamLembur);
        System.out.printf("Persentase Lembur : %.0f%%\n", persentaseLembur * 100);
        System.out.printf("Gaji Lembur       : Rp %,.2f\n", gajiLembur);
        System.out.println("---------------------------------------------");
        System.out.printf("Total Penghasilan : Rp %,.2f\n", totalPenghasilan);
        System.out.println("=================TERIMA KASIH================");

    }
        inputan.close();
}
}


