/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsd.reader.parser;

import java.io.File;
import java.util.logging.SimpleFormatter;
import org.wiztools.xsdgen.XsdGen;

/**
 *
 * @author Cesar
 */
public class FromXMLToXSDParser {
    
    String path;
    File file;
    
    public FromXMLToXSDParser(String path){
        this.path=path;
        file= new File(path);
    }
    
    public boolean parseXML() throws Exception{
        XsdGen xsdGeneretor= new XsdGen();
        SimpleFormatter format= new SimpleFormatter();
        StringBuilder sb= new StringBuilder();
        String generatedXSD=xsdGeneretor.parse(file).toString();
        System.out.println(generatedXSD);
        return generatedXSD!=null;
    }
}
