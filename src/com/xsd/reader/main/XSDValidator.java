/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsd.reader.main;

import com.xsd.reader.parser.FromXMLToXSDParser;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class XSDValidator {

    public static void main(String[] args) {
        FromXMLToXSDParser xsdParser= new FromXMLToXSDParser("src/com/xsd/files/students.xml");
        try{
            if(xsdParser.parseXML()){
                System.out.println("Termino de convertir");
            }else{
                System.out.println("No convirtio el xml");
            }
        }catch (Exception ex) {
            Logger.getLogger(XSDValidator.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
