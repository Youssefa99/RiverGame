/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlSaver;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import mygame.Icrosser;

/**
 *
 * @author feras
 */
public class XMLHandler {
    
    static String fileName = "scene.xml";
    
    
    
    public static boolean saveToFile(ArrayList<Icrosser> left, ArrayList<Icrosser> right, int xpos) throws JAXBException{
     
        try{
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(ArrayList.class); 
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File(fileName);
            //Writes XML file to file-system
            jaxbMarshaller.marshal(left, file);
            jaxbMarshaller.marshal(right, file);
            
        }
        catch(JAXBException e){
            e.printStackTrace();
        }
       return true; 
    }
    
    
}
