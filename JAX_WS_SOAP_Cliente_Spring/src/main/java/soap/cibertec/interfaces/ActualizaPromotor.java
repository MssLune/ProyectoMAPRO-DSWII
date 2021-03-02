
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaPromotor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaPromotor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotor" type="{http://interfaces.cibertec.soap/}promotor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaPromotor", propOrder = {
    "promotor"
})
public class ActualizaPromotor {

    protected Promotor promotor;

    /**
     * Obtiene el valor de la propiedad promotor.
     * 
     * @return
     *     possible object is
     *     {@link Promotor }
     *     
     */
    public Promotor getPromotor() {
        return promotor;
    }

    /**
     * Define el valor de la propiedad promotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotor }
     *     
     */
    public void setPromotor(Promotor value) {
        this.promotor = value;
    }

}
