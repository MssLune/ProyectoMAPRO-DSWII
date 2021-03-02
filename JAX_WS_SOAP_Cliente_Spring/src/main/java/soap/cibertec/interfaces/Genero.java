
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para genero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="genero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGenero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genero", propOrder = {
    "idGenero",
    "nombreGenero"
})
public class Genero {

    protected int idGenero;
    protected String nombreGenero;

    /**
     * Obtiene el valor de la propiedad idGenero.
     * 
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * Define el valor de la propiedad idGenero.
     * 
     */
    public void setIdGenero(int value) {
        this.idGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreGenero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreGenero() {
        return nombreGenero;
    }

    /**
     * Define el valor de la propiedad nombreGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreGenero(String value) {
        this.nombreGenero = value;
    }

}
