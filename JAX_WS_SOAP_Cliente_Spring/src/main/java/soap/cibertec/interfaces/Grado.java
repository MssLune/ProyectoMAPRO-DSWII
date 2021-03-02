
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGrado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreGrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grado", propOrder = {
    "idGrado",
    "nombreGrado"
})
public class Grado {

    protected int idGrado;
    protected String nombreGrado;

    /**
     * Obtiene el valor de la propiedad idGrado.
     * 
     */
    public int getIdGrado() {
        return idGrado;
    }

    /**
     * Define el valor de la propiedad idGrado.
     * 
     */
    public void setIdGrado(int value) {
        this.idGrado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreGrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreGrado() {
        return nombreGrado;
    }

    /**
     * Define el valor de la propiedad nombreGrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreGrado(String value) {
        this.nombreGrado = value;
    }

}
