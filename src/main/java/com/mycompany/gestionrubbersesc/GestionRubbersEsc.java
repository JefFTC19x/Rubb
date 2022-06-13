/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionrubbersesc;

import com.companyRubbers.srl.Conexion_bd_rbrs;

/*@author Jefferson Torres*/
public class GestionRubbersEsc 
{
    public static void main(String[] args) 
    {
        Conexion_bd_rbrs logear = new Conexion_bd_rbrs();         
        logear.setVisible(true);
    }
}
