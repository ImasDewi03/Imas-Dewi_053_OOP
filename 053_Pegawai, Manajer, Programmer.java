//Imas Dewi O.N.I 21091397053
public class Pegawai {
   protected String nama;
   protected int gaji;

   public Pegawai(String nama, int gaji) {
    this.nama = nama;
    this.gaji = gaji;
   }
   public int infoGaji(){
    return gaji;
   }
}
public class Manajer extends Pegawai{
    private int tunjangan;
    public Manajer(int tunjangan, String nama, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    public infoGaji() {
        return gaji;
    }
    public int infoTunjangan (){
        return tunjangan;
    }
}
public class Programmer extends Pegawai {
    private int bonus;
    public Programmer(int bonus, String nama, int gaji) {
        super(nama, gaji);
        this.bonus = bonus;
    }
    public int infoGaji (){
        return gaji;
    }
    public infoBonus (){
        return bonus;
    }
}
public class Bayaran {
    public int hitungbayaran(Pegawai peg){
        int uang = peg.infoGaji();
        if (peg instanceof Manajer)
        uang += ((Manajer)peg).infoTunjangan();
        else if (peg instanceof Programmer)
        uang += ((Programmer)peg).infoBonus();
        return uang;
    }
public static void main(String args[]){
    Manajer man = new Manajer(800,"Martin", 50);
    Programmer prog = new Programmer(600, "Vian", 30);
    Bayaran hr = new Bayaran();
    System.out.printIn("Bayaran untuk Manajer : " + hr.hitungayaran(man));
    System.out.printIn("Bayaran untuk Programmer : " + hr.hitungbayaran(prog));
}
}
