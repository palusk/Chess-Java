
import java.util.Scanner;
public class gra {

   static public plansza szachownica = new plansza();
   public void turn(){
    System.out.print("Podaj y pionka:");
    System.out.println();

    Scanner scanner = new Scanner(System.in);
    int userInt = scanner.nextInt();
    int x1  = userInt;

    System.out.print("Podaj x pionka: ");
    System.out.println();
    userInt = scanner.nextInt();
    int y1  = userInt;

    System.out.print("Podaj y celu:");
    System.out.println();
    userInt = scanner.nextInt();
    int x2  = userInt;

    System.out.print("Podaj x celu:");
    System.out.println();
    userInt = scanner.nextInt();
    int y2  = userInt;
    if(szachownica.board[x1][y1] != null)
    szachownica.board[x1][y1].ruch(y2,x2,szachownica.board);
    else {
        System.out.print("Wybrano puste pole!");
        System.out.println();
    }
   }
    public void wypisz(){
        
    for(int i = 0; i<8; i++){
        
        for(int j = 0; j<8; j++){
            System.out.print("| ");
            
            if(szachownica.board[i][j]!= null){
            System.out.print(szachownica.board[i][j].kolor);
           
           System.out.print(" ");
           System.out.print(szachownica.board[i][j].nazwa);
            }
           else 
           {
               System.out.print("   ");
           
            }
        }
        System.out.print("| ");
        System.out.println();
        System.out.print("-----------------------------------------");
        System.out.println();
        } 
}
    public static void main(String[] args){
        gra x = new gra();
        while(1==1){
        x.wypisz();
        System.out.print("RUCH BIAŁEGO");
        System.out.println();
        x.turn();
        x.wypisz();
        System.out.print("RUCH CZARNEGO");
        System.out.println();
        x.turn();
        }
}



}