import java.util.ArrayList;
import java.util.Collections;

public class KartenSortieren {
    //symbol 0 = herz
    //symbol 1 = karo
    //symbol 2 = pik
    //symbol 3 = kreuz
    //wert  2 - 10, bube = 11, dame = 12, könig = 13, ass = 14

    private ArrayList<Karte>karten_stapel = new ArrayList<>();
    private Karte[]sortierter_stapel = new Karte[52];

    public KartenSortieren(){
        initialisieren();
        System.out.println(karten_stapel);
        sortieren();
        for(int i = 0; i < 52; i++){
            System.out.print(sortierter_stapel[i]);
        }
    }

    public static void main(String[] args){
        KartenSortieren kartens = new KartenSortieren();
    }

    private void sortieren(){
        Karte karte;
        while(karten_stapel.size() > 0){
            sortierter_stapel[((karten_stapel.get(0).getWert()-2)*4)+karten_stapel.get(0).getSymbol()]=karten_stapel.get(0);
            karten_stapel.remove(0);
        }
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
}
