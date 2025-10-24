import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama lengkap anda: ");
        String nama = scanner.nextLine();
        System.out.print("masukan umur anda: ");
        String umur = scanner.nextLine();
        System.out.println("halo nama saya: " + nama);
        System.out.println("umur saya: " + umur);
        System.out.print("masukan nilai anda: ");
        String nilai = scanner.nextLine();
        int nilaiInt = Integer.parseInt(nilai);

        if (nilaiInt >= 75) {
            System.out.println("selamat anda lulus");
        } else {
            System.out.println("maaf anda tidak lulus");
        }
    }

}
