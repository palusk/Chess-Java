import java.lang.Math;

public class Figury {
    public boolean zbity = false;
    public String kolor;
    public int pozx;
    public int pozy;
    public String nazwa;
    public void bicie(){}

    // pozy == skad_y

    public void ruch(int skad_y, int skad_x, int y, int x, Figury tab[][]){}
    public void zmianaPozycji(int skad_y, int skad_x, int y, int x, Figury tab[][], boolean legal)
    {
    if(legal){
        tab[y][x] = tab[skad_y][skad_x];
        tab[skad_y][skad_x] = null;
        pozx = x;
        pozy = y;
        }else{
        System.out.print("BŁĘDNY RUCH!");
        System.out.println();
        }
    }

    public boolean mat(int skad_y, int skad_x, Figury tab[][], String kol)
    {
        boolean macik = false;

      while(macik==false){
// PIONKI
        if(kol=="biale"){
            if((tab[skad_y-1][skad_x+1].nazwa == "P" && tab[skad_y-1][skad_x+1].kolor!=kol) || (tab[skad_y-1][skad_x-1].nazwa == "P" && tab[skad_y-1][skad_x-1].kolor!=kol)){
                macik = true;
            }else if((tab[skad_y+1][skad_x+1].nazwa == "P" && tab[skad_y+1][skad_x+1].kolor!=kol) || (tab[skad_y+1][skad_x-1].nazwa == "P" && tab[skad_y+1][skad_x-1].kolor!=kol)){
                macik = true;
            }
        }
       

//WIEZA I HETMAN(POZIOM/PION)
            if(skad_x!=7){
                for(int i=skad_x+1; i<=7; i++){
                    if(tab[skad_y][i] != null && tab[skad_y][i].nazwa!="K" && tab[skad_y][i].kolor!=kol){
                        if(tab[skad_y][i].nazwa == "W" || tab[skad_y][i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }
            if(skad_x!=0){
                for(int i=skad_x-1; i>=0; i--){
                    if(tab[skad_y][i] != null && tab[skad_y][i].nazwa!="K" && tab[skad_y][i].kolor!=kol){
                        if(tab[skad_y][i].nazwa == "W" || tab[skad_y][i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }
            if(skad_y!=7){
                for(int i=skad_y+1; i<=7; i++){
                    if(tab[i][skad_x] != null && tab[i][skad_x].nazwa!="K" && tab[i][skad_x].kolor!=kol){
                        if(tab[i][skad_x].nazwa == "W" || tab[i][skad_x].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }       
            if(skad_y!=0){
                for(int i=skad_y-1; i>=0; i--){
                    if(tab[i][skad_x] != null && tab[i][skad_x].nazwa!="K" && tab[i][skad_x].kolor!=kol){
                        if(tab[i][skad_x].nazwa == "W" || tab[i][skad_x].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }


// GONIEC I HETMAN(UKOS)
            if(skad_y!=7 && skad_x!=7){
                for(int i=1; skad_x+i<=7 && skad_y+i<=7; i++){
                    if(tab[skad_y+i][skad_x+i] != null && tab[skad_y+i][skad_x+i].nazwa!="K" && tab[skad_y+i][skad_x+i].kolor!=kol){
                        if(tab[skad_y+i][skad_x+i].nazwa == "G" || tab[skad_y+i][skad_x+i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }
            if(skad_y!=0 && skad_x!=7){
                for(int i=1; skad_x+i<=7 && skad_y-i>=0; i++){
                    if(tab[skad_y-i][skad_x+i] != null && tab[skad_y-i][skad_x+i].nazwa!="K" && tab[skad_y-i][skad_x+i].kolor!=kol){
                        if(tab[skad_y-i][skad_x+i].nazwa == "G" || tab[skad_y-i][skad_x+i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }
            if(skad_y!=7 && skad_x!=0){
                for(int i=1; skad_x-i>=0 && skad_y+i<=7; i++){
                    if(tab[skad_y+i][skad_x-i] != null && tab[skad_y+i][skad_x-i].nazwa!="K" && tab[skad_y+i][skad_x-i].kolor!=kol){
                        if(tab[skad_y+i][skad_x-i].nazwa == "G" || tab[skad_y+i][skad_x-i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }
            if(skad_y!=0 && skad_x!=0){
                for(int i=1; skad_x-i>=0 && skad_y-i>=0; i++){
                    if(tab[skad_y-i][skad_x-i] != null && tab[skad_y-i][skad_x-i].nazwa!="K" && tab[skad_y-i][skad_x-i].kolor!=kol){
                        if(tab[skad_y-i][skad_x-i].nazwa == "G" || tab[skad_y-i][skad_x-i].nazwa == "H") macik = true;
                        break;  
                    }                    
                }
            }


//SKOCZEK
            int dy = 2;
            int dx = 1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = -2;
            dx = 1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = -2;
            dx = -1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = 2;
            dx = -1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = 1;
            dx = 2;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = 1;
            dx = -2;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = -1;
            dx = -2;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }
            dy = -1;
            dx = 2;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "S") macik=true;
            } 
        }

//KROL
            dy = 1;
            dx = 1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = 1;
            dx = -1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = -1;
            dx = 1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = -1;
            dx = -1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = 0;
            dx = 1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = 1;
            dx = 0;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = 0;
            dx = -1;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
            dy = -1;
            dx = 0;
            
            if(skad_x+dx<=7 && skad_x-dx>=0 && skad_y+dy<=7 && skad_y-dy>=0){
            if(tab[skad_y+dy][skad_x+dx]!=null && tab[skad_y+dy][skad_x+dx].nazwa!="K" && tab[skad_y+dy][skad_x+dx].kolor!=kol){
                if(tab[skad_y+dy][skad_x+dx].nazwa == "K") macik=true;
            } 
        }
        
    break;
    }
        return macik;
    }
}

