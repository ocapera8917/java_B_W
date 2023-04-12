/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_b.w;
public class Juego {
    String[] array_board = new String[7];

    public Juego() {
        
        array_board[0] = "B";
        array_board[1] = "B";
        array_board[2] = "B";
        array_board[3] = "-";
        array_board[4] = "W";
        array_board[5] = "W";
        array_board[6] = "W";
    }
    
    public void ImprimeArray(){
        for (int i = 0; i < array_board.length; i++) {
            System.out.println("Los datos son :"+array_board[i]);
        }
    }
    
}
