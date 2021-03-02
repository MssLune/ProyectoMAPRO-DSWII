
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaDna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaDna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dna" type="{http://interfaces.cibertec.soap/}dna" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaDna", propOrder = {
    "dna"
})
public class ActualizaDna {

    protected Dna dna;

    /**
     * Obtiene el valor de la propiedad dna.
     * 
     * @return
     *     possible object is
     *     {@link Dna }
     *     
     */
    public Dna getDna() {
        return dna;
    }

    /**
     * Define el valor de la propiedad dna.
     * 
     * @param value
     *     allowed object is
     *     {@link Dna }
     *     
     */
    public void setDna(Dna value) {
        this.dna = value;
    }

}
