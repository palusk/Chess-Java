public class wieza extends Figury {
    public wieza( int y, int x, String color)
    {
        pozx = x;
        pozy = y;
        kolor = color;
        nazwa = "W";
    }

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){
        boolean legal = false;
        
                    int k = 1;
                    if(skad_y == y && x!=skad_x)
                    {
                        if(x<skad_x){
                            k=-1;
                        }else k=1;

                        legal = true;
                        for(int i=skad_x; i!=x; i+=k){
                            if(tab[y][i] != null) legal = false;
                        }
                    }else if(skad_x == x && y!=skad_y)
                    {
                        if(y<skad_y){
                            k=-1;
                        }else k=1;

                        legal = true;
                        for(int i=skad_y; i!=y; i+=k){
                            if(tab[i][x] != null) legal = false;
                        }
                    }
                    
                    if(tab[y][x]!= null && tab[y][x].kolor==kolor){
                        legal = false;
                    }

                    zmianaPozycji(skad_y, skad_x, y, x, tab, legal);
}
}
