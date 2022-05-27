import java.util.Scanner;

public class Plansza {

    public Figury[][] board = new Figury[8][8];
    public Plansza(){
//PIONKI:
        for(int i = 1; i<2; i++){
            for(int j = 0; j<8; j++){
                board[i][j] = new pionek(i,j,"czarny");
            }
        }
        for(int i = 6; i<7; i++){
            for(int j = 0; j<8; j++){
                board[i][j] = new pionek(i,j,"biale");
            }
        }

//FIGURY:
        for(int i = 0; i<2 ; i++)
        {
            board[0][7*i] = new wieza(0 , 7*i , "czarny");
            board[7][7*i] = new wieza(7 , 7*i , "biale");
        }

        for(int i = 0; i<2 ; i++)
        {
            board[0][1+5*i] = new skoczek(0, 1+5*i , "czarny");
            board[7][1+5*i] = new skoczek(7, 1+5*i , "biale");
        }

        for(int i = 0; i<2 ; i++)
        {
            board[0][2+3*i] = new goniec(0, 2+3*i , "czarny");
            board[7][2+3*i] = new goniec(7, 2+3*i , "biale");
        }

        board[0][3] = new krol(0, 3 , "czarny");
        board[7][3] = new krol(7, 3 , "biale");

        board[0][4] = new krolowa(0, 4 , "czarny");
        board[7][4] = new krolowa(7, 4 , "biale");

//POLA PUSTE:
        for(int i = 2; i<6; i++){
            for(int j = 0; j<8; j++){
                board[i][j] = null;
            }
        }
    }

    public void wypisz(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                System.out.print("| ");
                if(board[i][j]!= null){
                    if(board[i][j].kolor == "biale"){
                        System.out.print("B " + board[i][j].nazwa+" ");
                    }else System.out.print("C " + board[i][j].nazwa+" ");
                    System.out.print(i);
                    System.out.print(j);

                    System.out.print("  |"); }
                else System.out.print("        |");
            }
            System.out.println();
        }
    }


    public int turn(String kol){

        int x = -1;
        int y = -1;
        boolean sprawdzKolor = true;
        while(sprawdzKolor){
        System.out.print("Podaj y figury:");
        System.out.println();
    
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        int y1  = userInt;
    
        System.out.print("Podaj x figury: ");
        System.out.println();
        userInt = scanner.nextInt();
        int x1  = userInt;
    
        System.out.print("Podaj y celu:");
        System.out.println();
        userInt = scanner.nextInt();
        int y2  = userInt;
    
        System.out.print("Podaj x celu:");
        System.out.println();
        userInt = scanner.nextInt();
        int x2  = userInt;

        if(y1>7 || y1<0 || x1>7 || x1<0 || y2>7 || y2<0 || x2>7 || x2<0){
            System.out.print("Wybrano nie istniejace pole!");
            System.out.println();
        }else if(board[y1][x1] == null){ 
            System.out.print("Wybrano puste pole!");
            System.out.println();
        }else if(board[y1][x1].kolor!=kol){
            System.out.print("Wybrano zly kolor!");
            System.out.println();
        }else{
                board[y1][x1].ruch(y1, x1, y2, x2, board);
                x = x2;
                y = y2;
                sprawdzKolor = false;            
        }
        }

        if(board[y][x].nazwa=="K") return (x+y*10);
        else return -1;

    }


      //  board.mat(board, kol)
}

