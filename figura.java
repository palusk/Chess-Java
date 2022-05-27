public class figura {
    public boolean zbity = false;
    public String kolor;
    public int pozx;
    public String nazwa;
    public int pozy;
    public void bicie(){}
    public void ruch(int x, int y, figura[][] tab){
        boolean legal = false;
        switch(nazwa){
            case "P":
            {
                if(pozy-y == 1)
                legal = true;
                if(pozy==6 && y==4)
                legal = true;
                if((tab[x][y]!=null) && (pozx-1==x && pozy-1==y || pozx+1 == x && pozy+1 == x))
                {
                    legal = true;
                }
                if(pozy == y)
                legal = false;
                /*
                if(kolor=="B"){
                    System.out.print("AAAAAAAAAAAAAAAAA");
                if(pozy-y == 1)
                legal = true;
                if(pozy==6 && y==4)
                legal = true;
                if((tab[x][y]!=null) && (pozx-1==x && pozy-1==y || pozx+1 == x && pozy+1 == x))
                {
                    legal = true;
                }
                if(pozy == y)
                legal = false;}else{
                    
                    if(y-pozy == 1)
                    legal = true;
                    if(pozy==1 && y==3)
                    legal = true;
                    if((tab[x][y]!=null) && (pozx-1==x && pozy-1==y || pozx+1 == x && pozy+1 == x))
                    {
                        legal = true; 
                    }
                    if(pozy == y)
                    legal = false;
                }*/
            break;
            }
            case "hetman":
            {
            break;
            }
            case "krol":
            {
            break;
            }
            case "goniec":
            {
            break;
            }
            case "skoczek":
            {
            break;
            }
            case "wieza":
            {
             break;
            }
        }
        if(legal){
        tab[y][x] = tab[pozy][pozx];
        tab[pozy][pozx] = null;
        pozx = x;
        pozy = y;
        }else{
        System.out.print("BŁĘDNY RUCH!");
        System.out.println();
        }
    }
}
