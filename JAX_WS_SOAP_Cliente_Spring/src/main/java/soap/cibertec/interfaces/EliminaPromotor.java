
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminaPromotor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminaPromotor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminaPromotor", propOrder = {
    "codigoPromotor"
})
public class EliminaPromotor {

    protected int codigoPromotor;

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

}
