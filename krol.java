public class krol extends Figury{

   // Plansza hehe = new Plansza();

    public krol( int y, int x, String color)
    {
        pozx = x;
        pozy = y;
        kolor = color;
        nazwa = "K";
    }

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){
        boolean legal = false;              
                   
        int k1=skad_x-x;
        int k2=skad_y-y;
                   

                   
        if((k1==1 || k1==0 || k1==-1) && (k2==0 || k2==1 || k2==-1)){
            legal = true;
        }else legal = false;  

        if(mat(y, x, tab, kolor)==true){
            legal=false;
        }       
        

        if(tab[y][x]!= null && tab[y][x].kolor==kolor){
            legal = false;
        }

    zmianaPozycji(skad_y, skad_x, y, x, tab, legal);


    }
}
