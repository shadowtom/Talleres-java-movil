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
public class taller2 {
    public void punto1(){
        int x=50;
        int y=10;
        if(x>y){
            System.out.println("Hello world");
        }
    }
    public void punto2(){
        int x=50;
        int y=10;
        if(x==y){
            System.out.println("Hello world");
        }
    }
    public void punto3(){
        int x=50;
        int y=50;
        if(x==y){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public void punto4(){
        int x=50,y=50;
        if(x==y){
            System.out.println("1");
        }else if(x>y){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
    }
    public void punto5(){
        int time=20;
        String result=(time<18)?"Good day.":"Good evening";
        System.out.println(result);
    }
    public void punto6(){
        int day=4;
        switch (day) {
             case 1:
                System.out.println("Monday");
             break;
             case 2:
                System.out.println("Tuesday");
             break;
             case 3:
                System.out.println("Wednesday");
             break;
             case 4:
                System.out.println("Thursday");
             break;
             case 5:
                System.out.println("Friday");
             break;
             case 6:
                System.out.println("Saturday");
             break;
             case 7:
                System.out.println("Sunday");
             break;
        }
    }
    public void punto7(){
        int day = 4;
            switch (day) {
                case 6:
                    System.out.println("Today is Saturday");
                break;
                case 7:
                    System.out.println("Today is Sunday");
                break;
                default:
                    System.out.println("Looking forward to the Weekend");
}
    }
}
