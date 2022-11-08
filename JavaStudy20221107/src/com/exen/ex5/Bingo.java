package com.exen.ex5;

import java.util.*; 

class Bingo { 
      public static void main(String[] args) { 
//           Set set = new HashSet(); 
          Set set = new LinkedHashSet(); 
            int[][] board = new int[5][5]; 

            for(int i=0; set.size() < 25; i++) { 
            	  int str = (int)(Math.random()*50)+1;
            	  System.out.print(str + "\t");
                  set.add(str); 
            } 

            Iterator it = set.iterator(); 

            for(int i=0; i < board.length; i++) { 
                  for(int j=0; j < board[i].length; j++) { 
                        board[i][j] = (Integer)it.next();
                        System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]); 
                  } 
                  System.out.println(); 
            } 
      } // main
} 
