
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para expediente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="expediente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idExpediente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expediente", propOrder = {
    "codigoPromotor",
    "estado",
    "idDna",
    "idExpediente"
})
public class Expediente {

    protected int codigoPromotor;
    protected String estado;
    protected int idDna;
    protected int idExpediente;

    /**
     * Obtiene el valor de la propiedad codigoPromotor.
     * 
     */
    public int getCodigoPromotor() {
        return codigoPromotor;
    }

    /**
     * Define el valor de la propiedad codigoPromotor.
     * 
     */
    public void setCodigoPromotor(int value) {
        this.codigoPromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad idDna.
     * 
     */
    public int getIdDna() {
        return idDna;
    }

    /**
     * Define el valor de la propiedad idDna.
     * 
     */
    public void setIdDna(int value) {
        this.idDna = value;
    }

    /**
     * Obtiene el valor de la propiedad idExpediente.
     * 
     */
    public int getIdExpediente() {
        return idExpediente;
    }

    /**
     * Define el valor de la propiedad idExpediente.
     * 
     */
    public void setIdExpediente(int value) {
        this.idExpediente = value;
    }

}
