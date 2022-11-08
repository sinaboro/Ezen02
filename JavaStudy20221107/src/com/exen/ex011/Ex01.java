package com.exen.ex011;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

   public static void main(String[] args) {
      check();
   }

   static void check() {
      Scanner sc = new Scanner(System.in);
      List<String> check = new ArrayList<String>();
      while(true) {
         int size = check.size();
         System.out.println("아이디를 입력하세요.(최대 10명)");
         String id = sc.next();
         
         if(check.contains(id) == true) 
            {System.out.println("이미 등록된 이름입니다.");}
            
         else {
            System.out.println("등록이 완료되었습니다.");
            check.add(id);
         }
         System.out.println("------------------------------------------");
         
         if(size == 9) {
            System.out.println("※※※※※※ 저장공간이모두 찼습니다. ※※※※※※");
            for(int i=0; i<check.size();i++)
               System.out.printf(check.get(i) + " ");
            return;
         }
      }
   }
}