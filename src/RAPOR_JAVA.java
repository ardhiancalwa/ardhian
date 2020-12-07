
import java.util.Scanner;

public class RAPOR_JAVA {
//Method 1
    public static void cetakNama(String nama){
        System.out.println("Nama :"+nama);
    }
    public static void cetakKelas(String kelas){
        System.out.println("Kelas :"+kelas);
    }
    public static void cetakAbsen(String absen){
        System.out.println("Absen :"+absen);
    }
    public static void cetakJurusan(String jurusan){
        System.out.println("Jurusan :"+jurusan);
    }
    
    //Method 2        
    public static void main(String[] args) {
        //Penginputan
        Scanner input = new Scanner(System.in);
        int matematika,fisika,kimia,sejarah,pkn;
        int password = 1;
        double ratarata;
        String grade;
        
        //output Method 1
        cetakNama("Ardhian Calwa Nugraha");
        cetakKelas("XRPL3");
        cetakAbsen("Tiga (03)");
        cetakJurusan("RPL");
        
        //Perulangan
        while(password != 886){
            System.out.println("Masukkan Password: ");
            password = input.nextInt();
        }
        
        //Percabangan
        System.out.println("Masukkan Nilai Matematika: ");
        matematika = input.nextInt();
        
        if(matematika >= 90){
            grade = "A";
        }else if (matematika >= 80){
            grade = "B";
        }else if (matematika >= 75){
            grade = "c";
        }else{
            grade = "D";
            System.out.println("Remidial dibuka pada tanggal 7 Desember 2020 pukul 07.00 AM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan Nilai Fisika: ");
        fisika = input.nextInt();
        
        if(fisika >= 90){
            grade = "A";
        }else if (fisika >= 80){
            grade = "B";
        }else if (fisika >= 75){
            grade = "c";
        }else{
            grade = "D";
            System.out.println("Remidial dibuka pada tanggal 6 Desember 2020 pukul 09.00 AM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan Nilai Kimia: ");
        kimia = input.nextInt();
        
        if(kimia >= 90){
            grade = "A";
        }else if (kimia >= 80){
            grade = "B";
        }else if (kimia >= 73){
            grade = "c";
        }else{
            grade = "D";
            System.out.println("Remidial dibuka pada tanggal 8 Desember 2020 pukul 10.00 AM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan Nilai Sejarah: ");
        sejarah = input.nextInt();
        
        if(sejarah >= 90){
            grade = "A";
        }else if (sejarah >= 80){
            grade = "B";
        }else if (sejarah >= 70){
            grade = "c";
        }else{
            grade = "D";
            System.out.println("Remidial dibuka pada tanggal 7 Desember 2020 pukul 11.00 AM");
        }
        System.out.println("Grade :"+grade);
        
        System.out.println("Masukkan Nilai PKn: ");
        pkn = input.nextInt();
        
        if(pkn >= 90){
            grade = "A";
        }else if (pkn >= 80){
            grade = "B";
        }else if (pkn >= 70){
            grade = "c";
        }else{
            grade = "D";
            System.out.println("Remidial dibuka pada tanggal 7 Desember 2020 pukul 11.00 AM");
        }
        System.out.println("Grade :"+grade);
        
        ratarata=(matematika+fisika+kimia+sejarah+pkn)/5;
        System.out.println("Rata-Rata Nilai ="+ratarata);
    }
    
}