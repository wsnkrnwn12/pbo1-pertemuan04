package Program;

public class While {
    public static void main(String[] args) {
        int bakmandi = 0;
        int penuh = 400;

        System.out.println("Isi Bak Mandi Sekarang : " + bakmandi + "liter");
        System.out.println("isi Bak Mandi Ketika penuh : " + penuh + "liter");

        while(bakmandi != penuh){
            bakmandi++;
            System.out.println("Sedang Mengisi Bak Mandi..");
            System.out.println("Isi Bak Mandi Sekarang : " + bakmandi + "liter");
        }

        System.out.println("Finale : Isi Bak Mandi Sekarang : " + bakmandi + "liter");
    }
}
