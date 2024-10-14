package casaJuanLuis.Objetos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personas {
    @XmlElement(name="persona");
    private List<Persona> personas;


    public Personas() {
    }


    public Personas(List<Persona> personas) {
        this.personas = personas;
    }


    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    
    
    
}
