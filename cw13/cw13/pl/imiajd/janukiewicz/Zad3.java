package pl.imiajd.janukiewicz;
import java.util.*;

public class Zad3 {

    public static void main(String[] args)
    {
        Map<Student, String> hm = new TreeMap<Student, String>();

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
        Scanner in5 = new Scanner(System.in);

        String komenda ="";
        String imie ="";
        String nazwisko ="";
        int id=0;
        String ocena="";
        hm.put(new Student("Alan", "Janukiewicz", 3),  "bdb");
        hm.put(new Student("Mateusz", "Grzes", 4),  "dst");
        hm.put(new Student("Tomasz", "Karkulowski", 1),  "dop");
        hm.put(new Student("Michal", "Jakubowski", 5),  "bdb");
        hm.put(new Student("Jakub", "Klos", 2),  "dst");


        System.out.print("Komendy: Zmien, Pokaz, Zakoncz, Dodaj, Usun. \nKomenda: ");
        do{
            komenda = in1.nextLine();
            if (komenda.equals("Zmien")){
                System.out.print("Id ucznia: ");
                id=in4.nextInt();
                for (Map.Entry<Student, String> me : hm.entrySet()) {
                    if((me.getKey()).id==id){
                        System.out.print("Nowa ocene ucznia: ");
                        ocena=in3.nextLine();
                        hm.put(me.getKey(),  ocena);
                    }
                }
            }
            if (komenda.equals("Usun")){
                System.out.print("Id ucznia: ");
                id=in4.nextInt();
                for (Map.Entry<Student, String> me :
                        hm.entrySet()) {

                    if((me.getKey()).id==id){
                        hm.remove(me.getKey());
                    }
                }
            }
            if (komenda.equals("Dodaj")){
                System.out.print("Imie ucznia: ");
                imie=in2.nextLine();
                System.out.print("Nazwisko ucznia: ");
                nazwisko=in5.nextLine();
                System.out.print("Id ucznia: ");
                id=in4.nextInt();
                System.out.print("Ocene ucznia: ");
                ocena=in3.nextLine();
                hm.put(new Student(imie, nazwisko, id),  ocena);
            }
            if (komenda.equals("pokaz")){
                for (Map.Entry<Student, String> e :
                        hm.entrySet()) {
                    System.out.println(e.getKey().id + " "
                            + e.getKey().imie + " " + e.getKey().nazwisko + " "
                            + e.getValue());
                }
            }
        }while(!komenda.equals("Zakoncz"));
    }
    static class Student implements Comparable<Student>  {
        public String imie;
        public String nazwisko;
        public int id;
        public String getImie() {
            return imie;
        }
        public String getNazwisko() {
            return nazwisko;
        }
        public int getId() {
            return id;
        }
        public Student(String imie, String nazwisko, int id) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.id=id;
        }
        public int compareTo(Student e)
        {
            int l1 = (this.nazwisko).length();
            int l2 = (e.nazwisko).length();
            int lmin = Math.min(l1, l2);
            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int)(this.nazwisko).charAt(i);
                int str2_ch = (int)(e.nazwisko).charAt(i);
                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
            if (l1 != l2) {
                return l1 - l2;
            }
            else {
                int i1 = (this.imie).length();
                int i2 = (e.imie).length();
                int minimum = Math.min(l1, l2);
                for (int i = 0; i < lmin; i++) {
                    int str1_ch = (int)(this.imie).charAt(i);
                    int str2_ch = (int)(e.imie).charAt(i);

                    if (str1_ch != str2_ch) {
                        return str1_ch - str2_ch;
                    }
                }
                if (i1 != i2) {
                    return i1 - i2;
                }
                else {
                    return this.id - e.id;
                }
            }

        }
    }

}
