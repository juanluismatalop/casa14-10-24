package casaJuanLuis;

import javax.xml.bind.JAXBContext;

import org.eclipse.persistence.internal.oxm.Unmarshaller;

import casaJuanLuis.Objetos.Persona;


public class UnmarshalingXml {
    public static void main(String[] args) {
        JAXBContext jaxbContext;
        Persona persona;
        try{
            jaxbContext = JAXBContext.newInstance(persona.getClass());
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Personas personas = (Personas)unmarshaller(new File("persona.xml"));
            System.out.println("--++==Persona==++--");
            System.out.println(personas.toString);
            System.out.println("--++==Fin==++--");
        }catch(Exception e){}
    }
}
