/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermain;

import java.lang.*;
import java.util.*;
import javax.swing.*;
public class Tallermain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       taller1 obj1 = new taller1();
       taller2 obj2 = new taller2(); 
       taller3 obj3 = new taller3();
       taller4 obj4 = new taller4();
       
           int opcion,opcion2;
          
           String menu="***MENU***\n elija el ejercicio que desea hacer\n1. taller 1\n2. taller 2\n3. taller 3\n4. taller 4\n5. salir";
           String menu1="***TALLER 1***\n1. punto 1\n2. punto 3\n3. punto 4\n4. punto 5\n 5. punto 6\n6. punto 7\n7. punto 8\n8. punto 10\n9. punto 11 - 12\n10. punto 13-14\n11. salir ";
           String menu2="***TALLER 2***\n1. punto 1\n2. punto 2\n3. punto 3 \n4. punto 4 \n5. punto 5 \n6. punto 6 \n7. punto 7 \n8. salir";
           String menu3="***TALLER 3***\n1. punto 1\n2. punto 2\n3. punto 3 \n4. punto 4 \n5. punto 5 \n6. punto 6 \n 7. salir";
           String menu4="***TALLER 4***\n1. punto 1\n2. punto 2\n3. punto 3 \n4. punto 4 \n5. punto 5 \n6. salir";
           do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                //taller 1
                case 1:do{
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu1));
                    switch(opcion2){
                        case 1:obj1.punto1();
                            break;
                        case 2:obj1.punto3();
                            break;
                        case 3:obj1.punto4();
                            break;
                        case 4:obj1.punto5();
                            break;
                        case 5:obj1.punto6();
                            break;
                        case 6:obj1.punto7();
                            break;
                        case 7:obj1.punto8();
                            break;
                        case 8:obj1.punto10();
                            break;
                        case 9:obj1.punto1112();
                            break;
                        case 10:obj1.punto1314();
                            break;
                        case 11:System.exit(0);
                            break;
                        default: JOptionPane.showMessageDialog(null,"opcion no es valida");
                    }
                }while(opcion2!=11);
                    break;
                //taller 2
                case 2:do{
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu2));
                    switch(opcion2){
                        case 1:obj2.punto1();
                            break;
                        case 2:obj2.punto2();
                            break;
                        case 3:obj2.punto3();
                            break;
                        case 4:obj2.punto4();
                            break;
                        case 5:obj2.punto5();
                            break;
                        case 6:obj2.punto6();
                            break;
                        case 7:obj2.punto7();
                            break;
                        case 8:
                            break;
                        default: JOptionPane.showMessageDialog(null,"opcion no es valida");
                    }
                }while(opcion2!=8);
                    break;
                //taller 3
                case 3:
                    do{
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu3));
                    switch(opcion2){
                        case 1:obj3.punto1();
                            break;
                        case 2:obj3.punto2();
                            break;
                        case 3:obj3.punto3();
                            break;
                        case 4:obj3.punto4();
                            break;
                        case 5: obj3.punto5();
                            break;
                        case 6: obj3.punto6();
                            break;
                        case 7:System.exit(0);
                            break;
                        default: JOptionPane.showMessageDialog(null,"opcion no es valida");
                    }
                }while(opcion!=7);
                    break;
                //taller 4
                case 4:
                    do{
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu4));
                    switch(opcion2){
                        case 1:obj4.punto1();
                            break;
                        case 2:obj4.punto2();
                            break;
                        case 3:obj4.punto3();
                            break;
                        case 4:obj4.punto4();
                            break;
                        case 5:obj4.punto5();
                            break;
                        case 6:System.exit(0);
                            break;
                        default: JOptionPane.showMessageDialog(null,"opcion no es valida");
                    }
                }while(opcion!=6);
                    break;
                default: JOptionPane.showMessageDialog(null,"opcion no es valida");
            }
        }while(opcion!=5);
    }
}