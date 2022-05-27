public class plansza {
    public figura[][] board = new figura[8][8];
    public plansza(){

        for(int i = 1; i<2; i++){
            for(int j = 0; j<8; j++){
            board[i][j] = new pionek(i,j,"C");
            }
        }
        for(int i = 6; i<7; i++){
            for(int j = 0; j<8; j++){
            board[i][j] = new pionek(i,j,"B");
            }
        }
for(int i = 0; i<2 ; i++)
{ 
    board[0][7*i] = new wieza(0 , 7*i , "C");
    board[7][7*i] = new wieza(7 , 7*i , "B");
}

for(int i = 0; i<2 ; i++)
{   
    board[0][1+4*i] = new skoczek(0, 1+4*i , "C");
    board[7][1+4*i] = new skoczek(7, 1+4*i , "B");
}

for(int i = 0; i<2 ; i++)
{   
    board[0][2+4*i] = new goniec(0, 2+4*i , "C");
    board[7][2+4*i] = new goniec(7, 2+4*i , "B");
}

board[0][3] = new krol(0, 3 , "C");
board[7][3] = new krol(7, 3 , "B");

board[0][4] = new hetman(0, 4 , "C");
board[7][4] = new hetman(7, 4 , "B");
        for(int i = 2; i<6; i++){
            for(int j = 0; j<8; j++){
                board[i][j] = null;
            }
        }
    } 

}
