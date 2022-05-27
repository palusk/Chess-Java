public class skoczek extends Figury {
    public skoczek( int y, int x, String color)
    {
        pozx = x;
        pozy = y;
        kolor = color;
        nazwa = "S";
    }

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){
    boolean legal = false;   

    int dy = Math.abs(skad_y-y);
    int dx = Math.abs(skad_x-x);

    if((dx==2 && dy==1) || (dy==2 && dx==1)){
        legal = true;
    }


    if(tab[y][x]!= null && tab[y][x].kolor==kolor){
            legal = false;
    }

    zmianaPozycji(skad_y, skad_x, y, x, tab, legal);
    }
}
