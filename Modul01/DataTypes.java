import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[]args){

  String namaDepan = "Ab";
  String namaTengah ="dil";
  String namaBelakang = "lah";
  int usia = 18;
  int targetTahunKuliah = 4;
  double ipk = 3.89764512;
  char nilaiAbjad = 'A' ;
  boolean tampan = true;

  System.out.println("Nama depan:" + namaDepan);
  System.out.println("Nama tengah:" + namaTengah);
  System.out.println("Nama belakang:" + namaBelakang);
  System.out.println("Nama Usia : " + usia);
  System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
  System.out.println("IPK : " + ipk);
  System.out.println("Nilai PBO : " + nilaiAbjad);
  System.out.println("Tampan : " + tampan);
  
  JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);

 }
}