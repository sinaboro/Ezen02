package com.ezen.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Movie {
   
   public static void main(String[] args) {
      DataDAO dao = DataDAO.newInstance();
      dao.Setting();
      ContactManager cm = new ContactManager();
      cm.main(null);
   }  
}
