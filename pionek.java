public class pionek extends Figury {
    public pionek( int y, int x, String color)
    {
        pozx = x;
        pozy = y;
        kolor = color;
        nazwa = "P";
    }

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){
        boolean legal = false;

    if(kolor == "czarny"){
    if(y-skad_y == 1)
                legal = true;
                if(skad_y==1 && y==3)
                legal = true;
                if((tab[y][x]!=null) && (skad_x-1==x && skad_y+1==y || skad_x+1 == x && skad_y+1 == y) && tab[y][x].kolor!=kolor)
                {
                    legal = true; 
                    bicie();
                }
                if((tab[y][x]!=null) && (skad_x==x))
                {
                legal = false;
                }

            if(skad_y == y)
            {
            legal = false;
            }
            if(skad_y==1 && y==3){
                if((tab[y-1][x]!=null) && (skad_x==x))
                {
                    legal = false;
                }
            }
        }else{
            if(skad_y-y == 1)
            legal = true;
        if(skad_y==6 && y==4){
            legal = true;
    }
        if((tab[y][x]!=null) && (skad_x-1==x && skad_y-1==y || skad_x+1 == x && skad_y-1 == y) && tab[y][x].kolor!=kolor){
            legal = true;
            bicie();
        }
        if((tab[y][x]!=null) && (skad_x==x)){
            legal = false;
        }

        if(skad_y == y)
        legal = false;
        if(skad_y==6 && y==4){
            if((tab[x][y-1]!=null) && (skad_x==x)) {
               legal = false;
            }
    }
    }

    zmianaPozycji(skad_y, skad_x, y, x, tab, legal);
}

}
