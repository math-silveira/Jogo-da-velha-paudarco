/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Velha;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */

/*
    00  01  02
    10  11  12
    20  21  22
*/

public class Matriz{
    String[][] matriz = {{"t","t","t"},{"t","t","t"},{"t","t","t"}};
    ArrayList<Matriz> arvorePossibilidades;
    int turno;
    int minMaxValue;
    int i, j;

    public Matriz(String[][] matriz, int turno){
        //this.matriz = matriz.clone();
    	for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this.matriz[i][j] = matriz[i][j];
            }
        }
        this.turno = turno;
        this.minMaxValue = 50;
        arvorePossibilidades = new ArrayList<>();
    }    

    public Matriz(String[][] matriz, int turno, int i, int j){
        for(int k=0; k<3; k++){
	        for(int m=0; m<3; m++){
	            this.matriz[k][m] = matriz[k][m];
	        }
    	}
        this.turno = turno;
        this.minMaxValue = 50;
        this.i = i;
        this.j = j;
        arvorePossibilidades = new ArrayList<>();
    }

    public void verificaSeAcabou(int restam){
        
        
    	
        if(this.matriz[0][0].equals(this.matriz[1][1])){
            if(this.matriz[0][0].equals(this.matriz[2][2])){
                if(this.matriz[0][0].equals("X")){
                    this.minMaxValue = 1 + restam;
                    
                }
            }
        }

        if(this.matriz[0][2].equals(this.matriz[1][1])){
            if(this.matriz[0][2].equals(this.matriz[2][0])){
                if(this.matriz[0][2].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[0][0].equals(this.matriz[1][0])){
            if(this.matriz[0][0].equals(this.matriz[2][0])){
                if(this.matriz[0][0].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[0][1].equals(this.matriz[1][1])){
            if(this.matriz[0][1].equals(this.matriz[2][1])){
                if(this.matriz[0][1].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[0][2].equals(this.matriz[1][2])){
            if(this.matriz[0][2].equals(this.matriz[2][2])){
                if(this.matriz[0][2].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[0][0].equals(this.matriz[0][1])){
            if(this.matriz[0][0].equals(this.matriz[0][2])){
                if(this.matriz[0][0].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[1][0].equals(this.matriz[1][1])){
            if(this.matriz[1][0].equals(this.matriz[1][2])){
                if(this.matriz[1][0].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

        if(this.matriz[2][0].equals(this.matriz[2][1])){
            if(this.matriz[2][0].equals(this.matriz[2][2])){
                if(this.matriz[2][0].equals("X")){
                	this.minMaxValue = 1 + restam;
                	
                }
            }
        }

    

        if(this.matriz[0][0].equals(this.matriz[1][1])){
            if(this.matriz[0][0].equals(this.matriz[2][2])){
                if(this.matriz[0][0].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[0][2].equals(this.matriz[1][1])){
            if(this.matriz[0][2].equals(this.matriz[2][0])){
                if(this.matriz[0][2].equals("O")){
                    this.minMaxValue = -1 - restam;
                    
                }
            }
        }

        if(this.matriz[0][0].equals(this.matriz[1][0])){
            if(this.matriz[0][0].equals(this.matriz[2][0])){
                if(this.matriz[0][0].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[0][1].equals(this.matriz[1][1])){
            if(this.matriz[0][1].equals(this.matriz[2][1])){
                if(this.matriz[0][1].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[0][2].equals(this.matriz[1][2])){
            if(this.matriz[0][2].equals(this.matriz[2][2])){
                if(this.matriz[0][2].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[0][0].equals(this.matriz[0][1])){
            if(this.matriz[0][0].equals(this.matriz[0][2])){
                if(this.matriz[0][0].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[1][0].equals(this.matriz[1][1])){
            if(this.matriz[1][0].equals(this.matriz[1][2])){
                if(this.matriz[1][0].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }

        if(this.matriz[2][0].equals(this.matriz[2][1])){
            if(this.matriz[2][0].equals(this.matriz[2][2])){
                if(this.matriz[2][0].equals("O")){
                	this.minMaxValue = -1 - restam;
                	
                }
            }
        }
            

    }

    public void preenche(int restam){
    	
    	verificaSeAcabou(restam);
    	if(this.minMaxValue!=50) {
    		return;
    	}
    	else if(restam == 0) {
    		this.minMaxValue = 0;
    		return;
    	}
        else{
        	
            
            
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        if(this.matriz[i][j].equals("t")){
                            if(this.turno==0){
                                this.matriz[i][j] = "X";
                                
                                arvorePossibilidades.add(new Matriz(this.matriz, 1, i, j));
                                this.matriz[i][j] = "t";
                                
                            }
                            else{
                                this.matriz[i][j] = "O";
                                
                                arvorePossibilidades.add(new Matriz(this.matriz, 0));
                                this.matriz[i][j] = "t";                                
                            }
                        }
                    }
                    
                }
                

                for(int i=0; i<arvorePossibilidades.size(); i++){
                    arvorePossibilidades.get(i).preenche(restam-1);
                }
                
                
            	this.minMaxValue = arvorePossibilidades.get(0).minMaxValue;
                
                
                if(this.turno == 0) {
                	for(int i=0; i<arvorePossibilidades.size(); i++) {
                		if(arvorePossibilidades.get(i).minMaxValue > this.minMaxValue)
                			this.minMaxValue = arvorePossibilidades.get(i).minMaxValue;
                	}
                }
                else {
                	for(int i=0; i<arvorePossibilidades.size(); i++) {
                		if(arvorePossibilidades.get(i).minMaxValue < this.minMaxValue)
                			this.minMaxValue = arvorePossibilidades.get(i).minMaxValue;
                	}
                }

        }
        
        

    }

}
