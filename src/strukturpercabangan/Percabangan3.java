package strukturpercabangan;

public class Percabangan3 {
   
    public static void main(String[] args){
        System.out.println("[+] Masukkan nilai : ");
        int nilai = inputanUser.input.nextInt();
        if(nilai >= 80){
            System.out.println("[+] Nilai " + nilai + " mendapatkan indeks A" );
        }else if(nilai >= 70){
            System.out.println("[+] Nilai " + nilai + " mendapatkan indeks B");
        }else if(nilai >= 60){
            System.out.println("[+] Nilai " + nilai + " mendapatkan indeks C");
        } else if(nilai >= 50){
            System.out.println("[+] Nilai " + nilai + " mendapatkan indeks D");
        }else {
            System.out.println("[+] Nilai " + nilai + " mendapatkan indeks E");
        }
    }
}
