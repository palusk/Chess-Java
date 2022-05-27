public class goniec extends Figury{
    public goniec( int y, int x, String color)
    {
        pozx = x;
        pozy = y;
        kolor = color;
        nazwa = "G";
    }

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){
        boolean legal = false;
        
    int k1 = 1;                
    int k2 = 1;
    int dy = Math.abs(skad_y-y);
    int dx = Math.abs(skad_x-x);
   if(dy == dx)
   {
       if(x<skad_x){
           k1=-1;
       }else k1=1;

       if(y<skad_y){
           k2=-1;
       }else k2=1;

       legal = true;
       for(int i=1; skad_y+i*k2!=y && skad_x+i*k1!=x; i++){
           {
               if(tab[skad_y+i*k2][skad_x+i*k1] != null) legal = false;
           }
        }
   }

   if(tab[y][x]!= null && tab[y][x].kolor==kolor){
    legal = false;
}

   zmianaPozycji(skad_y, skad_x, y, x, tab, legal);
}

}

