/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermain;

/**
 *
 * @author 206
 */
public class taller3 {
    String txt,prueba,firstname,lastname;
    //punto 1
    public String punto1(){
         txt="Hola";
        return txt;
    }
    //punto 2
    public void punto2(){
         txt = "hola";
            System.out.println("The length of the txt string is: " + txt.length());
    }
    //punto 3
    public String punto3(){
         txt="hello";
        prueba=txt.toUpperCase();
        return prueba;
    }
    //punto 4
    public void punto4(){
         firstname="jhon";
         lastname="doe";
            System.out.println(firstname + " " + lastname);
    }
    //punto 5
    public String punto5(){
         firstname = "John ";
         lastname = "Doe";
              prueba=firstname.concat(lastname);
        return prueba; 
    }
    //punto 6
    public void punto6(){
        txt="Hello Everybody";
        System.out.println(txt.indexOf("e"));
    }
}
