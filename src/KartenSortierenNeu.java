import java.util.ArrayList;
import java.util.Collections;

public class KartenSortierenNeu {
    //symbol 0 = herz
    //symbol 1 = karo
    //symbol 2 = pik
    //symbol 3 = kreuz
    //wert  2 - 10, bube = 11, dame = 12, könig = 13, ass = 14

    private ArrayList<Karte>karten_stapel = new ArrayList<>();

    public KartenSortierenNeu(){
        initialisieren();
        System.out.println(karten_stapel);
        sortieren();
        System.out.println(karten_stapel);
    }

    public static void main(String[] args){
        KartenSortieren kartens = new KartenSortieren();
    }

    private void initialisieren(){
        Karte karte;
        for(int i = 2; i <= 14; i++){
            for(int j = 0; j < 4; j++){
                karte = new Karte(i,j);
                karten_stapel.add(karte);
            }
        }
        Collections.shuffle(karten_stapel);
    }
    private void sortieren(){
        Karte temp;
        for(int i = 0; i < karten_stapel.size(); i++){
            temp = karten_stapel.get(((karten_stapel.get(i).getWert()-2)*4)+karten_stapel.get(i).getSymbol());
            karten_stapel.set(((karten_stapel.get(i).getWert()-2)*4)+karten_stapel.get(i).getSymbol(),karten_stapel.get(i));
            karten_stapel.set(i,temp);
        }
    }


}
