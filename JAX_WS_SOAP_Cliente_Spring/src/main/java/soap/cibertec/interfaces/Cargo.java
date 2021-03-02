
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cargo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCargo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cargo", propOrder = {
    "idCargo",
    "nombreCargo"
})
public class Cargo {

    protected int idCargo;
    protected String nombreCargo;

    /**
     * Obtiene el valor de la propiedad idCargo.
     * 
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * Define el valor de la propiedad idCargo.
     * 
     */
    public void setIdCargo(int value) {
        this.idCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCargo() {
        return nombreCargo;
    }

    /**
     * Define el valor de la propiedad nombreCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCargo(String value) {
        this.nombreCargo = value;
    }

}
