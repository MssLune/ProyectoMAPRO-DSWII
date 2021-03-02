
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para distrito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="distrito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDistrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://interfaces.cibertec.soap/}provincia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distrito", propOrder = {
    "idDistrito",
    "nombreDistrito",
    "provincia"
})
public class Distrito {

    protected int idDistrito;
    protected String nombreDistrito;
    protected Provincia provincia;

    /**
     * Obtiene el valor de la propiedad idDistrito.
     * 
     */
    public int getIdDistrito() {
        return idDistrito;
    }

    /**
     * Define el valor de la propiedad idDistrito.
     * 
     */
    public void setIdDistrito(int value) {
        this.idDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDistrito() {
        return nombreDistrito;
    }

    /**
     * Define el valor de la propiedad nombreDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDistrito(String value) {
        this.nombreDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvincia(Provincia value) {
        this.provincia = value;
    }

}
