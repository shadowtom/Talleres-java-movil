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
public class taller4 {
    //ingreso de variables
    int x,y,z;
    //punto 1
    public int punto1(){
         x=5;
         y=10;
        return Math.max(x, y);
    }
    //punto 2
    public double punto2(){
        x=16;
        return Math.sqrt(x);
    }
    //punto 3
    public double punto3(){
        return Math.random();
    }
    //punto 4
    public void punto4(){
        boolean isJavaFun=true;
        boolean isFishTasty=false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
    //punto 5
    public boolean punto5(){
        x=10;
        y=9;
        return x>y;
    }
    
    
}
