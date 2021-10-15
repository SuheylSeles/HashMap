package com.phexum.HashMap;

/**
 * Hello world!
 *
 */

import java.io.*; 
import java.util.*; 

class Map { 
  
  public static void main(String args[]) 
  { 
	  
      HashMap<String, String> hm1 = new HashMap<String, String>(); 
  
      HashMap<String, String> hm2 = new HashMap<String, String>(); 

      HashMap<String, String> hm3 = new HashMap<String, String>();
      
      //if()
      
      hm1.put("a", "kalın-sesli"); 
      hm1.put("ı", "kalın-sesli"); 
      hm1.put("o", "kalın-sesli"); 
      hm1.put("u", "kalın-sesli"); 

      hm2.put("e", "ince-sesli"); 
      hm2.put("i", "ince-sesli"); 
      hm2.put("ö", "ince-sesli"); 
      hm2.put("ü", "ince-sesli"); 

      hm3.put("b", "sessiz"); 
      hm3.put("c", "sessiz"); 
      hm3.put("d", "sessiz"); 
      hm3.put("f", "sessiz"); 
      hm3.put("g", "sessiz"); 
      hm3.put("h", "sessiz"); 
      hm3.put("j", "sessiz"); 
      hm3.put("k", "sessiz"); 
      hm3.put("l", "sessiz"); 
      hm3.put("m", "sessiz"); 
      hm3.put("n", "sessiz"); 
      hm3.put("p", "sessiz"); 
      hm3.put("r", "sessiz"); 
      hm3.put("s", "sessiz"); 
      hm3.put("t", "sessiz"); 
      hm3.put("v", "sessiz"); 
      hm3.put("y", "sessiz");
      hm3.put("z", "sessiz");
      
      
      
      
      
      System.out.println("Sesli kalınları göster : "
                         + hm1); 
      System.out.println("Sesli inceleri göster : "
                         + hm2); 
      System.out.println("Sessizleri göster : "
              + hm3); 
  } 
}



// B A Ş K A  B İ R  Ö R N E K T İ R !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


/**

import java.util.HashMap;

public class Map {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("Norway")); 
  }
}


*/
