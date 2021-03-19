/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringb;

/**
 *
 * @author levai
 */
public class StringB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //literál
        StringBuilder szoveg =new StringBuilder("töltöttkáposzta");
        szoveg.charAt(0);   //1.(első
        szoveg.length();
        szoveg.charAt(szoveg.length()-1); //utolsó
        szoveg.indexOf("rak");   
        szoveg.substring(0,5);  //(0-tol, 5-db szam az 5. már nincs benne)
        szoveg.substring(6); //6-tól ad vissza 
       
        //barmit lehet fűzni hozzá
        szoveg.append(2);
        szoveg.append(true);
        szoveg.append("barack");
        szoveg.toString().toUpperCase();  //2x adja vissza nagybetűsen
       
       
        
        //megedhatjuk hogy hova szúrjon be
        szoveg.insert(2,"alma");
        szoveg.insert(szoveg.length(),"alma");           //beszúrja a végére 
         
        
        //paraméter
        String s = "szép virág";
        StringBuilder sb2= new StringBuilder(szoveg);
        s.startsWith("szé");     //igaz-e hogy ez az eleje?
        s.endsWith("p");            //igaz- hogy ez a vége
        s.replace("é", "e");  //lecseréli
        s.replaceAll("é", "e");     //mindent lecserél 
        s.replaceFirst("s", "z");  //lecseréli az elsőt 
        s.contains("szép");   //true vagy false
        s.split("r");   //tördel
        s.split(" "); //elválaszt a szóköznél
        s.split("s", 1);  //csak 1 szót tesz a tömbbe és ezt jelenití meg 
//üres
         StringBuilder sb3= new StringBuilder();
         
         //karakterből álló tömb 
         char data[] = {'a', 'b', 'c'};
         
         //hozzáfűzés
        String szo = "Indul";
        szo = szo.concat(" a");
        szo = szo.concat(" gorog");
        szo = szo.concat(" aludni");
        System.out.println(szo);
    }  
    
}