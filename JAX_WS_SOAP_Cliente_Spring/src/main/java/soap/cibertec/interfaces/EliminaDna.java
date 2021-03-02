
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminaDna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminaDna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminaDna", propOrder = {
    "codigoDna"
})
public class EliminaDna {

    protected int codigoDna;

    /**
     * Obtiene el valor de la propiedad codigoDna.
     * 
     */
    public int getCodigoDna() {
        return codigoDna;
    }

    /**
     * Define el valor de la propiedad codigoDna.
     * 
     */
    public void setCodigoDna(int value) {
        this.codigoDna = value;
    }

}
